package ATM;

public class ATM {
    States currentState ;

    public ATM(States currentState) {
        this.currentState = currentState;
    }

    States setState(States state) {
        this.currentState = state;
        return currentState;
    }

    void insertCard() {
        currentState.insertCard();
    }
    void chooseOptions() {
        currentState.chooseOptions();
    }
    void exit() {
        currentState.exit();
    }
}
