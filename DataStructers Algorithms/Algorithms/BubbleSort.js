const arrray = [7, 9, 10, 5, 3, 8, 11]

function bubbleSort(arrray) {
    var length = arrray.length
    for (let i = 0; i < length; i++) {
        for (let j = 0; j < length; j++) {
            if (arrray[j] > arrray[j + 1]) {
                temp = arrray[j + 1]
                arrray[j + 1] = arrray[j]
                arrray[j] = temp
            }
        }
        length--
    }

    return arrray
}

console.log(bubbleSort(arrray));