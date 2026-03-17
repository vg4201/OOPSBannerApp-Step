public class OOPSuc7 {
static class CharacterPatternMap
{
private char character;
private String pattern[];
public CharacterPatternMap(char character,String pattern[])
{
	this.character=character;
	this.pattern=pattern;
}
public char getCharacter()
{
	return character;
}
public String[] getPattern()
{
	return pattern;
}
}
public static String[] getOPattern()
{
	return new String[]
	{
"   ***   ",
" **   ** ",
"**     **",
"**     **",
"**     **",
" **   ** ",
"   ***   "
};
}
public static String[] getPPattern()
{
return new String[]
{
"*****",
"*    *",
"*    *",
"*    *",
"*****",
"*   ",
"*   ",
"*   "
};
}
public static String[] getSPattern()
{
return new String[]
{
" *****",
"*",
"*",
" *****",
"      *",
"       *",
"  *****"
};
}
public static void main(String args[])
{
	CharacterPatternMap o=new CharacterPatternMap('O',getOPattern());
	CharacterPatternMap p=new CharacterPatternMap('P',getPPattern());
	CharacterPatternMap s=new CharacterPatternMap('S',getSPattern());
	for(int i=0;i<7;i++)
	{
		System.out.println(o.getPattern()[i]+" "+o.getPattern()[i]+" "+p.getPattern()[i]+" "+s.getPattern()[i]);
	}
}
}