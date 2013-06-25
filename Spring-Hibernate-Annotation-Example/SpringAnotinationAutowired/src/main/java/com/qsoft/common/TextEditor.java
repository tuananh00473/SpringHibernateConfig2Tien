package com.qsoft.common;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created with IntelliJ IDEA.
 * User: anhnt
 * Date: 6/25/13
 * Time: 5:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class TextEditor
{
    private SpellChecker spellChecker;

//    You can use @Autowired annotation on setter methods
//      to get rid of the <property> element in XML configuration file.
//      When Spring finds an @Autowired annotation used with setter methods,
//      it tries to perform byType autowiring on the method.

    @Autowired
    public void setSpellChecker(SpellChecker spellChecker)
    {
        this.spellChecker = spellChecker;
    }

    public SpellChecker getSpellChecker()
    {
        return spellChecker;
    }

    public void spellCheck()
    {
        spellChecker.checkSpelling();
    }
}
