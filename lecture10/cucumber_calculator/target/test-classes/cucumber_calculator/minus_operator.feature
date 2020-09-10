Feature: Minus operator should subtract the rigth number from the left number
	User wants to subtract two numbers

	Scenario: <int1> minus <int2> is <answer>
		Given <int1> and <int2>
		When I subtract <int2> from <int>
		Then I should get <answer>
	Examples:
		| int1 | int2 | answer |
		| 2    | 0    | 2      |
		| 2    | 1    | 1      |
		| 2    | 2    | 0      |
		| 10   | 2    | 8      |
