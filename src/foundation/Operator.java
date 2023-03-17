package foundation;

/**
 * 关于运算符
 *
 * @author Bai_YiA2
 * @version 1.0
 */
public class Operator {
    public static void main(String[] args) {
        
        // !!!在运算中如果有小数可能造成精度流失
        double num1 = - 10.4 % 3;// -1.4
        if (num1 == - 1.4) {
            System.out.println("相等");
        } else {
            System.out.print("在运算中如果有小数可能造成精度流失，");
        }
        
        // !!!判断是否相等时，正确的方法应该判断差的绝对值是否在一个精度内：
        if ((Math.abs(num1 - - 1.4)) < 0.0000001) {
            System.out.println("判断是否相等时需要判断差的绝对值是否再一个范围之内");
        }
        /**
         * 关于算术运算符
         */
        /*
        +正号
        -负号
        +加法
        -减法
        *乘法
        /除法
        %取余
        ++自加
        --自减
        +字符串拼接
        其中+-*和数学一样
        --与++一样
        所以接下来着重演示/  %  ++
         */
        // /的使用
        System.out.println(10 / 4);// 从数学角度看，是2.5
        // java中因为两个是整数，所以得到整数2
        // 那么如果是：
        System.out.println(10.0 / 4);// 10.0是double(小数)，所以输出小数2.5   (自动转化)
        double n1 = 10 / 4;//java中10 / 4 = 2，2赋给double变成2.0
        System.out.println(n1);
        
        // %取余的使用
        System.out.println(10 % 3);// 10 / 3的余数 1
        System.out.println(- 10 % 3);// -1
        System.out.println(10 % - 3);// 1
        System.out.println(- 10 % - 3);// -1
        // 取余的负号与 % 左边的数负号相等
        
        // ++ 的使用
        // 1.独立使用   前++等于后++等于+1
        int n2 = 10;
        n2++;// 等价于n2 = n2 + 1 等价于++1
        System.out.println(n2);
        
        /*
         * 作为表达式使用
         * 前++：先加一再赋值
         * 后++：先赋值在加一
         */
        int n3 = 3;
        int n4 = ++ n3;//等价于n3 = n3 + 1;n4 = n3；先自增再执行表达式
        int n5 = n4++;//等价于n5 = n4;n4 = n4 + 1；先执行表达式在自增
        System.out.println(n3 + " " + n4 + " " + n5);
        
        //        // 关于算术运算符，来看面试题
        //        int n6 = 1;
        //        n6 = n6++;// 对于这个java会：先弄一个临时变量比如temp，
        //        temp = i;i = i + 1;i = temp，输出1
        //        System.out.println(n6);
        //        int n7 = 1;
        //        n7 = ++n7;// 对于这个java会：i = i + 1;再弄一个临时变量比如temp，
        //        temp = i;i = temp，输出2
        //        System.out.println(n7);
        //        // 也就是说，java在计算表达式时，会在算到x = x时将变量给予临时变量，
        //        在该表达式计算完后再将临时变量还给原来的变量
        
        /**
         * 关于关系运算符
         */
        // 关系运算符的结果是boolean类型，要么true，要么false
        /*
         ==相等与
         !=不等于
         <小于
         >大于
         <=小于等于
         >=大于等于
         instanceof检查是否是类的对象(面向对象)
         equals字符串相等
         */
        int n8 = 10;
        int n9 = 34;
        System.out.println(n8 == n9);
        System.out.println(n8 != n9);
        System.out.println(n8 < n9);
        System.out.println(n8 > n9);
        System.out.println(n8 <= n9);
        System.out.println(n8 >= n9);
        boolean b1 = "asd".equals("asd");
        System.out.println("b1 == " + b1);
        
        /**
         * 关于逻辑运算符
         */
        // 用于连接两个表达式，结果为boolean类型
        /*
         &&短路与：都为true输出true，其余为false，
         如果第一个为false则不执行第二个，直接false，效率高
         ||短路或：一个为true输出为true，其余为false，
         如果第一个为true则不执行第二个，直接true，效率高
         !取反(非运算)：true变false，false变true
         &逻辑与：都为true输出true，其余为false
         |逻辑或：一个为true输出为true，其余为false
         ^逻辑异或：两个不同输出true，其余为false
         */
        int n10 = 34;
        if (n10 < 40 && n10 > 20) {
            System.out.println("a");
        }
        
        // 演示逻辑和短路的区别
        // 一般使用短路，效率高
        int n11 = 23;
        if (n11 < 23 & ++ n11 > 234) { // 两个都执行，++n11执行，n11变成24
            System.out.println("true,n11 = " + n11);
        } else {
            System.out.println("false,n11 = " + n11);
        }
        if (n11 < 23 && ++ n11 > 234) { // 第一个为false，不执行第二个，++n11不执行，还是24
            System.out.println("true,n11 = " + n11);
        } else {
            System.out.println("false,n11 = " + n11);
        }
        System.out.println(! (34 > 345));
        boolean b2 = (324 > 223) ^ (234 < 234);
        System.out.println(1 == 2 | 34 == 2);
        
        /**
         * 关于赋值运算符
         */
        /*
         赋值运算符将某个值赋给变量
         左边只能是变量
         右边可以是变量，表达式，常量值

         基本赋值运算符 =

         复合赋值运算符
         a += b 等价于 a = a + b
         a -= b 等价于 a = a - b
         a *= b 等价于 a = a * b
         a /= b 等价于 a = a / b
         a %= b 等价于 a = a % b
         */
        int n12 = 12;
        n12 += 23;
        // 等价于 n12 = 12 + 23
        // 复合运算符会进行类型转换
        byte n13 = 34;
        n13 -= 23;// 等价于 n13 = (byte)(n14 - 23)
        
        /**
         * 关于三元运算符
         */
        // 基本语法，条件表达式?表达式1:表达式2; 表达式1,2要为可以符合当前语句的类型
        // 三元运算符可以转为if--else
        // 条件true计算表达式1
        // 为false计算表达式2
        System.out.println(n12 > n13 ? n13 + 23 : n12 + 23);
        // n12 == 35; n13 == 11;
        // n12 > n13 true
        // 执行n13 + 23; n13 == 34; 输出34
        
        /**
         * 关于运算符优先级
         */
        /*
         优先级从上到下
         箭头表示运算方向
         .  ()  {}  ;  ,
         ++  --  ~  !(data type)              <--
         *  /  %                              -->
         +  -                                 -->
         <<  >>  >>>                          -->
         <  >  <=  >=  instanceof             -->
         ==  !=                               -->
         &                                    -->
         ^                                    -->
         |                                    -->
         &&                                   -->
         ||                                   -->
         ?:                                   -->
         =  *=  /=  %=                        <--
         +=  -=  <<=  >>=                     <--
         >>>=  &=  ^=  |=                     <--

         1.（）{}等
         2.单目运算符++--
         3.算术运算符+-*
         4.位移运算符
         5.比较运算符
         6.逻辑运算符
         7.三元运算符
         8.赋值运算符
         除了单目运算符和赋值运算符是从右到左
         其余都是从左到右
         1类除外
         */
        
        /**
         * 标志符命名规则和规范
         */
        /*
         规则（必须遵守）：
         英文字母大小写 1234567890 $
         不能以数字开头 int 3df = 2;//错
         不能单独使用关键字（已经被java设计者使用了）和保留字（未来可能变成关键字）
         严格区分大小写，长度无限制
         不能包含空格
         */
        /*
         规范（更加专业）：
         包名：都小写
         类名接口名：大驼峰命名法（每个单词首字母大写）
         变量名方法名：小驼峰命名法（除第一个单词开头小写外，其他单词开头大写）（简称驼峰法）
         常量名：都大写，单词间用下划线间隔
         */
        
        /**
         * 关于进制
         */
        /*
         在java中有四种进制：
         二进制：01以0b或0B开头
         八进制：01234567以0开头
         十进制：0123456789
         十六进制0123456789ABCDEF或abcdef以0x或0X开头
         进制的转换：
         二转十：
         从最右边开始，将每个数位 * 2 ^ (位数 - 1)，最后求和
         八转十:
         从最右边起，将每个数 * 8 ^ (位数 - 1)，最后求和
         十六转十：
         从最右边起，将每个数 * 16 ^ (位数 - 1)，最后求和
         十转二：
         一直除2 直到商0 将每步余数倒序排列
         十转八：
         一直除8 直到商0 将每步余数倒序排列
         十转十六：
         一直除16 直到商0 将每步余数倒序排列
         二转八：
         从右边起，将二进制数每三位一组，转成对应八进制数
         二转十六：
         从右边起，将二进制数每四位一组，转成对应十六进制数
         八转二：
         将每一位转为一个三位的二进制数
         十六转二：
         将每一位转为一个四位的二进制数
         八转十六：
         从右边起，将八进制数每两位一组，转成对应十六进制数
         十六转八：
         将每一位转为一个两位的八进制数
         */
        
        /**
         * 关于位运算符
         */
        /*
         原码，反码，补码：
         二进制最高位是符号位，0表示整数，1表示负数
         正数的原码反码补码都一样
         负数的反码，原码符号位不变，其他位取反(0 -> 1 1 -> 0)
         负数的补码 = 反码 + 1，负数的反码 = 补码 - 1
         0的反码补码都是0
         java没有无符号数
         计算机运算时都是以补码的方式运算的(可以统一正数和负数)
         在看结果时要看原码!!!
         */
        /*
         按位运算时，需要两个数字的，每一个位对齐(包括符号位（单独对齐）)
         按位与&：  全为1，结果为1，否则为0
         按位或|：  有一个1，结果为1，否则为0
         按位异或^：一个0，一个1，结果为1，否则为0
         按位取反~：每一位1变0,0变1，只需要一个数
         看例子：
         */
        // 2 & 3 = ?
        System.out.println("2 & 3 = " + (2 & 3));
        /*
         分析：
         2和3是int类型
         2的原码00000000 00000000 00000000 00000010
         2的补码00000000 00000000 00000000 00000010
         3的原码00000000 00000000 00000000 00000011
         3的补码00000000 00000000 00000000 00000011
         按位与
         00000000 00000000 00000000 00000010
         00000000 00000000 00000000 00000011
         00000000 00000000 00000000 00000010 运算后的补码
         开头0为正，原码也是00000000 00000000 00000000 00000010
         即2
         */
        // ~ -2 = ?
        System.out.println("~ -2 = " + (~ - 2));
        /*
         分析：
         -2的原码10000000 00000000 00000000 00000010
         -2的补码11111111 11111111 11111111 11111110
         按位取反得0000000 00000000 00000000 00000001 运算后的补码
         为正数原码为00000000 00000000 00000000 00000001
         即1
         */
        // ~ 2 = ?
        System.out.println("~ 2 = " + (~ 2));
        /*
         分析：
         2的原码00000000 00000000 00000000 00000010
         2的补码00000000 00000000 00000000 00000010
         按位取反得：11111111 11111111 11111111 11111101 运算后的补码
         原码为：10000000 00000000 00000000 00000011
         即-3
         */
        // 2 | 3 = ?
        System.out.println("2 | 3 = " + (2 | 3));
        /*
         分析：
         2的原码00000000 00000000 00000000 00000010
         2的补码00000000 00000000 00000000 00000010
         3的原码00000000 00000000 00000000 00000011
         3的补码00000000 00000000 00000000 00000011
         按位或
         00000000 00000000 00000000 00000010
         00000000 00000000 00000000 00000011
         00000000 00000000 00000000 00000011 运算后的补码
         即3
         */
        // 2 ^ 3 = ?
        System.out.println("2 ^ 3 = " + (2 ^ 3));
        /*
         分析：
         的原码00000000 00000000 00000000 00000010
         2的补码00000000 00000000 00000000 00000010
         3的原码00000000 00000000 00000000 00000011
         3的补码00000000 00000000 00000000 00000011
         按位异或
         00000000 00000000 00000000 00000010
         00000000 00000000 00000000 00000011
         00000000 00000000 00000000 00000001 运算后的补码
         是正数，原码也是00000000 00000000 00000000 00000001
         即1
         */
        /*
         位运算符：
         算数右移>>：低位溢出，符号位不变，用符号位补上溢出的高位，移一位相当于除以2。
         a >> b = a / 2 ^ b
         算数左移<<：符号位不变，低位补0，移一位相当于乘2。a << b = a * 2 ^ b
         >>>逻辑右移（无符号右移）：低位溢出，高位补0
         看案例：
         */
        System.out.println(1 >> 2);
        // 00000001 -> 00000000 也就是1 / 2 / 2
        System.out.println(1 << 2);
        // 00000001 -> 00000100 也就是1 * 2 * 2
        System.out.println(1 >>> 2);
        // 00000001 -> 00000000
        
    }
}