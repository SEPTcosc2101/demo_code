Feature: Plus operator should add 2 numbers
	User wants to add two numbers together

	Scenario: <int1> add <int2> is <answer>
		Given <int1> and <int2>
		When I add them up
		Then I should get <answer>
	Examples:
		| int1 | int2 | answer |
		| 0    | 2    | 2      |
		| 2    | 0    | 2      |
		| 2    | 2    | 4      |
		| 10   | 2    | 12     |
