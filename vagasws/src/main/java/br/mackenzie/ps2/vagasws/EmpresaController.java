package br.mackenzie.ps2.vagasws;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@RestController
public class EmpresaController {
    private List<Empresa> empresas = new ArrayList<>();
    public EmpresaController() {
        empresas.add(new Empresa(1, "Empresa Alfa LTDA", "12.345.678/0001-90", "contato@empresa-alfa.com"));
        empresas.add(new Empresa(2, "Beta Comércio ME", "98.765.432/0001-10", "beta@comercio.com"));
        empresas.add(new Empresa(3, "Gamma Serviços S.A.", "11.222.333/0001-44", "servicos@gamma.com"));
        empresas.add(new Empresa(4, "Delta Engenharia", "22.333.444/0001-55", "contato@deltaeng.com"));
    }

    @GetMapping("/fci/api/empresas")
    public Iterable<Empresa> getEmpresas() {
        return empresas;
    }

    @GetMapping("/fci/api/empresas/{id}")
    public Empresa getEmpresa(@PathVariable long id) {
        Empresa resposta = null;
        for (Empresa e : empresas) {
            if (e.getId() == id) {
                resposta = e;
                break;
            }
        }
        return resposta;
    }

    @PostMapping("/fci/api/empresas")
    public Empresa createEmpresa(@RequestBody Empresa novaEmpresa) {
        long maiorId = 1;
        for (Empresa e : empresas) {
            if (e.getId() > maiorId) {
                maiorId = e.getId();
            }        
        }
        long novoId = maiorId + 1;
        novaEmpresa.setId(novoId);
        empresas.add(novaEmpresa);
        return novaEmpresa;
    }
}
