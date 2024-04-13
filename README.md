# Rules

There are a series of lights in a row. Each light is either on or off. The lights are serially blinked in a pattern. Each successive pattern is based on the previous pattern. The pattern is based on a set of rules. The state of each light is based on its own state and the state of the light to its left and right.

The rules are as follows:

| Left | Center | Right | Result |
| ---- | ------ | ----- | ------ |
| ◼    | ◼      | ◼     | ◻      |
| ◼    | ◼      | ◻     | ◻      |
| ◼    | ◻      | ◼     | ◻      |
| ◼    | ◻      | ◻     | ◼      |
| ◻    | ◼      | ◼     | ◼      |
| ◻    | ◼      | ◻     | ◼      |
| ◻    | ◻      | ◼     | ◼      |
| ◻    | ◻      | ◻     | ◻      |

## Example

If the initial state is "◻◻◻◼◻◻◻", then the next state according to the rules will be "◻◻◼◼◼◻◻".

Explanation:

Consider groups of lights in 3. For the first and the last light, assume that the lights to the left and right are off.

| Number | Old State | Group | New State |
| ------ | --------- | ----- | --------- |
| 1      | ◻         | ◻◻◻   | ◻         |
| 2      | ◻         | ◻◻◻   | ◻         |
| 3      | ◻         | ◻◻◼   | ◼         |
| 4      | ◼         | ◻◼◻   | ◼         |
| 5      | ◻         | ◼◻◻   | ◼         |
| 6      | ◻         | ◻◻◻   | ◻         |
| 7      | ◻         | ◻◻◻   | ◻         |

# Objective

Write a program that receives a string of lights and the number of iterations. The program should print the state of the lights for each of the given number of iterations.

```bash
bb -m main "◻◻◻◼◻◻◻" 5
```

Should output

```
◻◻◻◼◻◻◻
◻◻◼◼◼◻◻
◻◼◼◻◻◼◻
◼◼◻◼◼◼◼
◼◻◻◼◻◻◻

```

Implement:

- main/main
- rules/process
- rules/display

`rules/process` and `rules/display` put together shouldn't be more than 15-20 lines. So don't overthink it.
