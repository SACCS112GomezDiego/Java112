
public class Dice {
	int m_dice;
	int m_total;
	public Dice(int dice){
		m_dice = dice;
	}
	public int Roll() {
		m_total =	(1 + (int) (Math.random() * 6))* m_dice;//roll and * by # of dice
		return m_total;
		}
	public void setDice(int NumOfDice){
		m_dice = NumOfDice;
	}
}
