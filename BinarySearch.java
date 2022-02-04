import static java.lang.System.out;
import java.util.Scanner;

class BinarySearch {
    static int cnt = 0;

    int search(int key, int[] list, int low, int high) {
        if (low > high) {
            return -1;
        }
        cnt++;
        int mid = (low + high) / 2;
        if (list[mid] == key) {
            return mid;
        }
        if (low == high) {
            return -1;
        } else if (key > list[mid]) {
            return search(key, list, mid + 1, high);
        } else
            return search(key, list, low, mid - 1);
    }

    public static void main(String args[]) {
        BinarySearch bs = new BinarySearch();
        Scanner s = new Scanner(System.in);
        int[] list = { 2, 4, 6, 7, 8, 12, 13, 14, 15, 16, 19, 24, 30, 33, 34, 37, 39, 41, 44, 45, 46, 47, 48, 49, 51,
                53, 56, 57, 64, 65, 67, 68, 69, 70, 72, 73, 74, 75, 76, 78, 80, 81, 82, 83, 89, 90, 91, 94, 95, 97, 98,
                100, 101, 103, 106, 107, 110, 112, 113, 115, 116, 118, 119, 122, 123, 124, 125, 127, 129, 131, 134, 135,
                136, 140, 141, 143, 144, 145, 149, 150, 152, 154, 155, 158, 159, 160, 163, 165, 167, 168, 169, 172, 173,
                174, 175, 178, 179, 184, 187, 190, 191, 194, 195, 198, 199, 202, 204, 205, 206, 207, 208, 210, 211, 212,
                216, 217, 222, 225, 226, 231, 233, 234, 236, 238, 240, 243, 249, 250, 251, 253, 254, 257, 258, 259, 261,
                262, 263, 264, 266, 267, 270, 271, 273, 275, 277, 282, 283, 284, 286, 287, 289, 296, 302, 303, 304, 306,
                307, 309, 310, 312, 315, 316, 317, 320, 322, 324, 325, 329, 331, 334, 337, 339, 344, 345, 346, 347, 349,
                351, 352, 357, 358, 359, 360, 362, 363, 364, 366, 368, 369, 371, 374, 375, 378, 379, 384, 385, 386, 387,
                388, 390, 394, 397, 398, 399, 400, 401, 403, 405, 406, 407, 409, 411, 412, 413, 415, 420, 421, 424, 425,
                426, 2601, 2603, 2604, 2605, 2606, 2607, 2608, 2609, 2611, 2614, 2617, 2619, 2620, 2622, 2623, 2624,
                2625, 2626, 2627, 2628,
                2631, 2632, 2637, 2639, 2640, 2641, 2643, 2645, 2646, 2648, 2649, 2650, 2651, 2652, 2658, 2662, 2663,
                2664, 2665, 2670, 2671, 2673, 2677, 2680, 2682, 2683, 2684, 2686, 2687, 2688, 2689, 2692, 2693, 2694,
                2698, 2700, 2702, 2711, 2713, 2714, 2715, 2716, 2717, 2719, 2722, 2725, 2727, 2732, 2734, 2735, 2738,
                2741, 2742, 2745, 2746, 2749, 2750, 2751, 2752, 2759, 2762, 2763, 2764, 2766, 2767, 2769, 2770, 2771,
                2773, 2778, 2779, 2781, 2782, 2784, 2785, 2788, 2789, 2791, 2792, 2794, 2795, 2797, 2798, 2800, 2801,
                2803, 2805, 2806, 2808, 2809, 2812, 2815, 2816, 2818, 2819, 2820, 2827, 2830, 2831, 2833, 2834, 2835,
                2839, 2840, 2841, 2842, 2844, 2846, 2848, 2849, 2850, 2851, 2853, 2856, 2858, 2860, 2861, 2862, 2864,
                2865, 2868, 2873, 2874, 2876, 2880, 2881, 2885, 2886, 2887, 2890, 2892, 2893, 2899, 2902, 2903, 2904,
                2905, 2906, 2907, 2908, 2911, 2914, 2918, 2919, 2922, 2925, 2927, 2934, 2935, 2937, 2940, 2942, 2943,
                2944, 2946, 2947, 2949, 2950, 2953, 2954, 2955, 2956, 2957, 2963, 2965, 2967, 2968, 2970, 2971, 2972,
                2975, 2977, 2979, 2980, 2981, 2985, 2989, 2991, 2992, 2994, 2995, 2997, 2999, 3001, 3002, 3003, 3004,
                3005, 3006, 3008, 3009, 3012, 3013, 3017, 3020, 3023, 3024, 3025, 3026, 3028, 3029, 3032, 3033, 3034,
                3035, 3036, 3038, 3041, 3043, 3044, 3045, 3047, 3050, 3053, 3054, 3055, 3056, 3058, 3060, 3061, 3062,
                3065, 3066, 3067, 3068, 3070, 3071, 3072, 3074, 3076, 3077, 3080, 3081, 3082, 3084, 3085, 3086, 3088,
                3097, 3098, 3101, 3104, 3105, 3107, 3108, 3109, 3110, 3112, 3113, 3115, 3117, 3119, 3123, 3125, 3126,
                3128, 3137, 3138, 3140, 3142, 3144, 3145, 3146, 3147, 3148, 3150, 3152, 3153, 3154, 3155, 3156, 3158,
                3162, 3163, 3165, 3166, 3167, 3169, 3171, 3175, 3176, 3177, 3183, 3185, 3186, 3192, 3193, 3194, 3195,
                3199, 3201, 3203, 3204, 3205, 3208, 3210, 3211, 3212, 3214, 3215, 3216, 3217, 3219, 3222, 3223, 3224,
                3225, 3229, 3230, 3232, 3233, 3234, 3235, 3237, 3238, 3240, 3241, 3242, 3243, 3245, 3246, 3247, 3248,
                3250, 3252, 3253, 3254, 3255, 3257, 3258, 3259, 3262, 3263, 3265, 3266, 3267, 3269, 3271, 3274, 3275,
                3276, 3277, 3278, 3282, 3284, 3285, 3287, 3288, 3292, 3293, 3295, 3296, 3297, 3300, 3301, 3302, 3307,
                3308, 3309, 3310, 3314, 3315, 3316, 3317, 3318, 3320, 3322, 3324, 3326, 3327, 3332, 3333, 3336, 3337,
                3339, 3342, 3345, 3346, 3347, 3352, 3355, 3356, 3357, 3358, 3360, 3361, 3363, 3365, 3366, 3367, 3369,
                3374, 3377, 3378, 3379, 3380, 3381, 3383, 3387, 3388, 3390, 3391, 3393, 3395, 3396, 3398, 3400, 3401,
                3404, 3406, 3409, 3412, 3414, 3416, 3417, 3419, 3420, 3421, 3423, 3426, 3429, 3431, 3433, 3434, 3437,
                3442, 3445, 3446, 3447, 3448, 3450, 3453, 3454, 3457, 3459, 3460, 3463, 3464, 3465, 3467, 3470, 3471,
                3472, 3476, 3478, 3479, 3482, 3483, 3484, 3490, 3494, 3495, 3496, 3497, 3498, 3501, 3502, 3503, 3505,
                3518, 3523, 3526, 3527, 3529, 3532, 3534, 3536, 3537, 3539, 3540, 3542, 3544, 3545, 3548, 3552, 3553,
                3554, 3556, 3557, 3559, 3562, 3564, 3568, 3570, 3573, 3574, 3575, 3579, 3580, 3581, 3584, 3585, 3586,
                3587, 3588, 3589, 3590, 3592, 3593, 3594, 3598, 3601, 3602, 3605, 3607, 3608, 3609, 3610, 3611, 3613,
                3615, 3617, 3618, 3619, 3622, 3624, 3625, 3630, 3631, 3633, 3635, 3637, 3639, 3643, 3645, 3648, 3652,
                3654, 3655, 3656, 3657, 3658, 3659, 3663, 3671, 3676, 3680, 3682, 3684, 3686, 3687, 3688, 3689, 3692,
                3697, 3698, 3701, 3707, 3708, 3709, 3711, 3713, 3714, 3718, 3720, 3721, 3722, 3723 };
        out.print("Which element do you want to search for?: ");
        int key = s.nextInt();
        int pos = bs.search(key, list, 0, list.length - 1);
        if (pos != -1) {
            out.println("The element " + key + " was found at position " + pos + ".");
        } else
            out.println("The element " + key + " could not be found!");

        out.println("Total number of elements in list: " + list.length);
        out.println("The number of times the function was called: " + cnt);
    }
}
