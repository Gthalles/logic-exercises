    import java.util.Arrays;
    import java.util.LinkedList;
    import java.util.Queue;

    public class Grid {
        void printGrid(int[][] grid) {
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    var value = grid[i][j];
                    System.out.println("(" + i + ", " + j + ") =" + value);
                }
            }
        }

        void printNeighbors(int[][] grid, int i, int j) {
            var top = i - 1;
            var bottom = i + 1;
            var left = j - 1;
            var right = j + 1;

            var block = grid[i][j];
            System.out.println(block);

            if (i > 0) {
                System.out.println("top: " + top + "," + j + "\n");
            }

            if (i < grid.length - 1) {
                System.out.println("bottom: " + bottom + "," + j + "\n");
            }

            if (j > 0) {
                System.out.println("left: " + i + "," + left + "\n");
            }

            if (j < grid[0].length - 1) {
                System.out.println("right: " + i + "," + right + "\n");
            }
        }

        int[][] simplePropagate(int[][] grid) {
            var result = new int[grid.length][grid[0].length];

            for (int i = 0; i < grid.length; i++) {
                System.out.println(Arrays.toString(grid[i]));

                for (int j = 0; j < grid[0].length; j++) {
                    var currentElement = grid[i][j];

                    if (currentElement == 1) {
                        result[i][j] = 1;

                        var top = i - 1;
                        var bottom = i + 1;
                        var left = j -1;
                        var right = j + 1;

                        if (i > 0) {
                            var element = grid[top][j];
                            if (element != 1) {
                                result[top][j] = 1;
                            }
                        }

                        if (i < grid.length - 1) {
                            var element = grid[bottom][j];
                            if (element != 1) {
                                result[bottom][j] = 1;
                            }
                        }

                        if (j > 0) {
                            var element = grid[i][left];
                            if (element != 1) {
                                result[i][left] = 1;
                            }
                        }

                        if (j < grid[0].length - 1) {
                            var element = grid[i][right];
                            if (element != 1) {
                                result[i][right] = 1;
                            }
                        }
                    } else if (result[i][j] == 0){
                        result[i][j] = currentElement;
                    }
                }
            }

            System.out.println("\nResult\n");
            for (int i = 0; i < result.length; i++) {
                System.out.println(Arrays.toString(result[i]));
            }

            return result;
        }

        int[][] propagate(int[][] grid) {
            Queue<int[]> queue = new LinkedList<>();
            int[][] result = new int[grid.length][grid[0].length];

            for (int[] array : result) {
                Arrays.fill(array, -1);
            }

            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    var element = grid[i][j];

                    if (element == 1) {
                        result[i][j] = 0;
                        queue.add(new int[]{i, j, 0});
                    }
                }
            }

            while(!queue.isEmpty()) {
                var element = queue.poll();
                var i = element[0];
                var j = element[1];
                var dist = element[2];

                if (i > 0 && result[i - 1][j] == -1) {
                    result[i - 1][j] = dist + 1;
                    queue.add(new int[]{i - 1, j, dist + 1});
                }

                if (i < grid.length - 1 && result[i + 1][j] == -1) {
                    result[i +1][j] = dist + 1;
                    queue.add(new int[]{i + 1, j, dist + 1});
                }

                if (j > 0 && result[i][j - 1] == -1) {
                    result[i][j - 1] = dist + 1;
                    queue.add(new int[]{i, j - 1, dist + 1});
                }

                if (j < grid[0].length - 1 && result[i][j + 1] == -1) {
                    result[i][j + 1] = dist + 1;
                    queue.add(new int[]{i, j + 1, dist + 1});
                }
            }

            for (int[] array : result) {
                System.out.println(Arrays.toString(array));
            }

            return result;
        }

        int[][] propagateEnergy(String[][] grid) {
            if (grid.length == 0 || grid[0].length == 0) {
                return new int[0][0];
            }

            Queue<int[]> queue = new LinkedList<int[]>();
            var result = new int[grid.length][grid[0].length];

            int[][] directions = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};

            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    var element = grid[i][j];

                    if (!"S".equals(element)) continue;

                    result[i][j] = 15;
                    queue.add(new int[]{i, j, 15});
                }
            }

            while (!queue.isEmpty()) {
                var element = queue.poll();
                var i = element[0];
                var j = element[1];
                var energy = element[2];

                if (energy <= 1) continue;

                for (int[] direction : directions) {
                    var ni = i + direction[0];
                    var nj = j + direction[1];
                    var energyResult = energy - 1;

                    var isValidBlock = ni >= 0 && ni < grid.length && nj >= 0 && nj < grid[0].length;
                    if (!isValidBlock) continue;

                    var originalBlock = grid[ni][nj];
                    if (!"W".equals(originalBlock)) continue;

                    if (energyResult <= result[ni][nj]) continue;

                    result[ni][nj] = energyResult;
                    queue.add(new int[]{ni, nj, energyResult});
                }
            }

            for (int[] arr : result) {
                var stringArr = Arrays.toString(arr);
                System.out.println(stringArr);
            }

            return result;
        }
    }