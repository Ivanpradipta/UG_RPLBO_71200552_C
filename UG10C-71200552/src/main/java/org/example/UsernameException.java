
public class UsernameException extends Exception{

    private int code;
    private String error;

    public UsernameException(int code) {
        // TODO Auto-generated constructor stub
        super();
        this.code = code;
        if(code == 1) {
            this.error = "username tidak boleh kosong";
        }
        else if(code == 2) {
            this.error = "username minimal harus 6 karakter";
        }
    }

    public UsernameException(String error) {
        super(error);
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
