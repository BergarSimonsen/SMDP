package validation;

import Configurator.BinaryExpression;
import Configurator.BinaryOperator;
import Configurator.BooleanLiteral;
import Configurator.DoubleLiteral;
import Configurator.Expression;
import Configurator.IntLiteral;
import Configurator.NamedElement;
import Configurator.Parameter;
import Configurator.ParameterIdentifier;
import Configurator.StringLiteral;
import Configurator.Value;
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
  protected static boolean _constraint(final BinaryExpression it) {
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
  
  protected static boolean _constraint(final Parameter it) {
    boolean _xblockexpression = false;
    {
      InputOutput.<String>println("parameterconstraints");
      boolean _or = false;
      boolean _or_1 = false;
      boolean _and = false;
      boolean _and_1 = false;
      boolean _and_2 = false;
      boolean _and_3 = false;
      EList<Value> _literalValues = it.getLiteralValues();
      boolean _isEmpty = _literalValues.isEmpty();
      if (!_isEmpty) {
        _and_3 = false;
      } else {
        EList<Value> _enumValues = it.getEnumValues();
        boolean _isEmpty_1 = _enumValues.isEmpty();
        boolean _not = (!_isEmpty_1);
        _and_3 = _not;
      }
      if (!_and_3) {
        _and_2 = false;
      } else {
        boolean _paramEnumConstraint = Constraints.paramEnumConstraint(it);
        _and_2 = _paramEnumConstraint;
      }
      if (!_and_2) {
        _and_1 = false;
      } else {
        boolean _enumCountConstraint = Constraints.enumCountConstraint(it);
        _and_1 = _enumCountConstraint;
      }
      if (!_and_1) {
        _and = false;
      } else {
        boolean _paramChildrenConstraint = Constraints.paramChildrenConstraint(it);
        boolean _not_1 = (!_paramChildrenConstraint);
        _and = _not_1;
      }
      if (_and) {
        _or_1 = true;
      } else {
        boolean _and_4 = false;
        boolean _and_5 = false;
        boolean _and_6 = false;
        boolean _and_7 = false;
        EList<Value> _literalValues_1 = it.getLiteralValues();
        boolean _isEmpty_2 = _literalValues_1.isEmpty();
        boolean _not_2 = (!_isEmpty_2);
        if (!_not_2) {
          _and_7 = false;
        } else {
          EList<Value> _enumValues_1 = it.getEnumValues();
          boolean _isEmpty_3 = _enumValues_1.isEmpty();
          _and_7 = _isEmpty_3;
        }
        if (!_and_7) {
          _and_6 = false;
        } else {
          boolean _literalTypesConstraint = Constraints.literalTypesConstraint(it);
          _and_6 = _literalTypesConstraint;
        }
        if (!_and_6) {
          _and_5 = false;
        } else {
          boolean _literalCountConstraint = Constraints.literalCountConstraint(it);
          _and_5 = _literalCountConstraint;
        }
        if (!_and_5) {
          _and_4 = false;
        } else {
          boolean _paramChildrenConstraint_1 = Constraints.paramChildrenConstraint(it);
          boolean _not_3 = (!_paramChildrenConstraint_1);
          _and_4 = _not_3;
        }
        _or_1 = _and_4;
      }
      if (_or_1) {
        _or = true;
      } else {
        boolean _and_8 = false;
        boolean _and_9 = false;
        boolean _and_10 = false;
        boolean _paramChildrenConstraint_2 = Constraints.paramChildrenConstraint(it);
        if (!_paramChildrenConstraint_2) {
          _and_10 = false;
        } else {
          EList<Value> _literalValues_2 = it.getLiteralValues();
          boolean _isEmpty_4 = _literalValues_2.isEmpty();
          _and_10 = _isEmpty_4;
        }
        if (!_and_10) {
          _and_9 = false;
        } else {
          EList<Value> _enumValues_2 = it.getEnumValues();
          boolean _isEmpty_5 = _enumValues_2.isEmpty();
          _and_9 = _isEmpty_5;
        }
        if (!_and_9) {
          _and_8 = false;
        } else {
          Configurator.Enum _enum = it.getEnum();
          boolean _equals = Objects.equal(_enum, null);
          _and_8 = _equals;
        }
        _or = _and_8;
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
      EList<Value> _values = it.getValues();
      int _size = _values.size();
      boolean _greaterThan = (_size > 0);
      if (!_greaterThan) {
        _and = false;
      } else {
        EList<Value> _values_1 = it.getValues();
        final Function1<Value, Boolean> _function = new Function1<Value, Boolean>() {
          public Boolean apply(final Value x) {
            EClass _eClass = x.eClass();
            EList<Value> _values = it.getValues();
            Value _get = _values.get(0);
            EClass _eClass_1 = _get.eClass();
            return Boolean.valueOf(Objects.equal(_eClass, _eClass_1));
          }
        };
        boolean _forall = IterableExtensions.<Value>forall(_values_1, _function);
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
      boolean _or = false;
      String _name = it.getName();
      boolean _equals = Objects.equal(_name, null);
      if (_equals) {
        _or = true;
      } else {
        String _name_1 = it.getName();
        boolean _isEmpty = _name_1.isEmpty();
        _or = _isEmpty;
      }
      _xblockexpression = (!_or);
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
  
  public static boolean paramEnumConstraint(final Parameter it) {
    boolean _xblockexpression = false;
    {
      InputOutput.<String>println("paramenumconstraint");
      boolean _and = false;
      Configurator.Enum _enum = it.getEnum();
      boolean _notEquals = (!Objects.equal(_enum, null));
      if (!_notEquals) {
        _and = false;
      } else {
        EList<Value> _enumValues = it.getEnumValues();
        final Function1<Value, Boolean> _function = new Function1<Value, Boolean>() {
          public Boolean apply(final Value x) {
            Configurator.Enum _enum = it.getEnum();
            EList<Value> _values = _enum.getValues();
            return Boolean.valueOf(_values.contains(x));
          }
        };
        boolean _forall = IterableExtensions.<Value>forall(_enumValues, _function);
        _and = _forall;
      }
      _xblockexpression = _and;
    }
    return _xblockexpression;
  }
  
  public static boolean literalTypesConstraint(final Parameter it) {
    boolean _xblockexpression = false;
    {
      InputOutput.<String>println("literaltypesconstraint");
      boolean _or = false;
      boolean _or_1 = false;
      boolean _or_2 = false;
      EList<Value> _literalValues = it.getLiteralValues();
      final Function1<Value, Boolean> _function = new Function1<Value, Boolean>() {
        public Boolean apply(final Value x) {
          return Boolean.valueOf((x instanceof IntLiteral));
        }
      };
      boolean _forall = IterableExtensions.<Value>forall(_literalValues, _function);
      if (_forall) {
        _or_2 = true;
      } else {
        EList<Value> _literalValues_1 = it.getLiteralValues();
        final Function1<Value, Boolean> _function_1 = new Function1<Value, Boolean>() {
          public Boolean apply(final Value x) {
            return Boolean.valueOf((x instanceof StringLiteral));
          }
        };
        boolean _forall_1 = IterableExtensions.<Value>forall(_literalValues_1, _function_1);
        _or_2 = _forall_1;
      }
      if (_or_2) {
        _or_1 = true;
      } else {
        EList<Value> _literalValues_2 = it.getLiteralValues();
        final Function1<Value, Boolean> _function_2 = new Function1<Value, Boolean>() {
          public Boolean apply(final Value x) {
            return Boolean.valueOf((x instanceof DoubleLiteral));
          }
        };
        boolean _forall_2 = IterableExtensions.<Value>forall(_literalValues_2, _function_2);
        _or_1 = _forall_2;
      }
      if (_or_1) {
        _or = true;
      } else {
        EList<Value> _literalValues_3 = it.getLiteralValues();
        final Function1<Value, Boolean> _function_3 = new Function1<Value, Boolean>() {
          public Boolean apply(final Value x) {
            return Boolean.valueOf((x instanceof BooleanLiteral));
          }
        };
        boolean _forall_3 = IterableExtensions.<Value>forall(_literalValues_3, _function_3);
        _or = _forall_3;
      }
      _xblockexpression = _or;
    }
    return _xblockexpression;
  }
  
  public static boolean literalCountConstraint(final Parameter it) {
    boolean _xblockexpression = false;
    {
      InputOutput.<String>println("literalContConstraint");
      boolean _and = false;
      EList<Value> _literalValues = it.getLiteralValues();
      int _size = _literalValues.size();
      int _maxChosenValues = it.getMaxChosenValues();
      boolean _lessEqualsThan = (_size <= _maxChosenValues);
      if (!_lessEqualsThan) {
        _and = false;
      } else {
        EList<Value> _literalValues_1 = it.getLiteralValues();
        int _size_1 = _literalValues_1.size();
        int _minChosenValues = it.getMinChosenValues();
        boolean _greaterEqualsThan = (_size_1 >= _minChosenValues);
        _and = _greaterEqualsThan;
      }
      _xblockexpression = _and;
    }
    return _xblockexpression;
  }
  
  public static boolean paramChildrenConstraint(final Parameter it) {
    boolean _xblockexpression = false;
    {
      InputOutput.<String>println("Paramchildrenconstraint");
      boolean _and = false;
      EList<Parameter> _children = it.getChildren();
      int _size = _children.size();
      boolean _greaterThan = (_size > 0);
      if (!_greaterThan) {
        _and = false;
      } else {
        EList<Parameter> _children_1 = it.getChildren();
        final Function1<Parameter, Boolean> _function = new Function1<Parameter, Boolean>() {
          public Boolean apply(final Parameter x) {
            return Boolean.valueOf((!Objects.equal(x, it)));
          }
        };
        boolean _forall = IterableExtensions.<Parameter>forall(_children_1, _function);
        _and = _forall;
      }
      _xblockexpression = _and;
    }
    return _xblockexpression;
  }
  
  public static boolean enumCountConstraint(final Parameter it) {
    boolean _xblockexpression = false;
    {
      InputOutput.<String>println("enumcountconstraint");
      boolean _and = false;
      EList<Value> _enumValues = it.getEnumValues();
      int _size = _enumValues.size();
      int _maxChosenValues = it.getMaxChosenValues();
      boolean _lessEqualsThan = (_size <= _maxChosenValues);
      if (!_lessEqualsThan) {
        _and = false;
      } else {
        EList<Value> _enumValues_1 = it.getEnumValues();
        int _size_1 = _enumValues_1.size();
        int _minChosenValues = it.getMinChosenValues();
        boolean _greaterEqualsThan = (_size_1 >= _minChosenValues);
        _and = _greaterEqualsThan;
      }
      _xblockexpression = _and;
    }
    return _xblockexpression;
  }
  
  public static boolean mathOperatorConstraint(final BinaryExpression it) {
    boolean _xblockexpression = false;
    {
      InputOutput.<String>println("mathoperatorconstraint");
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
        _and_1 = ((it.getLeftOperand() instanceof ParameterIdentifier) || (it.getLeftOperand() instanceof Value));
      }
      if (!_and_1) {
        _and = false;
      } else {
        _and = ((it.getRightOperand() instanceof ParameterIdentifier) || (it.getRightOperand() instanceof Value));
      }
      _xblockexpression = _and;
    }
    return _xblockexpression;
  }
  
  public static boolean andOrOperatorConstraint(final BinaryExpression it) {
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
        Expression _leftOperand = it.getLeftOperand();
        _and_1 = (_leftOperand instanceof BinaryExpression);
      }
      if (!_and_1) {
        _and = false;
      } else {
        Expression _rightOperand = it.getRightOperand();
        _and = (_rightOperand instanceof BinaryExpression);
      }
      _xblockexpression = _and;
    }
    return _xblockexpression;
  }
  
  public static boolean constraint(final EObject it) {
    if (it instanceof BinaryExpression) {
      return _constraint((BinaryExpression)it);
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
