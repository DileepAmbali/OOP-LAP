import static java.lang.System.out;
import java.util.Scanner;
class BinarySearch {
    static int cnt=0;

    int search(int key, int[] list,int low,int high){
        if(low>high){
            return -1;
        }        
        cnt++;
        int mid = (low+high)/2;
        if(list[mid] == key){
            return mid;
        }
        if(low == high){
            return -1;
        }
        else if (key>list[mid]){
            return search(key,list,mid+1,high);
        }
        else
            return search(key,list,low,mid-1);
    }

    public static void main(String args[]){
        BinarySearch bs = new BinarySearch();
        Scanner s = new Scanner(System.in);
        int[] list = {2,4,6,7,8,12,13,14,15,16,19,24,30,33,34,37,39,41,44,45,46,47,48,49,51,53,56,57,64,65,67,68,69,70,72,73,74,75,76,78,80,81,82,83,89,90,91,94,95,97,98,100,101,103,106,107,110,112,113,115,116,118,119,122,123,124,125,127,129,131,134,135,136,140,141,143,144,145,149,150,152,154,155,158,159,160,163,165,167,168,169,172,173,174,175,178,179,184,187,190,191,194,195,198,199,202,204,205,206,207,208,210,211,212,216,217,222,225,226,231,233,234,236,238,240,243,249,250,251,253,254,257,258,259,261,262,263,264,266,267,270,271,273,275,277,282,283,284,286,287,289,296,302,303,304,306,307,309,310,312,315,316,317,320,322,324,325,329,331,334,337,339,344,345,346,347,349,351,352,357,358,359,360,362,363,364,366,368,369,371,374,375,378,379,384,385,386,387,388,390,394,397,398,399,400,401,403,405,406,407,409,411,412,413,415,420,421,424,425,426,427,428,430,433,434,436,440,441,442,443,446,449,451,452,453,454,455,456,458,462,464,466,467,468,470,471,473,475,476,477,478,479,480,482,483,484,485,490,495,496,498,499,500,501,502,504,509,510,511,513,514,516,518,519,520,521,524,525,526,527,528,529,531,535,538,541,543,545,547,550,554,555,559,562,565,566,568,570,572,574,576,578,583,584,585,587,589,590,591,594,595,596,597,600,602,603,605,608,609,610,612,614,621,622,625,628,635,637,639,640,641,642,645,647,649,650,651,653,654,655,657,661,663,664,666,667,668,670,672,673,676,677,680,682,683,686,688,689,691,693,694,695,696,698,699,700,702,705,707,708,710,712,713,720,724,728,733,735,736,737,740,744,745,746,747,748,749,751,756,758,759,760,761,763,765,766,768,769,772,773,774,775,777,782,784,786,788,791,793,794,795,796,798,799,800,802,806,809,813,814,817,818,823,824,825,827,830,836,837,840,852,853,856,859,861,862,863,864,865,866,867,868,870,872,876,877,878,879,882,884,887,888,889,892,898,899,900,902,904,908,909,910,911,912,913,916,917,920,921,922,927,928,929,930,932,933,935,936,937,940,942,943,947,948,949,952,954,955,956,960,965,966,967,970,974,977,980,981,982,983,984,985,986,987,989,990,993,994,997,998,999,1000,1001,1002,1004,1007,1008,1009,1012,1014,1015,1016,1018,1019,1021,1022,1023,1024,1025,1026,1028,1029,1033,1034,1039,1042,1043,1044,1046,1047,1049,1050,1051,1053,1055,1057,1059,1061,1063,1064,1066,1067,1069,1071,1072,1073,1074,1078,1079,1081,1082,1085,1088,1089,1090,1093,1095,1096,1098,1099,1100,1102,1108,1109,1110,1111,1112,1113,1114,1115,1116,1118,1119,1122,1123,1124,1126,1127,1128,1131,1132,1134,1141,1145,1146,1147,1148,1149,1150,1152,1154,1155,1156,1161,1162,1163,1166,1167,1168,1171,1172,1174,1175,1180,1182,1184,1188,1189,1190,1191,1192,1193,1197,1198,1199,1201,1205,1206,1209,1211,1212,1213,1216,1220,1221,1223,1224,1226,1227,1232,1235,1237,1239,1242,1244,1245,1246,1249,1251,1252,1253,1254,1255,1258,1259,1260,1262,1263,1264,1267,1268,1269,1270,1274,1275,1278,1279,1282,1285,1289,1290,1291,1294,1295,1298,1300,1302,1303,1304,1308,1309,1310,1312,1315,1316,1317,1318,1320,1321,1322,1324,1331,1333,1334,1335,1339,1340,1341,1342,1343,1346,1347,1349,1352,1353,1358,1360,1362,1364,1365,1367,1368,1369,1370,1372,1374,1376,1378,1379,1382,1385,1387,1389,1391,1392,1393,1395,1397,1398,1404,1406,1411,1412,1413,1415,1416,1417,1418,1420,1422,1426,1427,1429,1432,1433,1437,1439,1440,1441,1442,1448,1449,1452,1455,1458,1462,1466,1469,1470,1471,1472,1473,1476,1479,1480,1481,1482,1483,1485,1490,1492,1498,1499,1501,1504,1507,1509,1510,1512,1513,1516,1518,1519,1520,1521,1525,1526,1529,1532,1533,1535,1539,1542,1543,1546,1547,1548,1551,1554,1555,1559,1566,1567,1568,1570,1572,1578,1579,1580,1581,1584,1585,1586,1588,1589,1590,1591,1592,1595,1596,1597,1598,1599,1600,1601,1603,1609,1610,1611,1613,1615,1617,1618,1619,1621,1623,1624,1628,1631,1632,1633,1634,1635,1638,1639,1643,1645,1646,1648,1649,1653,1654,1655,1656,1657,1658,1661,1663,1666,1667,1669,1670,1672,1673,1674,1676,1677,1678,1680,1682,1684,1685,1688,1689,1691,1692,1693,1694,1697,1699,1700,1702,1703,1706,1707,1708,1710,1716,1717,1720,1725,1726,1727,1732,1733,1735,1736,1737,1738,1739,1741,1746,1747,1748,1751,1754,1756,1762,1765,1767,1768,1771,1772,1777,1778,1782,1783,1785,1786,1791,1793,1795,1796,1797,1800,1801,1802,1803,1804,1806,1807,1811,1812,1815,1816,1818,1819,1820,1822,1826,1827,1828,1829,1837,1842,1843,1844,1845,1848,1849,1852,1854,1855,1857,1858,1860,1861,1863,1864,1867,1869,1871,1873,1877,1879,1883,1885,1886,1889,1890,1891,1892,1893,1894,1896,1897,1908,1909,1910,1913,1915,1917,1919,1920,1921,1923,1924,1925,1926,1927,1929,1930,1932,1935,1936,1938,1939,1940,1942,1943,1945,1946,1949,1950,1951,1954,1959,1960,1961,1962,1963,1964,1966,1967,1971,1974,1976,1978,1982,1983,1986,1988,1992,1993,1994,1995,1996,1998,2000,2001,2006,2007,2009,2010,2012,2013,2017,2018,2020,2025,2027,2031,2032,2035,2036,2037,2038,2041,2045,2047,2048,2049,2050,2053,2055,2067,2068,2069,2070,2074,2075,2076,2079,2081,2082,2083,2085,2086,2087,2088,2089,2092,2098,2099,2101,2102,2104,2105,2107,2110,2113,2115,2119,2124,2125,2126,2127,2130,2131,2140,2142,2143,2144,2148,2150,2152,2153,2155,2158,2159,2160,2161,2162,2163,2164,2168,2169,2173,2174,2177,2179,2183,2184,2185,2189,2190,2191,2194,2195,2198,2200,2202,2205,2209,2212,2213,2214,2217,2221,2223,2224,2231,2235,2237,2239,2243,2245,2247,2248,2250,2251,2254,2255,2257,2258,2259,2260,2262,2263,2264,2267,2271,2272,2274,2276,2282,2283,2285,2286,2289,2292,2295,2299,2301,2303,2305,2307,2308,2310,2311,2312,2316,2319,2321,2322,2327,2331,2332,2333,2334,2338,2340,2343,2344,2345,2347,2349,2350,2351,2352,2353,2357,2359,2362,2364,2365,2366,2367,2369,2370,2372,2374,2375,2376,2377,2378,2379,2380,2381,2382,2384,2386,2387,2391,2396,2399,2400,2401,2403,2404,2405,2408,2412,2414,2415,2417,2418,2420,2428,2429,2430,2431,2436,2438,2439,2442,2445,2446,2447,2448,2450,2451,2453,2454,2466,2467,2468,2472,2473,2474,2480,2482,2484,2486,2488,2489,2491,2492,2496,2498,2499,2504,2508,2513,2515,2516,2517,2518,2519,2521,2523,2524,2527,2528,2530,2531,2532,2533,2534,2536,2537,2539,2540,2541,2542,2543,2546,2547,2548,2549,2552,2554,2555,2561,2564,2565,2569,2571,2573,2581,2587,2588,2589,2591,2594,2595,2598,2599,2601,2603,2604,2605,2606,2607,2608,2609,2611,2614,2617,2619,2620,2622,2623,2624,2625,2626,2627,2628,2631,2632,2637,2639,2640,2641,2643,2645,2646,2648,2649,2650,2651,2652,2658,2662,2663,2664,2665,2670,2671,2673,2677,2680,2682,2683,2684,2686,2687,2688,2689,2692,2693,2694,2698,2700,2702,2711,2713,2714,2715,2716,2717,2719,2722,2725,2727,2732,2734,2735,2738,2741,2742,2745,2746,2749,2750,2751,2752,2759,2762,2763,2764,2766,2767,2769,2770,2771,2773,2778,2779,2781,2782,2784,2785,2788,2789,2791,2792,2794,2795,2797,2798,2800,2801,2803,2805,2806,2808,2809,2812,2815,2816,2818,2819,2820,2827,2830,2831,2833,2834,2835,2839,2840,2841,2842,2844,2846,2848,2849,2850,2851,2853,2856,2858,2860,2861,2862,2864,2865,2868,2873,2874,2876,2880,2881,2885,2886,2887,2890,2892,2893,2899,2902,2903,2904,2905,2906,2907,2908,2911,2914,2918,2919,2922,2925,2927,2934,2935,2937,2940,2942,2943,2944,2946,2947,2949,2950,2953,2954,2955,2956,2957,2963,2965,2967,2968,2970,2971,2972,2975,2977,2979,2980,2981,2985,2989,2991,2992,2994,2995,2997,2999,3001,3002,3003,3004,3005,3006,3008,3009,3012,3013,3017,3020,3023,3024,3025,3026,3028,3029,3032,3033,3034,3035,3036,3038,3041,3043,3044,3045,3047,3050,3053,3054,3055,3056,3058,3060,3061,3062,3065,3066,3067,3068,3070,3071,3072,3074,3076,3077,3080,3081,3082,3084,3085,3086,3088,3097,3098,3101,3104,3105,3107,3108,3109,3110,3112,3113,3115,3117,3119,3123,3125,3126,3128,3137,3138,3140,3142,3144,3145,3146,3147,3148,3150,3152,3153,3154,3155,3156,3158,3162,3163,3165,3166,3167,3169,3171,3175,3176,3177,3183,3185,3186,3192,3193,3194,3195,3199,3201,3203,3204,3205,3208,3210,3211,3212,3214,3215,3216,3217,3219,3222,3223,3224,3225,3229,3230,3232,3233,3234,3235,3237,3238,3240,3241,3242,3243,3245,3246,3247,3248,3250,3252,3253,3254,3255,3257,3258,3259,3262,3263,3265,3266,3267,3269,3271,3274,3275,3276,3277,3278,3282,3284,3285,3287,3288,3292,3293,3295,3296,3297,3300,3301,3302,3307,3308,3309,3310,3314,3315,3316,3317,3318,3320,3322,3324,3326,3327,3332,3333,3336,3337,3339,3342,3345,3346,3347,3352,3355,3356,3357,3358,3360,3361,3363,3365,3366,3367,3369,3374,3377,3378,3379,3380,3381,3383,3387,3388,3390,3391,3393,3395,3396,3398,3400,3401,3404,3406,3409,3412,3414,3416,3417,3419,3420,3421,3423,3426,3429,3431,3433,3434,3437,3442,3445,3446,3447,3448,3450,3453,3454,3457,3459,3460,3463,3464,3465,3467,3470,3471,3472,3476,3478,3479,3482,3483,3484,3490,3494,3495,3496,3497,3498,3501,3502,3503,3505,3518,3523,3526,3527,3529,3532,3534,3536,3537,3539,3540,3542,3544,3545,3548,3552,3553,3554,3556,3557,3559,3562,3564,3568,3570,3573,3574,3575,3579,3580,3581,3584,3585,3586,3587,3588,3589,3590,3592,3593,3594,3598,3601,3602,3605,3607,3608,3609,3610,3611,3613,3615,3617,3618,3619,3622,3624,3625,3630,3631,3633,3635,3637,3639,3643,3645,3648,3652,3654,3655,3656,3657,3658,3659,3663,3671,3676,3680,3682,3684,3686,3687,3688,3689,3692,3697,3698,3701,3707,3708,3709,3711,3713,3714,3718,3720,3721,3722,3723,3724,3726,3727,3729,3730,3731,3734,3739,3743,3744,3745,3747,3750,3753,3757,3758,3762,3766,3768,3775,3776,3784,3786,3787,3789,3790,3791,3792,3793,3794,3795,3801,3802,3803,3811,3814,3815,3817,3818,3820,3824,3825,3830,3831,3833,3834,3836,3838,3839,3840,3841,3842,3843,3846,3847,3848,3849,3852,3853,3854,3855,3856,3859,3861,3862,3863,3864,3866,3867,3868,3869,3870,3872,3873,3875,3876,3877,3879,3883,3884,3885,3886,3887,3888,3889,3892,3893,3895,3896,3897,3898,3900,3901,3902,3904,3907,3910,3912,3913,3914,3916,3918,3919,3920,3922,3928,3929,3930,3933,3934,3938,3945,3946,3947,3948,3950,3953,3955,3958,3959,3962,3966,3967,3971,3972,3973,3974,3975,3976,3977,3980,3982,3983,3991,3992,3993,3995,3996,3997,3998,3999,4001,4002,4003,4004,4006,4007,4009,4010,4011,4013,4016,4018,4019,4020,4021,4026,4027,4028,4029,4035,4037,4038,4039,4041,4047,4048,4052,4058,4059,4061,4062,4065,4066,4068,4070,4072,4074,4075,4076,4077,4083,4087,4088,4089,4091,4092,4093,4094,4095,4096,4097,4099,4100,4101,4104,4106,4107,4108,4109,4111,4114,4115,4116,4118,4123,4125,4126,4129,4131,4132,4133,4134,4136,4139,4142,4147,4148,4149,4150,4151,4153,4155,4160,4162,4166,4168,4169,4172,4176,4179,4183,4184,4185,4189,4191,4193,4195,4196,4200,4202,4205,4207,4209,4211,4212,4213,4215,4216,4217,4218,4221,4222,4226,4228,4232,4235,4236,4237,4240,4242,4243,4245,4247,4248,4250,4252,4253,4254,4256,4258,4265,4267,4269,4270,4271,4275,4280,4281,4282,4287,4293,4297,4298,4299,4300,4301,4303,4305,4309,4310,4312,4315,4316,4317,4318,4319,4322,4323,4326,4327,4330,4331,4333,4334,4336,4337,4339,4340,4344,4346,4348,4350,4351,4352,4353,4354,4355,4356,4360,4364,4365,4369,4372,4375,4377,4378,4381,4383,4386,4390,4391,4392,4393,4396,4398,4400,4401,4403,4404,4405,4406,4407,4408,4410,4411,4412,4413,4416,4417,4418,4419,4420,4421,4422,4423,4426,4429,4437,4439,4443,4445,4448,4451,4452,4453,4456,4457,4459,4462,4463,4466,4468,4474,4476,4477,4480,4481,4484,4486,4488,4492,4496,4497,4501,4503,4504,4506,4508,4509,4510,4511,4513,4514,4516,4517,4518,4524,4525,4530,4531,4538,4539,4542,4543,4545,4546,4547,4549,4553,4554,4556,4557,4561,4563,4564,4565,4566,4567,4570,4572,4575,4576,4579,4580,4581,4584,4586,4588,4589,4591,4592,4593,4595,4597,4598,4600,4601,4603,4604,4608,4614,4615,4618,4621,4622,4623,4624,4626,4627,4629,4631,4636,4637,4640,4641,4642,4644,4647,4648,4649,4652,4654,4655,4657,4658,4663,4665,4668,4669,4670,4671,4677,4678,4681,4686,4688,4689,4690,4693,4695,4696,4700,4701,4703,4704,4705,4707,4708,4709,4712,4715,4724,4725,4726,4729,4730,4731,4732,4733,4734,4736,4738,4741,4742,4744,4745,4746,4747,4748,4749,4750,4751,4759,4760,4761,4762,4764,4765,4766,4768,4769,4771,4772,4773,4774,4776,4777,4779,4782,4784,4786,4787,4788,4789,4791,4792,4795,4796,4797,4800,4801,4802,4804,4805,4809,4811,4812,4814,4817,4818,4820,4822,4823,4824,4825,4826,4829,4830,4833,4834,4837,4839,4841,4843,4844,4849,4851,4856,4857,4858,4860,4870,4871,4873,4874,4878,4879,4880,4882,4883,4885,4886,4889,4890,4895,4897,4898,4900,4903,4904,4905,4907,4908,4910,4911,4913,4915,4916,4921,4924,4925,4927,4929,4930,4935,4942,4943,4947,4948,4950,4952,4953,4955,4956,4961,4964,4966,4969,4974,4981,4984,4986,4988,4991,4993,4994,4995,4999,5000,5002,5004,5008,5009,5010,5013,5014,5015,5017,5018,5026,5027,5033,5038,5046,5051,5053,5054,5055,5056,5058,5059,5060,5061,5064,5066,5067,5069,5070,5073,5074,5077,5080,5082,5085,5086,5087,5088,5089,5090,5095,5097,5098,5099,5100,5103,5104,5106,5107,5109,5111,5115,5116,5118,5119,5122,5125,5127,5128,5129,5130,5132,5135,5137,5139,5140,5145,5146,5149,5152,5153,5157,5160,5166,5168,5169,5172,5173,5174,5175,5176,5177,5178,5179,5180,5182,5183,5185,5186,5188,5189,5191,5194,5195,5199,5201,5202,5205,5206,5208,5211,5212,5213,5216,5217,5220,5221,5223,5227,5228,5229,5230,5232,5233,5234,5235,5236,5238,5240,5243,5244,5245,5249,5250,5251,5252,5253,5254,5258,5260,5262,5264,5265,5266,5268,5269,5270,5272,5273,5274,5277,5278,5280,5281,5282,5283,5284,5285,5286,5287,5288,5292,5296,5297,5298,5301,5302,5308,5313,5314,5318,5319,5322,5323,5325,5326,5327,5328,5330,5338,5343,5344,5347,5348,5351,5354,5355,5361,5363,5367,5371,5372,5374,5378,5379,5380,5383,5390,5392,5397,5400,5401,5402,5408,5415,5416,5419,5421,5422,5425,5427,5428,5431,5435,5438,5441,5442,5447,5448,5450,5451,5453,5454,5458,5463,5467,5468,5470,5471,5473,5474,5476,5478,5481,5483,5485,5487,5489,5491,5493,5494,5495,5498,5499,5502,5504,5506,5507,5508,5509,5519,5520,5522,5524,5526,5529,5530,5534,5536,5537,5538,5540,5543,5549,5550,5551,5553,5554,5555,5556,5558,5560,5561,5565,5566,5567,5571,5574,5578,5579,5580,5581,5585,5586,5587,5590,5591,5593,5595,5596,5598,5600,5603,5604,5606,5608,5609,5610,5612,5614,5615,5616,5617,5618,5619,5620,5621,5622,5623,5629,5630,5631,5632,5633,5637,5639,5640,5642,5643,5647,5648,5649,5651,5652,5654,5656,5658,5659,5662,5663,5666,5667,5668,5670,5674,5676,5677,5678,5679,5682,5686,5687,5690,5691,5693,5694,5698,5699,5700,5704,5706,5708,5709,5710,5715,5716,5719,5720,5721,5724,5725,5726,5728,5732,5734,5735,5736,5737,5738,5739,5740,5744,5746,5747,5749,5750,5753,5754,5755,5757,5765,5766,5767,5768,5769,5771,5773,5774,5776,5777,5782,5784,5787,5788,5790,5791,5794,5798,5800,5801,5803,5806,5808,5809,5812,5813,5814,5815,5816,5820,5821,5823,5824,5825,5826,5827,5830,5831,5838,5840,5841,5842,5847,5851,5852,5853,5856,5857,5858,5860,5861,5863,5866,5867,5869,5872,5875,5878,5879,5881,5884,5885,5886,5888,5890,5895,5901,5903,5904,5906,5909,5910,5912,5913,5914,5915,5916,5918,5920,5921,5922,5925,5926,5927,5930,5933,5936,5938,5940,5941,5944,5945,5946,5947,5950,5953,5956,5960,5961,5963,5964,5967,5968,5969,5970,5971,5976,5977,5979,5980,5981,5982,5984,5988,5989,5990,5992,5993,6000,6001,6002,6003,6004,6006,6007,6008,6011,6016,6017,6019,6020,6021,6022,6026,6028,6029,6031,6032,6034,6035,6036,6037,6045,6046,6050,6051,6053,6054,6055,6056,6057,6061,6064,6065,6067,6068,6070,6071,6075,6077,6080,6082,6083,6084,6088,6090,6091,6092,6094,6095,6096,6099,6100,6101,6102,6103,6104,6107,6108,6110,6112,6115,6116,6120,6125,6132,6134,6136,6139,6140,6143,6145,6146,6147,6148,6150,6152,6153,6154,6155,6161,6162,6163,6164,6166,6168,6169,6170,6171,6172,6173,6175,6177,6179,6180,6182,6185,6186,6187,6188,6189,6191,6194,6200,6201,6203,6204,6205,6207,6208,6209,6210,6211,6212,6213,6214,6215,6216,6217,6218,6220,6221,6222,6225,6228,6229,6231,6232,6234,6236,6240,6242,6243,6244,6245,6246,6250,6252,6254,6255,6257,6258,6259,6261,6262,6266,6267,6268,6270,6271,6272,6273,6275,6276,6277,6282,6285,6286,6289,6290,6291,6292,6293,6294,6296,6302,6304,6306,6307,6308,6309,6314,6317,6318,6319,6322,6327,6330,6338,6340,6341,6343,6344,6347,6353,6355,6357,6359,6363,6365,6366,6367,6368,6370,6372,6374,6375,6377,6379,6380,6382,6384,6388,6392,6393,6395,6399,6401,6402,6403,6404,6406,6409,6410,6413,6414,6415,6418,6420,6421,6423,6424,6428,6429,6431,6432,6433,6434,6436,6437,6440,6441,6442,6443,6445,6447,6450,6454,6455,6456,6458,6459,6460,6461,6466,6468,6474,6475,6476,6480,6482,6483,6488,6489,6493,6494,6496,6497,6498,6499,6500,6501,6503,6504,6505,6506,6508,6511,6512,6513,6514,6515,6517,6521,6522,6525,6528,6531,6532,6533,6534,6535,6537,6538,6539,6542,6543,6548,6549,6550,6553,6554,6556,6558,6559,6560,6562,6566,6567,6568,6569,6572,6576,6577,6579,6580,6581,6585,6588,6589,6590,6593,6594,6595,6597,6599,6600,6601,6602,6603,6605,6607,6608,6610,6611,6615,6616,6621,6622,6626,6627,6628,6629,6632,6633,6635,6636,6641,6643,6644,6645,6650,6651,6654,6655,6656,6657,6658,6662,6663,6664,6667,6668,6669,6671,6673,6674,6675,6676,6677,6678,6679,6680,6681,6683,6687,6688,6689,6692,6693,6694,6696,6697,6698,6699,6702,6703,6704,6705,6706,6709,6710,6711,6712,6713,6714,6715,6716,6717,6719,6720,6722,6724,6726,6729,6730,6731,6732,6734,6738,6740,6742,6743,6745,6747,6749,6751,6754,6755,6757,6760,6763,6765,6767,6768,6771,6772,6775,6776,6777,6778,6779,6780,6785,6786,6787,6790,6791,6800,6802,6804,6805,6807,6809,6814,6817,6818,6819,6820,6821,6824,6826,6828,6831,6832,6833,6838,6839,6840,6841,6842,6844,6845,6846,6847,6849,6850,6851,6854,6856,6858,6861,6862,6863,6865,6866,6867,6870,6871,6873,6875,6876,6877,6879,6880,6882,6884,6886,6893,6896,6897,6898,6899,6901,6902,6904,6906,6909,6911,6912,6913,6914,6915,6919,6922,6924,6926,6928,6929,6930,6932,6934,6936,6938,6940,6941,6942,6944,6945,6946,6947,6952,6953,6957,6959,6960,6966,6967,6968,6972,6973,6974,6975,6977,6978,6979,6980,6981,6982,6984,6989,6990,6991,6992,6994,6995,6996,6997,7000,7001,7004,7005,7007,7008,7009,7011,7013,7014,7015,7016,7022,7024,7026,7027,7031,7032,7033,7039,7040,7044,7045,7048,7050,7052,7057,7058,7060,7061,7062,7064,7065,7068,7069,7070,7072,7073,7075,7076,7077,7079,7080,7082,7083,7084,7086,7087,7088,7089,7092,7095,7097,7098,7103,7109,7112,7113,7114,7115,7117,7118,7119,7120,7122,7124,7126,7127,7128,7129,7130,7132,7134,7135,7136,7139,7140,7141,7142,7145,7152,7153,7154,7155,7158,7160,7161,7165,7166,7167,7169,7171,7172,7173,7175,7177,7178,7181,7182,7184,7185,7186,7187,7191,7193,7199,7201,7202,7204,7205,7206,7207,7209,7210,7212,7213,7215,7216,7217,7218,7223,7224,7225,7226,7228,7232,7236,7237,7238,7240,7241,7245,7250,7251,7253,7255,7257,7259,7262,7263,7266,7270,7271,7272,7273,7276,7277,7278,7279,7281,7282,7283,7284,7286,7287,7288,7292,7294,7295,7298,7299,7300,7301,7302,7303,7306,7308,7310,7311,7312,7315,7316,7317,7320,7324,7326,7327,7330,7332,7333,7334,7340,7341,7342,7343,7345,7346,7350,7355,7356,7359,7360,7361,7362,7363,7365,7367,7368,7371,7376,7380,7381,7390,7391,7394,7397,7398,7399,7402,7406,7408,7410,7417,7418,7419,7421,7425,7428,7429,7431,7432,7433,7434,7439,7440,7441,7443,7444,7445,7448,7450,7455,7456,7457,7459,7460,7472,7473,7476,7477,7478,7480,7481,7483,7487,7488,7489,7492,7494,7498,7499,7503,7506,7508,7510,7512,7514,7518,7522,7524,7525,7527,7528,7531,7533,7534,7536,7541,7542,7545,7547,7549,7551,7552,7553,7556,7557,7564,7566,7569,7570,7573,7575,7579,7580,7583,7584,7585,7586,7587,7589,7592,7593,7594,7596,7598,7599,7600,7601,7602,7605,7608,7610,7613,7614,7616,7618,7619,7620,7621,7624,7626,7630,7633,7635,7636,7639,7642,7644,7651,7653,7656,7658,7659,7660,7662,7664,7665,7666,7667,7669,7672,7673,7674,7675,7676,7677,7680,7681,7684,7685,7686,7690,7692,7697,7699,7701,7706,7707,7708,7709,7710,7714,7715,7717,7718,7719,7720,7722,7724,7725,7727,7728,7729,7734,7736,7737,7738,7739,7746,7747,7750,7751,7753,7754,7755,7756,7757,7758,7765,7766,7770,7771,7772,7775,7777,7778,7779,7780,7784,7785,7786,7787,7788,7789,7792,7797,7798,7799,7802,7804,7806,7807,7813,7814,7817,7818,7820,7821,7826,7829,7832,7834,7835,7836,7837,7838,7839,7840,7841,7844,7845,7847,7854,7856,7857,7858,7862,7866,7868,7869,7871,7873,7877,7880,7885,7889,7892,7893,7894,7895,7898,7899,7900,7901,7903,7904,7905,7907,7909,7911,7912,7913,7915,7918,7920,7923,7924,7928,7929,7930,7934,7936,7945,7946,7956,7958,7959,7960,7961,7964,7967,7968,7969,7972,7973,7974,7976,7980,7981,7982,7983,7984,7985,7986,7988,7989,7992,7993,7994,7995,7999,8000,8002,8004,8005,8006,8009,8014,8016,8017,8018,8019,8023,8024,8027,8029,8030,8034,8036,8042,8043,8044,8045,8046,8047,8048,8049,8050,8051,8056,8057,8059,8060,8061,8062,8066,8069,8070,8071,8072,8073,8076,8077,8079,8080,8081,8084,8086,8091,8092,8093,8095,8097,8099,8100,8101,8105,8107,8110,8112,8119,8120,8122,8124,8126,8127,8128,8129,8133,8134,8135,8139,8141,8142,8144,8147,8148,8149,8152,8153,8155,8156,8159,8160,8161,8163,8168,8169,8172,8173,8174,8178,8180,8181,8182,8184,8186,8189,8192,8194,8195,8196,8197,8199,8200,8207,8208,8211,8212,8215,8216,8218,8221,8222,8223,8224,8226,8227,8230,8233,8234,8236,8239,8240,8243,8244,8245,8246,8247,8250,8251,8253,8258,8260,8261,8263,8264,8265,8266,8268,8270,8272,8274,8275,8277,8278,8282,8284,8285,8286,8287,8289,8292,8294,8302,8303,8305,8306,8307,8308,8311,8312,8320,8321,8323,8325,8327,8329,8330,8331,8332,8334,8336,8337,8339,8340,8341,8342,8346,8347,8348,8350,8353,8354,8355,8356,8362,8363,8364,8366,8368,8371,8372,8373,8375,8377,8378,8379,8382,8383,8384,8386,8388,8390,8391,8394,8396,8400,8402,8403,8405,8406,8407,8408,8409,8416,8418,8419,8422,8424,8427,8429,8430,8432,8433,8434,8437,8440,8443,8445,8447,8448,8451,8452,8453,8454,8455,8461,8463,8464,8466,8469,8474,8475,8476,8478,8482,8485,8486,8487,8489,8490,8492,8493,8498,8500,8501,8502,8504,8505,8507,8512,8513,8516,8517,8519,8520,8522,8523,8524,8530,8531,8533,8537,8538,8539,8541,8542,8545,8549,8550,8552,8553,8555,8558,8559,8560,8561,8562,8563,8564,8567,8569,8572,8577,8581,8586,8587,8594,8596,8597,8598,8599,8600,8601,8602,8603,8607,8609,8610,8613,8616,8619,8621,8623,8628,8635,8638,8641,8654,8656,8657,8659,8660,8664,8670,8672,8673,8674,8675,8676,8677,8679,8680,8683,8685,8686,8689,8690,8691,8692,8695,8697,8698,8699,8701,8703,8708,8709,8711,8714,8715,8718,8719,8722,8723,8727,8729,8730,8731,8732,8734,8735,8737,8741,8743,8745,8746,8747,8748,8749,8752,8755,8760,8764,8766,8769,8770,8771,8775,8776,8777,8779,8780,8781,8782,8783,8784,8786,8787,8788,8796,8798,8799,8800,8802,8804,8806,8808,8811,8813,8815,8816,8819,8824,8825,8827,8828,8830,8834,8836,8837,8838,8839,8841,8843,8844,8845,8850,8852,8854,8858,8859,8863,8864,8868,8870,8871,8874,8877,8883,8884,8885,8895,8896,8898,8900,8901,8902,8904,8906,8907,8908,8910,8911,8912,8913,8914,8920,8922,8925,8927,8932,8935,8936,8939,8940,8941,8942,8943,8945,8949,8950,8951,8952,8953,8955,8957,8958,8959,8962,8964,8965,8966,8968,8970,8971,8972,8973,8977,8979,8980,8981,8984,8985,8986,8988,8989,8990,8992,8996,8999,9000,9003,9007,9012,9013,9015,9016,9017,9019,9021,9022,9029,9030,9033,9037,9038,9043,9044,9045,9046,9048,9050,9052,9059,9060,9061,9063,9064,9066,9067,9068,9070,9072,9073,9077,9078,9079,9084,9087,9088,9089,9092,9096,9098,9103,9104,9107,9108,9110,9111,9113,9115,9116,9119,9122,9124,9126,9127,9129,9132,9133,9135,9136,9139,9140,9145,9147,9150,9151,9153,9154,9155,9156,9159,9163,9164,9165,9166,9167,9172,9176,9183,9188,9193,9195,9196,9201,9202,9212,9216,9218,9219,9220,9226,9227,9228,9232,9234,9238,9239,9244,9248,9249,9254,9255,9256,9261,9263,9265,9273,9274,9276,9277,9279,9281,9282,9289,9291,9292,9298,9299,9301,9304,9311,9314,9316,9318,9319,9320,9321,9323,9324,9325,9329,9333,9334,9337,9338,9341,9342,9343,9344,9347,9349,9350,9351,9352,9354,9355,9357,9358,9360,9361,9363,9364,9365,9366,9368,9372,9373,9376,9377,9378,9379,9381,9382,9383,9384,9385,9386,9387,9389,9391,9393,9395,9396,9397,9398,9400,9401,9402,9405,9406,9407,9412,9414,9418,9423,9425,9426,9431,9432,9435,9436,9438,9445,9446,9447,9448,9450,9451,9452,9453,9456,9457,9459,9460,9461,9462,9463,9467,9468,9469,9472,9475,9476,9479,9480,9481,9484,9485,9487,9490,9498,9500,9501,9503,9504,9505,9506,9507,9508,9510,9511,9515,9516,9520,9521,9527,9529,9531,9532,9534,9536,9537,9540,9542,9544,9545,9546,9548,9550,9553,9554,9555,9556,9557,9559,9560,9561,9570,9577,9578,9579,9581,9582,9583,9584,9586,9587,9588,9589,9590,9594,9597,9601,9602,9603,9605,9606,9609,9610,9611,9613,9614,9619,9621,9624,9625,9626,9627,9629,9630,9636,9638,9639,9641,9642,9643,9644,9645,9647,9649,9652,9653,9657,9658,9659,9660,9661,9663,9664,9666,9667,9669,9670,9671,9678,9680,9681,9682,9683,9684,9690,9692,9695,9696,9699,9702,9709,9711,9712,9713,9714,9715,9719,9720,9722,9727,9730,9731,9734,9737,9739,9742,9743,9744,9745,9746,9748,9760,9761,9762,9763,9764,9765,9766,9768,9772,9773,9775,9779,9780,9781,9782,9783,9784,9787,9788,9789,9791,9792,9793,9794,9796,9798,9799,9800,9804,9806,9809,9812,9814,9817,9819,9825,9827,9830,9831,9833,9834,9837,9843,9844,9845,9846,9848,9849,9852,9853,9854,9855,9857,9859,9860,9861,9864,9865,9869,9870,9871,9872,9874,9875,9876,9877,9878,9879,9881,9885,9888,9889,9890,9891,9892,9893,9894,9895,9896,9899,9900,9901,9902,9903,9906,9908,9909,9912,9914,9915,9920,9924,9925,9927,9930,9931,9933,9939,9940,9943,9945,9946,9949,9950,9952,9953,9957,9959,9964,9965,9966,9967,9970,9971,9972,9974,9983,9986,9987,9990,9996,9997,9999};
        out.print("Which element do you want to search for?: ");
        int key = s.nextInt();
        int pos =bs.search(key, list, 0, list.length-1);
        if(pos!=-1){
            out.println("The element " + key + " was found at position " + pos + ".");
        }
        else
            out.println("The element " + key + " could not be found!");

        out.println("Total number of elements in list: "+ list.length);
        out.println("The number of times the function was called: "+ cnt);
    }
}
