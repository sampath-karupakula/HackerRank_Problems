function hour_glass_sum(matrix) {
    let max = -9999;
    for (let r = 0; r < 4; r++) {
        for (let c = 0; c < 4; c++) {
            let total = m[r][c] +
                m[r][c + 1] +
                m[r][c + 2] +
                m[r + 1][c + 1] +
                m[r + 2][c] +
                m[r + 2][c + 1] +
                m[r + 2][c + 2];
            if (total > max)
                max = total;
        }
    }
}