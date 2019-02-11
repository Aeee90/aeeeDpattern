package blog.aeee.d_pattern.maze.define

import lombok.Getter

enum class Direction {
    North(0), East(1), South(2), West(3);

    @Getter
    private val value: Int

    private constructor(value: Int){
        this.value = value
    }
}