class Graph {
    constructor(){
        this.numberOfNodes = 0
        this.ajacentList = {}
    }

    addVertex(node){
        if(!(node in this.ajacentList)){
            this.ajacentList[node] = []
            this.numberOfNodes ++
            return true
        }
        return false
    }

    addEdge(node1, node2){
        if(node1 in this.ajacentList && node2 in this.ajacentList){
            this.ajacentList[node1].push(node2)
            this.ajacentList[node2].push(node1)
            return true
        }
        return false
    }

    showConnections(){
        const allNodes = Object.keys(this.ajacentList);
        for(let node of allNodes){
            let nodeConnection = this.ajacentList[node]
            let connections = ""
            let vertex;
            for(vertex of nodeConnection){
                connections += vertex + " ";
            }
            console.log(node + "-->" + connections)
        }
    }
}

const myGraph = new Graph()
console.log(myGraph.addVertex('0'))
console.log(myGraph.addVertex('1'))
console.log(myGraph.addVertex('2'))
console.log(myGraph.addVertex('3'))
console.log(myGraph.addVertex('4'))
console.log(myGraph.addVertex('5'))
console.log(myGraph.addVertex('6'))
console.log(myGraph.addEdge('3', '1'));
console.log(myGraph.addEdge('3', '4')); 
console.log(myGraph.addEdge('4', '2'));
console.log(myGraph.addEdge('4', '5'));
console.log(myGraph.addEdge('1', '2'));
console.log(myGraph.addEdge('1', '0'));
console.log(myGraph.addEdge('0', '2'));
console.log(myGraph.addEdge('6', '5'));
console.log(myGraph);