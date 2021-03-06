/**
 * generated by Xtext
 */
package org.xtext.example.mydsl.generator;

import Configurator.ConfiguratorModel;
import Configurator.Constraint;
import Configurator.Parameter;
import Configurator.Value;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
@SuppressWarnings("all")
public class MyDslGenerator implements IGenerator {
  public static CharSequence compileToAndroid(final ConfiguratorModel it) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public static CharSequence compileToHtml(final ConfiguratorModel it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<link rel=\"stylesheet\" href=\"jqwidgets-ver3.8.0/jqwidgets/styles/jqx.base.css\" type=\"text/css\"/>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<script type=\"text/javascript\" src=\"jqwidgets-ver3.8.0/scripts/jquery-1.11.1.min.js\"></script>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<script type=\"text/javascript\" src=\"jqwidgets-ver3.8.0/jqwidgets/jqxcore.js\"></script>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<script type=\"text/javascript\" src=\"jqwidgets-ver3.8.0/jqwidgets/jqxbuttons.js\"></script>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<script type=\"text/javascript\" src=\"jqwidgets-ver3.8.0/jqwidgets/jqxscrollbar.js\"></script>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<script type=\"text/javascript\" src=\"jqwidgets-ver3.8.0/jqwidgets/jqxlistbox.js\"></script>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<script type=\"text/javascript\" src=\"jqwidgets-ver3.8.0/jqwidgets/jqxcombobox.js\"></script>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<script type=\'text/javascript\'>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("$(document).ready(function(){");
    _builder.newLine();
    {
      EList<Configurator.Enum> _enums = it.getEnums();
      for(final Configurator.Enum e : _enums) {
        _builder.append("\t\t\t\t");
        _builder.append("var $");
        String _name = e.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name);
        _builder.append(_firstUpper, "\t\t\t\t");
        _builder.append("Values = [");
        _builder.newLineIfNotEmpty();
        {
          EList<Value> _values = e.getValues();
          for(final Value eval : _values) {
            {
              EList<Value> _values_1 = e.getValues();
              EList<Value> _values_2 = e.getValues();
              int _size = _values_2.size();
              int _minus = (_size - 1);
              Value _get = _values_1.get(_minus);
              boolean _equals = Objects.equal(eval, _get);
              if (_equals) {
                _builder.append("\t\t\t\t");
                _builder.append("\"");
                _builder.append(eval, "\t\t\t\t");
                _builder.append("\"");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t\t\t\t");
                _builder.append("\"");
                _builder.append(eval, "\t\t\t\t");
                _builder.append("\",");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
        _builder.append("\t\t\t\t");
        _builder.append("];");
        _builder.newLine();
      }
    }
    _builder.append("\t\t\t\t");
    _builder.newLine();
    {
      EList<Parameter> _parameters = it.getParameters();
      for(final Parameter param : _parameters) {
        {
          Configurator.Enum _enum = param.getEnum();
          boolean _notEquals = (!Objects.equal(_enum, null));
          if (_notEquals) {
            _builder.append("$(\"#");
            String _name_1 = param.getName();
            String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
            _builder.append(_firstUpper_1, "");
            _builder.append("CB\").jqxComboBox({ source: $");
            Configurator.Enum _enum_1 = param.getEnum();
            String _name_2 = _enum_1.getName();
            String _firstUpper_2 = StringExtensions.toFirstUpper(_name_2);
            _builder.append(_firstUpper_2, "");
            _builder.append("Values, width: \'200px\', height: \'25px\',});");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("function checkConstraints() { ");
    _builder.newLine();
    {
      EList<Constraint> _constraints = it.getConstraints();
      for(final Constraint c : _constraints) {
      }
    }
    _builder.append("\t\t\t\t");
    _builder.append("};");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    {
      EList<Parameter> _parameters_1 = it.getParameters();
      for(final Parameter param_1 : _parameters_1) {
        {
          Configurator.Enum _enum_2 = param_1.getEnum();
          boolean _notEquals_1 = (!Objects.equal(_enum_2, null));
          if (_notEquals_1) {
            _builder.append("$(\'#");
            String _name_3 = param_1.getName();
            String _firstUpper_3 = StringExtensions.toFirstUpper(_name_3);
            _builder.append(_firstUpper_3, "");
            _builder.append("CB\').bind(\'select\', function (event) {\t\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("checkConstraints();\t\t");
            _builder.newLine();
            _builder.append("});");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("});");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</script>");
    _builder.newLine();
    _builder.append("  \t\t\t");
    _builder.append("</head>");
    _builder.newLine();
    _builder.append("  \t\t\t");
    _builder.append("<body>");
    _builder.newLine();
    _builder.append("  \t\t\t\t");
    _builder.append("<h2> ");
    String _name_4 = it.getName();
    String _firstUpper_4 = StringExtensions.toFirstUpper(_name_4);
    _builder.append(_firstUpper_4, "  \t\t\t\t");
    _builder.append(" </h2>");
    _builder.newLineIfNotEmpty();
    _builder.append("   \t\t\t\t");
    _builder.append("<hr/>");
    _builder.newLine();
    _builder.append("   \t\t\t\t");
    _builder.newLine();
    {
      EList<Parameter> _parameters_2 = it.getParameters();
      for(final Parameter param_2 : _parameters_2) {
        _builder.append("  \t\t\t\t");
        _builder.append("<h3>");
        String _name_5 = param_2.getName();
        String _firstUpper_5 = StringExtensions.toFirstUpper(_name_5);
        _builder.append(_firstUpper_5, "  \t\t\t\t");
        _builder.append(":</h3>");
        _builder.newLineIfNotEmpty();
        {
          Configurator.Enum _enum_3 = param_2.getEnum();
          boolean _notEquals_2 = (!Objects.equal(_enum_3, null));
          if (_notEquals_2) {
            _builder.append("  \t\t\t\t");
            _builder.append("<div id=\'");
            String _name_6 = param_2.getName();
            String _firstUpper_6 = StringExtensions.toFirstUpper(_name_6);
            _builder.append(_firstUpper_6, "  \t\t\t\t");
            _builder.append("CB\' class=\'combobox\'>");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t\t\t\t");
            _builder.append("</div>");
            _builder.newLine();
          } else {
            boolean _and = false;
            Configurator.Enum _enum_4 = param_2.getEnum();
            boolean _equals_1 = Objects.equal(_enum_4, null);
            if (!_equals_1) {
              _and = false;
            } else {
              EList<Parameter> _children = param_2.getChildren();
              boolean _isEmpty = _children.isEmpty();
              _and = _isEmpty;
            }
            if (_and) {
              _builder.append("<form>");
              _builder.newLine();
              {
                int _maxChosenValues = param_2.getMaxChosenValues();
                IntegerRange _upTo = new IntegerRange(1, _maxChosenValues);
                for(final Integer n : _upTo) {
                  _builder.append("<input type=\"text\"/>");
                  _builder.newLine();
                }
              }
              _builder.append("</form>\t\t\t\t\t\t");
              _builder.newLine();
            }
          }
        }
      }
    }
    _builder.append("  \t\t\t");
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder;
  }
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<ConfiguratorModel> _filter = Iterables.<ConfiguratorModel>filter(_iterable, ConfiguratorModel.class);
    final Consumer<ConfiguratorModel> _function = new Consumer<ConfiguratorModel>() {
      public void accept(final ConfiguratorModel it) {
        String _name = it.getName();
        final String fname = StringExtensions.toFirstUpper(_name);
        CharSequence _compileToAndroid = MyDslGenerator.compileToAndroid(it);
        fsa.generateFile((("fsm/" + fname) + ".java"), _compileToAndroid);
        CharSequence _compileToHtml = MyDslGenerator.compileToHtml(it);
        fsa.generateFile((("fsm/" + fname) + ".js"), _compileToHtml);
      }
    };
    _filter.forEach(_function);
  }
}
