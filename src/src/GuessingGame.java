class GuessingGame {
    public int answer;
    public int min;
    public int max;

    public GuessingGame(int min, int max) {
		GuessingGame g=new GuessingGame(min,max);
	int res=g.guess();
	answer=(min+max)/2;
	int guessnum=42;
	if(res >guessnum)
	{
	 g.lower();
	 }
	else 
	{
	g.higher();
	}
    }

    public int guess() {
		Random rand = new Random();
	 int value = rand.nextInt(max); 
        return value;
        
    }

    public void lower() {
		max=answer-1;
    }

    public void higher() {
		min=answer+1;
    }
}
