const arr = [3, 2, 1, 3];
function test(arr) {
    const max = arr.reduce((a, b) => Math.max(a, b), -Infinity);
    // console.log(max);
    const result = arr.filter((e=> e === max))
    console.log(result.length);
}
// staircase(6)
test(arr)