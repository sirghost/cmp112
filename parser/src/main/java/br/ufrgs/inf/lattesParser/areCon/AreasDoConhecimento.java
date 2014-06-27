package br.ufrgs.inf.lattesParser.areCon;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//TODO: Improve 1-2-3-...
@XmlRootElement(name="AREAS-DO-CONHECIMENTO")
public class AreasDoConhecimento {
	
	private AreaDoConhecimento1 areaDoConhecimento1;
	private AreaDoConhecimento2 areaDoConhecimento2;
	private AreaDoConhecimento3 areaDoConhecimento3;

	@XmlElement(name="AREA-DO-CONHECIMENTO-1")
	public AreaDoConhecimento1 getAreaDoConhecimento1() {
		return areaDoConhecimento1;
	}
	public void setAreaDoConhecimento1(AreaDoConhecimento1 areaDoConhecimento1) {
		this.areaDoConhecimento1 = areaDoConhecimento1;
	}
	
	@XmlElement(name="AREA-DO-CONHECIMENTO-2")
	public AreaDoConhecimento2 getAreaDoConhecimento2() {
		return areaDoConhecimento2;
	}
	public void setAreaDoConhecimento2(AreaDoConhecimento2 areaDoConhecimento2) {
		this.areaDoConhecimento2 = areaDoConhecimento2;
	}
	
	@XmlElement(name="AREA-DO-CONHECIMENTO-3")
	public AreaDoConhecimento3 getAreaDoConhecimento3() {
		return areaDoConhecimento3;
	}
	public void setAreaDoConhecimento3(AreaDoConhecimento3 areaDoConhecimento3) {
		this.areaDoConhecimento3 = areaDoConhecimento3;
	}	
}