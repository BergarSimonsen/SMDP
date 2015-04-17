package validation;

import Configurator.BinaryConstraint;
import Configurator.BinaryOperator;
import Configurator.Constraint;
import Configurator.Literal;
import Configurator.ParameterIdentifier;
import Configurator.UnaryConstraint;
import com.google.common.base.Objects;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class Constraints {
  protected static boolean _constraint(final BinaryConstraint it) {
    boolean _xblockexpression = false;
    {
      boolean _andOrOperatorConstraint = Constraints.andOrOperatorConstraint(it);
      InputOutput.<Boolean>println(Boolean.valueOf(_andOrOperatorConstraint));
      boolean _or = false;
      boolean _andOrOperatorConstraint_1 = Constraints.andOrOperatorConstraint(it);
      if (_andOrOperatorConstraint_1) {
        _or = true;
      } else {
        boolean _mathOperatorConstraint = Constraints.mathOperatorConstraint(it);
        _or = _mathOperatorConstraint;
      }
      _xblockexpression = _or;
    }
    return _xblockexpression;
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
      boolean _or_5 = false;
      Constraint _leftOperand = it.getLeftOperand();
      Class<? extends Constraint> _class = _leftOperand.getClass();
      boolean _equals_6 = Objects.equal(_class, ParameterIdentifier.class);
      if (_equals_6) {
        _or_5 = true;
      } else {
        Constraint _leftOperand_1 = it.getLeftOperand();
        Class<? extends Constraint> _class_1 = _leftOperand_1.getClass();
        boolean _equals_7 = Objects.equal(_class_1, Literal.class);
        _or_5 = _equals_7;
      }
      _and_1 = _or_5;
    }
    if (!_and_1) {
      _and = false;
    } else {
      boolean _or_6 = false;
      Constraint _rightOperand = it.getRightOperand();
      Class<? extends Constraint> _class_2 = _rightOperand.getClass();
      boolean _equals_8 = Objects.equal(_class_2, ParameterIdentifier.class);
      if (_equals_8) {
        _or_6 = true;
      } else {
        Constraint _rightOperand_1 = it.getRightOperand();
        Class<? extends Constraint> _class_3 = _rightOperand_1.getClass();
        boolean _equals_9 = Objects.equal(_class_3, Literal.class);
        _or_6 = _equals_9;
      }
      _and = _or_6;
    }
    return _and;
  }
  
  public static boolean andOrOperatorConstraint(final BinaryConstraint it) {
    boolean _xblockexpression = false;
    {
      InputOutput.<String>println("!!!");
      boolean _and = false;
      boolean _or = false;
      Constraint _leftOperand = it.getLeftOperand();
      Class<? extends Constraint> _class = _leftOperand.getClass();
      boolean _equals = _class.equals(BinaryConstraint.class);
      if (_equals) {
        _or = true;
      } else {
        Constraint _leftOperand_1 = it.getLeftOperand();
        Class<? extends Constraint> _class_1 = _leftOperand_1.getClass();
        boolean _equals_1 = _class_1.equals(UnaryConstraint.class);
        _or = _equals_1;
      }
      if (!_or) {
        _and = false;
      } else {
        boolean _or_1 = false;
        Constraint _rightOperand = it.getRightOperand();
        Class<? extends Constraint> _class_2 = _rightOperand.getClass();
        boolean _equals_2 = _class_2.equals(BinaryConstraint.class);
        if (_equals_2) {
          _or_1 = true;
        } else {
          Constraint _rightOperand_1 = it.getRightOperand();
          Class<? extends Constraint> _class_3 = _rightOperand_1.getClass();
          boolean _equals_3 = _class_3.equals(UnaryConstraint.class);
          _or_1 = _equals_3;
        }
        _and = _or_1;
      }
      InputOutput.<Boolean>println(Boolean.valueOf(_and));
      boolean _and_1 = false;
      boolean _and_2 = false;
      boolean _or_2 = false;
      boolean _or_3 = false;
      BinaryOperator _operator = it.getOperator();
      boolean _equals_4 = _operator.equals(BinaryOperator.AND);
      if (_equals_4) {
        _or_3 = true;
      } else {
        BinaryOperator _operator_1 = it.getOperator();
        boolean _equals_5 = _operator_1.equals(BinaryOperator.OR);
        _or_3 = _equals_5;
      }
      if (_or_3) {
        _or_2 = true;
      } else {
        BinaryOperator _operator_2 = it.getOperator();
        boolean _equals_6 = _operator_2.equals(BinaryOperator.XOR);
        _or_2 = _equals_6;
      }
      if (!_or_2) {
        _and_2 = false;
      } else {
        boolean _or_4 = false;
        Constraint _leftOperand_2 = it.getLeftOperand();
        Class<? extends Constraint> _class_4 = _leftOperand_2.getClass();
        boolean _equals_7 = _class_4.equals(BinaryConstraint.class);
        if (_equals_7) {
          _or_4 = true;
        } else {
          Constraint _leftOperand_3 = it.getLeftOperand();
          Class<? extends Constraint> _class_5 = _leftOperand_3.getClass();
          boolean _equals_8 = _class_5.equals(UnaryConstraint.class);
          _or_4 = _equals_8;
        }
        _and_2 = _or_4;
      }
      if (!_and_2) {
        _and_1 = false;
      } else {
        boolean _or_5 = false;
        Constraint _rightOperand_2 = it.getRightOperand();
        Class<? extends Constraint> _class_6 = _rightOperand_2.getClass();
        boolean _equals_9 = _class_6.equals(BinaryConstraint.class);
        if (_equals_9) {
          _or_5 = true;
        } else {
          Constraint _rightOperand_3 = it.getRightOperand();
          Class<? extends Constraint> _class_7 = _rightOperand_3.getClass();
          boolean _equals_10 = _class_7.equals(UnaryConstraint.class);
          _or_5 = _equals_10;
        }
        _and_1 = _or_5;
      }
      _xblockexpression = _and_1;
    }
    return _xblockexpression;
  }
  
  protected static boolean _constraint(final EObject it) {
    return true;
  }
  
  public static boolean constraint(final EObject it) {
    if (it instanceof BinaryConstraint) {
      return _constraint((BinaryConstraint)it);
    } else if (it != null) {
      return _constraint(it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
}
