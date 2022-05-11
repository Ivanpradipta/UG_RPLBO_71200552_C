
public class EmailException extends Exception {
    private int code;
    private String error;

    public EmailException(int code) {
        // TODO Auto-generated constructor stub
        super();
        this.code = code;
        if(code == 1) {
            this.error = "email tidak boleh kosong";
        }
        else if(code == 2) {
            this.error = "format email harus valid";
        }
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }


}
