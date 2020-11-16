package state;

public class CopyClient {
    Xerox xerox;

    public void setXerox(Xerox xerox) {
        this.xerox = xerox;
    }

    void nextActivity() {
        if (xerox instanceof GiveMeMoney) {
            setXerox(new SelectSourceState());
            return;
        }
        if (xerox instanceof SelectSourceState) {
            setXerox(new SelectDocumentState());
            return;
        }
        if (xerox instanceof SelectDocumentState) {
            setXerox(new PrintDocumentState());
            return;
        }
        if (xerox instanceof PrintDocumentState) {
            setXerox(new GiveMeCashState());
            return;
        }
    }

    public void justDoIt() {
        xerox.justDoIt();
    }

}
