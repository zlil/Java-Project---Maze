package view;

import algorithms.mazeGenerators.Maze3d;
import algorithms.mazeGenerators.Position;
import algorithms.search.Solution;

public interface View {

	//this command displays every files in the current path
	void dir(String string);

	//this command prints the given maze 
	void displayMaze(Maze3d current);

	//notify the user the maze is ready after generates new Maze3D
	void mazeIsReady(String string);
	
	//print cross section 
	void printCrossSection(int[][] crossSection);

	//prints the size of the maze in memory
	void printMazeSize(long size);

	//notify the user that the solution for his maze is ready
	void solutionIsReady(String name);

	//print the solution
	void printSolution(Solution<Position> solution);
}
