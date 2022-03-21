public abstract class choice {

    String choice;
    String winsAgainst;
    String loseAgainst;

    public boolean compareTo(choice currentChoice) {
        return (((this.winsAgainst).toLowerCase()).equals
                (currentChoice.choice.toLowerCase()));
    }

}
