package state;

public class CopyClient {
    Xerox xerox;

    public void setXerox(Xerox xerox) {
        this.xerox = xerox;
    }

    void nextActivity() {
        if (xerox instanceof GiveMeMoney)
            setXerox(new SelectSourceState());
        if (xerox instanceof SelectSourceState)
            setXerox(new SelectDocumentState());
        if (xerox instanceof SelectDocumentState)
            setXerox(new PrintDocumentState());
        if (xerox instanceof PrintDocumentState)
            setXerox(new GiveMeCashState());
    }
  public   void justDoIt() {
      xerox.justDoIt();
  }

}
