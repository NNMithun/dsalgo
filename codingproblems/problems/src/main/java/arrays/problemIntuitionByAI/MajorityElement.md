Great one! The **Majority Element problem** is a classic (LeetCode 169). Let’s go step by step and build both intuition and efficient solutions.

---

## **Problem Statement**

Given an array `nums` of length `n`, find the **majority element** — the element that appears **more than ⌊n/2⌋ times**.
It is guaranteed that such an element always exists.

Example:

* Input: `[3,2,3]` → Output: `3`
* Input: `[2,2,1,1,1,2,2]` → Output: `2`

---

## **Solution Approaches**

### 1️⃣ Brute Force (Naive)

* For each element, count how many times it appears.
* If count > n/2 → return it.
* **Time:** O(n²), **Space:** O(1).

---

### 2️⃣ HashMap (Frequency Count)

* Use a map to count frequencies of elements.
* Return the one with frequency > n/2.

**Algorithmic Steps:**

1. Initialize `map = {}`.
2. For each element in `nums`:

    * Increment its count in `map`.
3. For each entry in `map`:

    * If `count > n/2`, return that key.

**Time:** O(n), **Space:** O(n).

---

### 3️⃣ Sorting

* Sort the array.
* The majority element will always occupy the **middle position** (`nums[n/2]`) because it appears more than n/2 times.

**Time:** O(n log n), **Space:** O(1).

---

### 4️⃣ Boyer–Moore Voting Algorithm (Optimal)

This is the famous trick: O(n) time, O(1) space.

**Algorithmic Steps:**

1. Initialize `candidate = None`, `count = 0`.
2. For each element `num` in `nums`:

    * If `count == 0`, set `candidate = num`.
    * If `num == candidate`, increment `count`.
    * Else decrement `count`.
3. At the end, `candidate` is the majority element.

**Why it works?**

* The majority element has more than half the votes.
* Pairing each different element cancels a vote, but the majority cannot be fully canceled.

**Time:** O(n), **Space:** O(1).

---

## **Example Walkthrough with Boyer-Moore**

Input: `[2,2,1,1,1,2,2]`

* Start: `candidate = None, count = 0`
* num=2 → count=0 → candidate=2, count=1
* num=2 → candidate=2 → count=2
* num=1 → candidate=2 ≠ 1 → count=1
* num=1 → candidate=2 ≠ 1 → count=0
* num=1 → count=0 → candidate=1, count=1
* num=2 → candidate=1 ≠ 2 → count=0
* num=2 → count=0 → candidate=2, count=1

Final: `candidate = 2` → majority element. ✅

---

## **Best Choice**

👉 Use **Boyer–Moore Voting Algorithm** if you want optimal performance.
👉 Use **HashMap** if you want a simpler, more intuitive solution (still O(n)).

---

Do you want me to **write out the Java code for Boyer–Moore** step by step (with microscopic reasoning like we did for LCP)?
