package inscricao.faces.mngbeans;

import inscricao.entity.Candidato;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import utfpr.faces.support.PageBean;

@ManagedBean
@ApplicationScoped
public class RegistroBean extends PageBean implements Serializable {
    
    private ArrayList<Candidato> CandidatosList = new ArrayList<>();
    private boolean mostraCandidato = false;
    private Candidato candidato;

    public ArrayList<Candidato> getCandidatosList() {
        return CandidatosList;
    }

    public void setCandidatosList(ArrayList<Candidato> CandidatosList) {
        this.CandidatosList = CandidatosList;
    }
    
    public void excluirCandidato (Candidato cand) {
        CandidatosList.remove(cand);
    }

    public boolean isMostraCandidato() {
        return mostraCandidato;
    }

    public void setMostraCandidato(boolean mostraCandidato) {
        this.mostraCandidato = mostraCandidato;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }
    
    public void exibeCandidato(Candidato candidato) {
        this.candidato = candidato;
        mostraCandidato = true;
    }
}