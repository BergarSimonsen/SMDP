package validation;

import Configurator.BinaryConstraint;
import Configurator.BinaryOperator;
import Configurator.Constraint;
import Configurator.Literal;
import Configurator.NamedElement;
import Configurator.Parameter;
import Configurator.ParameterIdentifier;
import Configurator.Type;
import com.google.common.base.Objects;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class Constraints {
  protected static boolean _constraint(final BinaryConstraint it) {
    boolean _xblockexpression = false;
    {
      boolean _mathOperatorConstraint = Constraints.mathOperatorConstraint(it);
      String _plus = ("mathOperatorConstraint: " + Boolean.valueOf(_mathOperatorConstraint));
      InputOutput.<String>println(_plus);
      boolean _mathOperatorConstraint_1 = Constraints.mathOperatorConstraint(it);
      String _plus_1 = ("andOrOperatorConstraint: " + Boolean.valueOf(_mathOperatorConstraint_1));
      InputOutput.<String>println(_plus_1);
      boolean _or = false;
      boolean _andOrOperatorConstraint = Constraints.andOrOperatorConstraint(it);
      if (_andOrOperatorConstraint) {
        _or = true;
      } else {
        boolean _mathOperatorConstraint_2 = Constraints.mathOperatorConstraint(it);
        _or = _mathOperatorConstraint_2;
      }
      _xblockexpression = _or;
    }
    return _xblockexpression;
  }
  
  protected static boolean _constraint(final Configurator.Enum it) {
    boolean _xblockexpression = false;
    {
      InputOutput.<String>println("enumconstraint");
      boolean _and = false;
      EList<Literal> _values = it.getValues();
      int _size = _values.size();
      boolean _greaterThan = (_size > 0);
      if (!_greaterThan) {
        _and = false;
      } else {
        EList<Literal> _values_1 = it.getValues();
        final Function1<Literal, Boolean> _function = new Function1<Literal, Boolean>() {
          public Boolean apply(final Literal x) {
            EClass _eClass = x.eClass();
            EList<Literal> _values = it.getValues();
            Literal _get = _values.get(0);
            EClass _eClass_1 = _get.eClass();
            return Boolean.valueOf(Objects.equal(_eClass, _eClass_1));
          }
        };
        boolean _forall = IterableExtensions.<Literal>forall(_values_1, _function);
        _and = _forall;
      }
      _xblockexpression = _and;
    }
    return _xblockexpression;
  }
  
  protected static boolean _constraint(final NamedElement it) {
    boolean _xblockexpression = false;
    {
      InputOutput.<String>println("nameconstraint");
      boolean _and = false;
      String _name = it.getName();
      boolean _notEquals = (!Objects.equal(_name, null));
      if (!_notEquals) {
        _and = false;
      } else {
        String _name_1 = it.getName();
        boolean _isEmpty = _name_1.isEmpty();
        boolean _not = (!_isEmpty);
        _and = _not;
      }
      _xblockexpression = _and;
    }
    return _xblockexpression;
  }
  
  protected static boolean _constraint(final Parameter it) {
    boolean _xblockexpression = false;
    {
      String _name = it.getName();
      String _plus = ("parameterConstraint " + _name);
      InputOutput.<String>println(_plus);
      boolean _and = false;
      boolean _or = false;
      boolean _and_1 = false;
      Type _type = it.getType();
      if (!(_type instanceof Configurator.Enum)) {
        _and_1 = false;
      } else {
        boolean _enumCountConstraint = Constraints.enumCountConstraint(it);
        _and_1 = _enumCountConstraint;
      }
      if (_and_1) {
        _or = true;
      } else {
        _or = (!(it.getType() instanceof Configurator.Enum));
      }
      if (!_or) {
        _and = false;
      } else {
        int _maxChosenValues = it.getMaxChosenValues();
        int _minChosenValues = it.getMinChosenValues();
        boolean _greaterEqualsThan = (_maxChosenValues >= _minChosenValues);
        _and = _greaterEqualsThan;
      }
      _xblockexpression = _and;
    }
    return _xblockexpression;
  }
  
  protected static boolean _constraint(final EObject it) {
    boolean _xblockexpression = false;
    {
      InputOutput.<String>println("default constraint");
      _xblockexpression = true;
    }
    return _xblockexpression;
  }
  
  public static boolean andOrOperatorConstraint(final BinaryConstraint it) {
    boolean _xblockexpression = false;
    {
      InputOutput.<String>println("andoroperatorconstraint");
      boolean _and = false;
      boolean _and_1 = false;
      boolean _or = false;
      boolean _or_1 = false;
      BinaryOperator _operator = it.getOperator();
      boolean _equals = _operator.equals(BinaryOperator.AND);
      if (_equals) {
        _or_1 = true;
      } else {
        BinaryOperator _operator_1 = it.getOperator();
        boolean _equals_1 = _operator_1.equals(BinaryOperator.OR);
        _or_1 = _equals_1;
      }
      if (_or_1) {
        _or = true;
      } else {
        BinaryOperator _operator_2 = it.getOperator();
        boolean _equals_2 = _operator_2.equals(BinaryOperator.XOR);
        _or = _equals_2;
      }
      if (!_or) {
        _and_1 = false;
      } else {
        Constraint _leftOperand = it.getLeftOperand();
        _and_1 = (_leftOperand instanceof BinaryConstraint);
      }
      if (!_and_1) {
        _and = false;
      } else {
        Constraint _rightOperand = it.getRightOperand();
        _and = (_rightOperand instanceof BinaryConstraint);
      }
      _xblockexpression = _and;
    }
    return _xblockexpression;
  }
  
  public static boolean mathOperatorConstraint(final BinaryConstraint it) {
    boolean _xblockexpression = false;
    {
      InputOutput.<String>println("mathoperatorconstraint");
      boolean _and = false;
      boolean _or = false;
      boolean _or_1 = false;
      boolean _or_2 = false;
      boolean _or_3 = false;
      boolean _or_4 = false;
      BinaryOperator _operator = it.getOperator();
      boolean _equals = _operator.equals(BinaryOperator.NOTEQUALS);
      if (_equals) {
        _or_4 = true;
      } else {
        BinaryOperator _operator_1 = it.getOperator();
        boolean _equals_1 = _operator_1.equals(BinaryOperator.EQUALS);
        _or_4 = _equals_1;
      }
      if (_or_4) {
        _or_3 = true;
      } else {
        BinaryOperator _operator_2 = it.getOperator();
        boolean _equals_2 = _operator_2.equals(BinaryOperator.GT);
        _or_3 = _equals_2;
      }
      if (_or_3) {
        _or_2 = true;
      } else {
        BinaryOperator _operator_3 = it.getOperator();
        boolean _equals_3 = _operator_3.equals(BinaryOperator.GTEQ);
        _or_2 = _equals_3;
      }
      if (_or_2) {
        _or_1 = true;
      } else {
        BinaryOperator _operator_4 = it.getOperator();
        boolean _equals_4 = _operator_4.equals(BinaryOperator.LT);
        _or_1 = _equals_4;
      }
      if (_or_1) {
        _or = true;
      } else {
        BinaryOperator _operator_5 = it.getOperator();
        boolean _equals_5 = _operator_5.equals(BinaryOperator.LTEQ);
        _or = _equals_5;
      }
      if (!_or) {
        _and = false;
      } else {
        _and = ((it.getLeftOperand() instanceof ParameterIdentifier) && ((it.getRightOperand() instanceof Literal) || (it.getRightOperand() instanceof ParameterIdentifier)));
      }
      _xblockexpression = _and;
    }
    return _xblockexpression;
  }
  
  public static boolean enumCountConstraint(final Parameter it) {
    boolean _xblockexpression = false;
    {
      String _name = it.getName();
      String _plus = ("enumcountconstraint " + _name);
      InputOutput.<String>println(_plus);
      Type _type = it.getType();
      final Configurator.Enum enumType = ((Configurator.Enum) _type);
      boolean _and = false;
      EList<Literal> _values = enumType.getValues();
      int _size = _values.size();
      int _maxChosenValues = it.getMaxChosenValues();
      boolean _greaterEqualsThan = (_size >= _maxChosenValues);
      if (!_greaterEqualsThan) {
        _and = false;
      } else {
        EList<Literal> _values_1 = enumType.getValues();
        int _size_1 = _values_1.size();
        int _minChosenValues = it.getMinChosenValues();
        boolean _greaterEqualsThan_1 = (_size_1 >= _minChosenValues);
        _and = _greaterEqualsThan_1;
      }
      _xblockexpression = _and;
    }
    return _xblockexpression;
  }
  
  public static boolean constraint(final EObject it) {
    if (it instanceof BinaryConstraint) {
      return _constraint((BinaryConstraint)it);
    } else if (it instanceof Configurator.Enum) {
      return _constraint((Configurator.Enum)it);
    } else if (it instanceof Parameter) {
      return _constraint((Parameter)it);
    } else if (it instanceof NamedElement) {
      return _constraint((NamedElement)it);
    } else if (it != null) {
      return _constraint(it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
}
