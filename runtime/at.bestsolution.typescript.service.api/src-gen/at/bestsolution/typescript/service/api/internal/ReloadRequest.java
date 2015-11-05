package at.bestsolution.typescript.service.api.internal;


public class ReloadRequest {
	private String file;
	private String tmpfile;

	public ReloadRequest(String file, String tmpfile) {
		this.file = file;
		this.tmpfile = tmpfile;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public String getFile() {
		return this.file;
	}
	public void setTmpfile(String tmpfile) {
		this.tmpfile = tmpfile;
	}

	public String getTmpfile() {
		return this.tmpfile;
	}
}