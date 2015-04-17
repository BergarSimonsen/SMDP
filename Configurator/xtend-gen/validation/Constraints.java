package validation;

import Configurator.BinaryConstraint;
import Configurator.BinaryOperator;
import Configurator.Constraint;
import Configurator.Literal;
import Configurator.Parameter;
import Configurator.ParameterIdentifier;
import Configurator.UnaryConstraint;
import com.google.common.base.Objects;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;

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
    Literal _literalValue = it.getLiteralValue();
    boolean _equals = Objects.equal(_literalValue, null);
    if (!_equals) {
      _and = false;
    } else {
      Configurator.Enum _enumValue = it.getEnumValue();
      boolean _notEquals = (!Objects.equal(_enumValue, null));
      _and = _notEquals;
    }
    if (_and) {
      _or = true;
    } else {
      boolean _and_1 = false;
      Literal _literalValue_1 = it.getLiteralValue();
      boolean _notEquals_1 = (!Objects.equal(_literalValue_1, null));
      if (!_notEquals_1) {
        _and_1 = false;
      } else {
        Configurator.Enum _enumValue_1 = it.getEnumValue();
        boolean _equals_1 = Objects.equal(_enumValue_1, null);
        _and_1 = _equals_1;
      }
      _or = _and_1;
    }
    return _or;
  }
  
  protected static boolean _constraint(final UnaryConstraint it) {
    Constraint _operand = it.getOperand();
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
