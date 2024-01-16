class Node{
    constructor(key, value){
        this.value = value,
        this.key = key,
        this.next = null
    }
}
class HashTable {
    constructor(size) {
        this.data = new Array(size);
    }

    //Chuyển đổi sang dạng băm
    _hash(key) {
        let hash = 0;
        for (let i = 0; i < key.length; i++) {
            hash = (hash + key.charCodeAt(i) * i) %
                this.data.length;
        }
        return hash;
    }

    set(key, value) {
        let address = this._hash(key)
        if (!this.data[address]) {
            this.data[address] = []
        }
        this.data[address].push([key, value])
        return this.data
    }

    get(key) {
        let address = this._hash(key)
        const currenBacket = this.data[address]
        console.log(currenBacket)
        if (currenBacket) {
            for (let i = 0; i < currenBacket.length; i++) {
                if (currenBacket[i][0] === key) {
                    return currenBacket[i][1]
                }
            }
        }
        return undefined
    }
}

const myHashTable = new HashTable(2);
console.log(myHashTable.set('grapes', 10000))
console.log(myHashTable.get('grapes'))

/*
    duyệt qua toàn bộ phần tử -> phần tử sau khi duyệt đc thêm vào 1 mảng (M1)
    so sánh nếu phần tử duyệt tiếp theo = phần tử có trong mảng M1 thì dừng
    còn không tiếp tục rồi in ra undefined
*/

// const arr2 = [2, 1, 1, 2, 3, 5, 1, 2, 4]
// const arr3 = [2, 3, 4, 5]
// function ex(arr) {
//     const arrTemp = [];
//     for (let i = 0; i < arr.length; i++) {
//         if (arrTemp.includes(arr[i])) {
//             return arr[i]
//         }
//         arrTemp.push(arr[i]);
//     }
//     return undefined;
// }

// console.log(ex(arr3))









function firstRecurringCharacter(input) {
    // Mảng để lưu trữ thông tin về các số đã xem qua
    let seenNumbers = [];

    for (let i = 0; i < input.length; i++) {
        for (let j = 0; j < seenNumbers.length; j++) {
            // Kiểm tra xem số hiện tại đã xuất hiện trước đó hay chưa
            if (input[i] === seenNumbers[j]) {
                return input[i];
            }
        }

        // Nếu số hiện tại chưa xuất hiện, thêm nó vào mảng seenNumbers
        seenNumbers.push(input[i]);
    }

    // Nếu không có số lặp lại, trả về undefined
    return undefined;
}
const arr = [2, 5, 5, 2, 3, 5, 1, 2, 4]

// console.log(firstRecurringCharacter(arr)) 



