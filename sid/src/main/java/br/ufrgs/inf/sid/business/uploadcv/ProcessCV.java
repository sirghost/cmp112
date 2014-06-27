package br.ufrgs.inf.sid.business.uploadcv;

import br.ufrgs.inf.sid.business.util.Message;

public interface ProcessCV {
	public Message loadFile(CvFile cv);
}