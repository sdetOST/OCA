package Q059;

public class Planet {
	public String name;
	public int moons;

	public Planet(String name, int moons){
		this.name = name;
		this.moons = moons;
		}

	public static void main(String[] args) {
		Planet[] planets = { new Planet("Mercury", 0), new Planet("Venus", 0), new Planet("Earth", 1),
				new Planet("Mars", 2), };
		System.out.println(planets);
		System.out.println(planets[2]);
		System.out.println(planets[2].moons);
	}
}
/*
	What is
	the output?
	A)		planets  
			Earth 
			1 
	B)		[LPlanets.Planet;@15db9742 
			Earth 
			1 
	C)		[LPlanets.Planet;@15db9742               ???????????????????????
			Planets.Planet @6d 06d 69 c 
			1 
	D)	[LPlanets.Planet;@15db9742
		 	Planets.Planet @6d06d69c
		 	[Planets.Moon;@7852e922 
	E)		[Planets.Planet @@15db9742 
			Venus 
			0
	A. Option A
	B. Option B
	C. Option C
	D. Option D
	E.Option E 
	
	ANSWER:	C
	*got same
*/
