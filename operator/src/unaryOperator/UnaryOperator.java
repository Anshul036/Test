package unaryOperator;

public class UnaryOperator {

public static void main(String[] args) {
        
        // 		Post-Increment Practice
        
        // Question 1
        int x = 8;
        int y = x++;
        System.out.println(x); // Output: 9
        System.out.println(y); // Output: 8
        System.out.println();
        
        // Question 2
        x = 10;
        y = x++;
        y = x++;
        System.out.println(x); // Output: 12
        System.out.println(y); // Output: 11
        System.out.println();
        
        // Question 3
        int a = 20;
        a++;
        int b = a++;
        b = a++;
        b++;
        a = b++;
        System.out.println(a); // Output: 23
        System.out.println(b); // Output: 24
        System.out.println();
        
        // Question 4
        x = 25;
        y = x++;
        y++;
        x = y++;
        int z = x++;
        y = z++;
        x = z++;
        x++;
        y = x++;
        z = y++;
        y = y++;
        System.out.println(x); // Output: 29
        System.out.println(y); // Output: 29
        System.out.println(z); // Output: 28
        System.out.println();
        
        // Question 5
        a = 55;
        b = a++;
        b++;
        int c = b++;
        a = c++;
        b = c++;
        System.out.println(a); // Output: 56
        System.out.println(b); // Output: 57
        System.out.println(c); // Output: 58
        System.out.println();
        
        // 		 Pre-Increment Practice
        
        // Question 1
        int p = 20;
        int q = ++p;
        System.out.println(p); // Output: 21
        System.out.println(q); // Output: 21
        System.out.println();
        
        // Question 2
        int m = 100;
        ++m;
        int n = ++m;
        int o = ++n;
        ++o;
        System.out.println(m); // Output: 102
        System.out.println(n); // Output: 103
        System.out.println(o); // Output: 104
        System.out.println();
        
        // Question 3
        int v = 45;
        ++v;
        int w = ++v;
        w = ++w;
        v = ++w;
        v++;
        System.out.println(v); // Output: 50
        System.out.println(w); // Output: 49
        System.out.println();
        
        // 		 Post-decrement Practice
        
        // Question 1
        p = 20;
        q = p--;
        System.out.println(p); // Output: 19
        System.out.println(q); // Output: 20
        System.out.println();
        
        // Question 2
        x = 95;
        x--;
        y = x--;
        y = y--;
        System.out.println(x); // Output: 93
        System.out.println(y); // Output: 94
        System.out.println();
        
        // Question 3
        a = 50;
        b = a--;
        b--;
        c = b--;
        a = c--;
        b = c--;
        b--;
        System.out.println(a); // Output: 49
        System.out.println(b); // Output: 47
        System.out.println(c); // Output: 47
        System.out.println();
        
        // 		 Pre-decrement Practice 
        
        // Question 1
        x = 20;
        y = --x;
        --x;
        System.out.println(x); // Output: 18
        System.out.println(y); // Output: 19
        System.out.println();
        
        // Question 2
        a = 10;
        --a;
        b = --a;
        System.out.println(a); // Output: 8
        System.out.println(b); // Output: 8
        System.out.println();
        
        // Question 3
        a = 215;
        --a;
        b = --a;
        --b;
        c = --b;
        a = --c;
        b = --c;
        System.out.println(a); // Output: 210
        System.out.println(b); // Output: 209
        System.out.println(c); // Output: 209
        System.out.println();
        
        // 		 Miscellaneous Practice Questions 		
        
        // Question 1
        m = 8;
        ++m;
        n = ++m;
        n--;
        p = n--;
        m = p--;
        n = p++;
        System.out.println(m); // Output: 9
        System.out.println(n); // Output: 8
        System.out.println();
        
        // Question 2
        a = 7;
        ++a;
        b = ++a;
        b--;
        c = b--;
        a = c++;
        b = c--;
        System.out.println(a); // Output: 8
        System.out.println(b); // Output: 9
        System.out.println(c); // Output: 8
        System.out.println();
        
        // Question 3
        x = 50;
        y = x++;
        x--;
        y = ++x;
        z = --y;
        x = ++z;
        z++;
        x = z;
        y = --x;
        x = ++y;
        z = --x;
        System.out.println(x); // Output: 51
        System.out.println(y); // Output: 52
        System.out.println(z); // Output: 41
        System.out.println();
        
        // Question 4
        a = 60;
        b = a--;
        c = ++b;
        a = --c;
        b = a++;
        c = --b;
        a = ++c;
        b = --a;
        c = b++;
        a = ++c;
        b = --a;
        System.out.println(a); // Output: 59
        System.out.println(b); // Output: 59
        System.out.println(c); // Output: 60
        System.out.println();
        
        // Question 5
        a = 15;
        b = -a + a++;
        System.out.println(a); // Output: 16
        System.out.println(b); // Output: 0
        System.out.println();
        
        // Question 6
        int i = 18;
        int j = ++i - i-- + i++;
        System.out.println(i); // Output: 19
        System.out.println(j); // Output: 18
        System.out.println();
        
        // Question 7
        m = 7;
        n = --m + m-- - ++m;
        System.out.println(m); // Output: 6
        System.out.println(n); // Output: 6
        System.out.println();
        
        // Question 8
        x = 12;
        y = x++ + ++x - x-- + --x;
        System.out.println(x); // Output: 12
        System.out.println(y); // Output: 24
        System.out.println();
        
        // Question 9
        a = 30;
        b = ++a + a++;
        //31+31
        c = ++b + ++a + a++;
        //63+33+33
        int d = ++c + --a;
        //127+33
        System.out.println(a); // Output: 33
        System.out.println(b); // Output: 63
        System.out.println(c); // Output: 130
        System.out.println(d); // Output: 163
        System.out.println();
        
        // Question 10
        x = 50;
        y = ++x + x++;
        // 51+51
        z = ++y * x++ - y++;
        //103*52-103
        w = ++z + x++ + y++;
        //5202+53+104
        System.out.println(x); // Output: 54
        System.out.println(y); // Output: 105
        System.out.println(z); // Output: 5254
        System.out.println(w); // Output: 5411
        System.out.println();
    }


}
