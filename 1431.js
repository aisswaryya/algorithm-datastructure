/**
 * @param {number[]} candies
 * @param {number} extraCandies
 * @return {boolean[]}
 */
const kidsWithCandies = (candies, extraCandies, max = Math.max(...candies)) =>
    candies.map((candy) => candy + extraCandies >= max);
