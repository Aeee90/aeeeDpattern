package blog.aeee.d_pattern.structural.facade

class ProgramNodeBuilder {

    fun newVariable(variableName: String): ProgramNode{
        //Do Something with variableName
        return ProgramNode()
    }

    fun newAssignment(variable: ProgramNode, expression: ProgramNode): ProgramNode{
        //Do Something with variable and expression ProgramNode
        return ProgramNode()
    }

    fun newReturnStatement(value: ProgramNode): ProgramNode{
        return ProgramNode()
    }

    fun newCondition(condition: ProgramNode, truePart: ProgramNode, falsePart: ProgramNode): ProgramNode{
        return ProgramNode()
    }


    class ProgramNode{}
}