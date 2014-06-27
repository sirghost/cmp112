package br.ufrgs.inf.lattesParser;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class TestApp {
	
	public static void main(String[] args) {

        try {
            File file = new File("/home/jimmy/Agathon/curriculo.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(CurriculoVitae.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            CurriculoVitae cv = (CurriculoVitae) jaxbUnmarshaller.unmarshal(file);
            System.out.println(cv);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}