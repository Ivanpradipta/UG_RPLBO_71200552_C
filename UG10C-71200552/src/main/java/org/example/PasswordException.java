
public class PasswordException extends Exception {

    private int code;
    private String error;

    public PasswordException(int code) {
        // TODO Auto-generated constructor stub
        super();
        this.code = code;
        if(code == 1) {
            this.error = "Input password tidak boleh kosong";
        }
        else if(code == 2) {
            this.error = "Password minimal harus 7 karakter";
        }
        else if(code == 3) {
            this.error = "Password minimal harus mengandung 1 karakter huruf kecil, huruf besar"
                    + " simbol, dan angka";
        }
        else if (code == 4) {
            this.error = "Password tidak boleh sama dengan username";
        }
        else if (code == 5) {
            this.error = "Password harus sama dengan konfirmasi password";
        }
    }

}
