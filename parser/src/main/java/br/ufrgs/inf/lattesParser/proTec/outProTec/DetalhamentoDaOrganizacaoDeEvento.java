package br.ufrgs.inf.lattesParser.proTec.outProTec;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="DETALHAMENTO-DA-ORGANIZACAO-DE-EVENTO")
public class DetalhamentoDaOrganizacaoDeEvento {

	private String instituicaoPromotora;
	private String duracaoEmSemanas;
	private String flagEventoItinerante;
	private String flagCatalogo;
	private String local;
	private String cidade;
	
	@XmlAttribute(name="INSTITUICAO-PROMOTORA")
	public String getInstituicaoPromotora() {
		return instituicaoPromotora;
	}
	public void setInstituicaoPromotora(String instituicaoPromotora) {
		this.instituicaoPromotora = instituicaoPromotora;
	}
	
	@XmlAttribute(name="DURACAO-EM-SEMANAS")
	public String getDuracaoEmSemanas() {
		return duracaoEmSemanas;
	}
	public void setDuracaoEmSemanas(String duracaoEmSemanas) {
		this.duracaoEmSemanas = duracaoEmSemanas;
	}
	
	@XmlAttribute(name="FLAG-EVENTO-ITINERANTE")
	public String getFlagEventoItinerante() {
		return flagEventoItinerante;
	}
	public void setFlagEventoItinerante(String flagEventoItinerante) {
		this.flagEventoItinerante = flagEventoItinerante;
	}
	
	@XmlAttribute(name="FLAG-CATALOGO")
	public String getFlagCatalogo() {
		return flagCatalogo;
	}
	public void setFlagCatalogo(String flagCatalogo) {
		this.flagCatalogo = flagCatalogo;
	}
	
	@XmlAttribute(name="LOCAL")
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	
	@XmlAttribute(name="CIDADE")
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}	
}