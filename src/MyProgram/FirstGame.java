/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyProgram;

/**
 *
 * @author 3z
 */
public class FirstGame extends GameInfo {

    private int playerScore;
    private int topScore = 500;

    public FirstGame(String name, String ID, int playerScore) {
        super(name, ID);
        setPlayerScore(playerScore);
        setTopScore(topScore);

    }

    public int getPlayerScore() {
        return playerScore;
    }

    public void setTopScore(int topScore) {
        if (playerScore > topScore) {
            this.topScore = topScore;
        }
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }

    public int getTopScore() {
        return topScore;
    }

    public String toString() {
        return String.format("%s | Your Score: %s | The Highest Score: %d ", super.toString(), playerScore, topScore);
    }

}
