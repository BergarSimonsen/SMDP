package validation;

import Configurator.BinaryConstraint;
import Configurator.BinaryOperator;
import Configurator.BooleanLiteral;
import Configurator.DoubleLiteral;
import Configurator.IntLiteral;
import Configurator.Literal;
import Configurator.Parameter;
import Configurator.ParameterIdentifier;
import Configurator.StringLiteral;
import Configurator.UnaryConstraint;
import com.google.common.base.Objects;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class Constraints {
  protected static boolean _constraint(final BinaryConstraint it) {
    boolean _or = false;
    boolean _andOrOperatorConstraint = Constraints.andOrOperatorConstraint(it);
    if (_andOrOperatorConstraint) {
      _or = true;
    } else {
      boolean _mathOperatorConstraint = Constraints.mathOperatorConstraint(it);
      _or = _mathOperatorConstraint;
    }
    return _or;
  }
  
  public static boolean mathOperatorConstraint(final BinaryConstraint it) {
    boolean _and = false;
    boolean _and_1 = false;
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
      _and_1 = false;
    } else {
      _and_1 = ((it.getLeftOperand() instanceof ParameterIdentifier) || (it.getLeftOperand() instanceof Literal));
    }
    if (!_and_1) {
      _and = false;
    } else {
      _and = ((it.getRightOperand() instanceof ParameterIdentifier) || (it.getRightOperand() instanceof Literal));
    }
    return _and;
  }
  
  public static boolean andOrOperatorConstraint(final BinaryConstraint it) {
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
      _and_1 = ((it.getLeftOperand() instanceof BinaryConstraint) || (it.getLeftOperand() instanceof UnaryConstraint));
    }
    if (!_and_1) {
      _and = false;
    } else {
      _and = ((it.getRightOperand() instanceof BinaryConstraint) || (it.getRightOperand() instanceof UnaryConstraint));
    }
    return _and;
  }
  
  protected static boolean _constraint(final Parameter it) {
    boolean _or = false;
    boolean _and = false;
    boolean _and_1 = false;
    EList<Literal> _literalValues = it.getLiteralValues();
    boolean _equals = Objects.equal(_literalValues, null);
    if (!_equals) {
      _and_1 = false;
    } else {
      EList<Configurator.Enum> _enumValue = it.getEnumValue();
      boolean _notEquals = (!Objects.equal(_enumValue, null));
      _and_1 = _notEquals;
    }
    if (!_and_1) {
      _and = false;
    } else {
      boolean _enumCountConstraint = Constraints.enumCountConstraint(it);
      _and = _enumCountConstraint;
    }
    if (_and) {
      _or = true;
    } else {
      boolean _and_2 = false;
      boolean _and_3 = false;
      boolean _and_4 = false;
      EList<Literal> _literalValues_1 = it.getLiteralValues();
      boolean _notEquals_1 = (!Objects.equal(_literalValues_1, null));
      if (!_notEquals_1) {
        _and_4 = false;
      } else {
        EList<Configurator.Enum> _enumValue_1 = it.getEnumValue();
        boolean _equals_1 = Objects.equal(_enumValue_1, null);
        _and_4 = _equals_1;
      }
      if (!_and_4) {
        _and_3 = false;
      } else {
        boolean _literalTypesConstraint = Constraints.literalTypesConstraint(it);
        _and_3 = _literalTypesConstraint;
      }
      if (!_and_3) {
        _and_2 = false;
      } else {
        boolean _literalCountConstraint = Constraints.literalCountConstraint(it);
        _and_2 = _literalCountConstraint;
      }
      _or = _and_2;
    }
    return _or;
  }
  
  public static boolean literalCountConstraint(final Parameter it) {
    boolean _and = false;
    EList<Literal> _literalValues = it.getLiteralValues();
    int _size = _literalValues.size();
    int _maxChosenValues = it.getMaxChosenValues();
    boolean _lessEqualsThan = (_size <= _maxChosenValues);
    if (!_lessEqualsThan) {
      _and = false;
    } else {
      EList<Literal> _literalValues_1 = it.getLiteralValues();
      int _size_1 = _literalValues_1.size();
      int _minChosenValues = it.getMinChosenValues();
      boolean _greaterEqualsThan = (_size_1 >= _minChosenValues);
      _and = _greaterEqualsThan;
    }
    return _and;
  }
  
  public static boolean enumCountConstraint(final Parameter it) {
    boolean _and = false;
    EList<Configurator.Enum> _enumValue = it.getEnumValue();
    int _size = _enumValue.size();
    int _maxChosenValues = it.getMaxChosenValues();
    boolean _lessEqualsThan = (_size <= _maxChosenValues);
    if (!_lessEqualsThan) {
      _and = false;
    } else {
      EList<Configurator.Enum> _enumValue_1 = it.getEnumValue();
      int _size_1 = _enumValue_1.size();
      int _minChosenValues = it.getMinChosenValues();
      boolean _greaterEqualsThan = (_size_1 >= _minChosenValues);
      _and = _greaterEqualsThan;
    }
    return _and;
  }
  
  public static boolean literalTypesConstraint(final Parameter it) {
    boolean _or = false;
    boolean _or_1 = false;
    boolean _or_2 = false;
    EList<Literal> _literalValues = it.getLiteralValues();
    final Function1<Literal, Boolean> _function = new Function1<Literal, Boolean>() {
      public Boolean apply(final Literal x) {
        return Boolean.valueOf((x instanceof IntLiteral));
      }
    };
    boolean _forall = IterableExtensions.<Literal>forall(_literalValues, _function);
    if (_forall) {
      _or_2 = true;
    } else {
      EList<Literal> _literalValues_1 = it.getLiteralValues();
      final Function1<Literal, Boolean> _function_1 = new Function1<Literal, Boolean>() {
        public Boolean apply(final Literal x) {
          return Boolean.valueOf((x instanceof StringLiteral));
        }
      };
      boolean _forall_1 = IterableExtensions.<Literal>forall(_literalValues_1, _function_1);
      _or_2 = _forall_1;
    }
    if (_or_2) {
      _or_1 = true;
    } else {
      EList<Literal> _literalValues_2 = it.getLiteralValues();
      final Function1<Literal, Boolean> _function_2 = new Function1<Literal, Boolean>() {
        public Boolean apply(final Literal x) {
          return Boolean.valueOf((x instanceof DoubleLiteral));
        }
      };
      boolean _forall_2 = IterableExtensions.<Literal>forall(_literalValues_2, _function_2);
      _or_1 = _forall_2;
    }
    if (_or_1) {
      _or = true;
    } else {
      EList<Literal> _literalValues_3 = it.getLiteralValues();
      final Function1<Literal, Boolean> _function_3 = new Function1<Literal, Boolean>() {
        public Boolean apply(final Literal x) {
          return Boolean.valueOf((x instanceof BooleanLiteral));
        }
      };
      boolean _forall_3 = IterableExtensions.<Literal>forall(_literalValues_3, _function_3);
      _or = _forall_3;
    }
    return _or;
  }
  
  protected static boolean _constraint(final UnaryConstraint it) {
    BinaryConstraint _operand = it.getOperand();
    return (_operand instanceof BinaryConstraint);
  }
  
  protected static boolean _constraint(final EObject it) {
    return true;
  }
  
  public static boolean constraint(final EObject it) {
    if (it instanceof BinaryConstraint) {
      return _constraint((BinaryConstraint)it);
    } else if (it instanceof Parameter) {
      return _constraint((Parameter)it);
    } else if (it instanceof UnaryConstraint) {
      return _constraint((UnaryConstraint)it);
    } else if (it != null) {
      return _constraint(it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
}
