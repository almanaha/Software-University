﻿using System;
class Program
{
    static void Main()
    {
        int start = int.Parse(Console.ReadLine());
        int end = int.Parse(Console.ReadLine());
        int combinationsMax = int.Parse(Console.ReadLine());

        int combinations = 0;

        for (int firstDigit = start; firstDigit <= end; firstDigit++)
        {
            for (int secondDigit = start; secondDigit <= end; secondDigit++)
            {
                if (combinations == combinationsMax)
                {
                    return;
                }

                combinations++;

                Console.Write($"<{firstDigit}-{secondDigit}>");
            }
        }
    }
}

