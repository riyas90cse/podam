package uk.co.jemos.podam.test.unit.features.typeManufacturing;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Title;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import uk.co.jemos.podam.api.AttributeMetadata;
import uk.co.jemos.podam.api.DataProviderStrategy;
import uk.co.jemos.podam.common.PodamConstants;
import uk.co.jemos.podam.test.dto.SimplePojoToTestSetters;
import uk.co.jemos.podam.test.enums.ExternalRatePodamEnum;
import uk.co.jemos.podam.test.unit.AbstractPodamSteps;
import uk.co.jemos.podam.typeManufacturers.TypeManufacturerParamsWrapper;
import uk.co.jemos.podam.typeManufacturers.TypeManufacturerParamsWrapperForGenericTypes;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by tedonema on 28/06/2015.
 */
@RunWith(SerenityRunner.class)
public class TypeManufacturingTests extends AbstractPodamSteps {

    /** The application logger */
    private static final Logger LOG = LogManager.getLogger(TypeManufacturingTests.class);

    @Test
    @Title("Podam Spring application context should return an int primitive value")
    public void podamApplicationContextShouldReturnAnIntValue() throws Exception {

        DataProviderStrategy dataProviderStrategy = podamFactorySteps.givenARandomDataProviderStrategy();

        AbstractApplicationContext applicationContext = podamFactorySteps.givenPodamRootApplicationContext();
        podamValidationSteps.theObjectShouldNotBeNull(applicationContext);

        try {
            MessageChannel inputChannel = podamFactorySteps.givenAMessageChannelToManufactureValues(applicationContext);
            podamValidationSteps.theObjectShouldNotBeNull(inputChannel);

            AttributeMetadata attributeMetadata = podamFactorySteps.givenAnEmptyAttributeMetadata
                    (SimplePojoToTestSetters.class);
            podamValidationSteps.theObjectShouldNotBeNull(attributeMetadata);

            TypeManufacturerParamsWrapper paramsWrapper =
                    new TypeManufacturerParamsWrapper(dataProviderStrategy, attributeMetadata);

            Message<? extends Object> intMessage = podamFactorySteps.givenATypeManufacturingMessage(
                    paramsWrapper, PodamConstants.HEADER_NAME,  int.class);
            podamValidationSteps.theObjectShouldNotBeNull(intMessage);

            Message value = podamInvocationSteps.whenISendAMessageToTheChannel(inputChannel, intMessage);
            podamValidationSteps.theObjectShouldNotBeNull(value);

            podamValidationSteps.theIntFieldShouldNotBeZero((Integer) value.getPayload());
        } finally {
            if (null != applicationContext) {
                applicationContext.close();
            }
        }

    }

    @Test
    @Title("Podam Spring application context should return an integer value")
    public void podamApplicationContextShouldReturnAnIntegerValue() throws Exception {

        DataProviderStrategy dataProviderStrategy = podamFactorySteps.givenARandomDataProviderStrategy();

        AbstractApplicationContext applicationContext = podamFactorySteps.givenPodamRootApplicationContext();
        podamValidationSteps.theObjectShouldNotBeNull(applicationContext);

        try {
            MessageChannel inputChannel = podamFactorySteps.givenAMessageChannelToManufactureValues(applicationContext);
            podamValidationSteps.theObjectShouldNotBeNull(inputChannel);

            AttributeMetadata attributeMetadata = podamFactorySteps.givenAnEmptyAttributeMetadata
                    (SimplePojoToTestSetters.class);
            podamValidationSteps.theObjectShouldNotBeNull(attributeMetadata);

            TypeManufacturerParamsWrapper paramsWrapper =
                    new TypeManufacturerParamsWrapper(dataProviderStrategy, attributeMetadata);

            Message<? extends Object> intMessage = podamFactorySteps.givenATypeManufacturingMessage(
                    paramsWrapper, PodamConstants.HEADER_NAME,  Integer.class);
            podamValidationSteps.theObjectShouldNotBeNull(intMessage);

            Message value = podamInvocationSteps.whenISendAMessageToTheChannel(inputChannel, intMessage);
            podamValidationSteps.theObjectShouldNotBeNull(value);

            podamValidationSteps.theIntFieldShouldNotBeZero((Integer) value.getPayload());
        } finally {
            if (null != applicationContext) {
                applicationContext.close();
            }
        }

    }

    @Test
    @Title("Podam Spring application context should return a boolean primitive value")
    public void podamApplicationContextShouldReturnABooleanPrimitiveValue() throws Exception {

        DataProviderStrategy dataProviderStrategy = podamFactorySteps.givenARandomDataProviderStrategy();

        AbstractApplicationContext applicationContext = podamFactorySteps.givenPodamRootApplicationContext();
        podamValidationSteps.theObjectShouldNotBeNull(applicationContext);

        try {
            MessageChannel inputChannel = podamFactorySteps.givenAMessageChannelToManufactureValues(applicationContext);
            podamValidationSteps.theObjectShouldNotBeNull(inputChannel);

            AttributeMetadata attributeMetadata = podamFactorySteps.givenAnEmptyAttributeMetadata
                    (SimplePojoToTestSetters.class);
            podamValidationSteps.theObjectShouldNotBeNull(attributeMetadata);

            TypeManufacturerParamsWrapper paramsWrapper =
                    new TypeManufacturerParamsWrapper(dataProviderStrategy, attributeMetadata);

            Message<? extends Object> message = podamFactorySteps.givenATypeManufacturingMessage(
                    paramsWrapper, PodamConstants.HEADER_NAME,  boolean.class);
            podamValidationSteps.theObjectShouldNotBeNull(message);

            Message value = podamInvocationSteps.whenISendAMessageToTheChannel(inputChannel, message);
            podamValidationSteps.theObjectShouldNotBeNull(value);

            podamValidationSteps.theBooleanValueIsTrue((Boolean) value.getPayload());

        } finally {

            if (null != applicationContext) {
                applicationContext.close();
            }

        }

    }

    @Test
    @Title("Podam Spring application context should return a boolean wrapped value")
    public void podamApplicationContextShouldReturnABooleanWrappedValue() throws Exception {

        DataProviderStrategy dataProviderStrategy = podamFactorySteps.givenARandomDataProviderStrategy();

        AbstractApplicationContext applicationContext = podamFactorySteps.givenPodamRootApplicationContext();
        podamValidationSteps.theObjectShouldNotBeNull(applicationContext);

        try {
            MessageChannel inputChannel = podamFactorySteps.givenAMessageChannelToManufactureValues(applicationContext);
            podamValidationSteps.theObjectShouldNotBeNull(inputChannel);

            AttributeMetadata attributeMetadata = podamFactorySteps.givenAnEmptyAttributeMetadata
                    (SimplePojoToTestSetters.class);
            podamValidationSteps.theObjectShouldNotBeNull(attributeMetadata);

            TypeManufacturerParamsWrapper paramsWrapper =
                    new TypeManufacturerParamsWrapper(dataProviderStrategy, attributeMetadata);

            Message<? extends Object> message = podamFactorySteps.givenATypeManufacturingMessage(
                    paramsWrapper, PodamConstants.HEADER_NAME,  Boolean.class);
            podamValidationSteps.theObjectShouldNotBeNull(message);

            Message value = podamInvocationSteps.whenISendAMessageToTheChannel(inputChannel, message);
            podamValidationSteps.theObjectShouldNotBeNull(value);

            podamValidationSteps.theBooleanValueIsTrue((Boolean) value.getPayload());

        } finally {

            if (null != applicationContext) {
                applicationContext.close();
            }

        }

    }

    @Test
    @Title("Podam Spring application context should return a char primitive value")
    public void podamApplicationContextShouldReturnACharacterPrimitiveValue() throws Exception {

        DataProviderStrategy dataProviderStrategy = podamFactorySteps.givenARandomDataProviderStrategy();

        AbstractApplicationContext applicationContext = podamFactorySteps.givenPodamRootApplicationContext();
        podamValidationSteps.theObjectShouldNotBeNull(applicationContext);

        try {
            MessageChannel inputChannel = podamFactorySteps.givenAMessageChannelToManufactureValues(applicationContext);
            podamValidationSteps.theObjectShouldNotBeNull(inputChannel);

            AttributeMetadata attributeMetadata = podamFactorySteps.givenAnEmptyAttributeMetadata
                    (SimplePojoToTestSetters.class);
            podamValidationSteps.theObjectShouldNotBeNull(attributeMetadata);

            TypeManufacturerParamsWrapper paramsWrapper =
                    new TypeManufacturerParamsWrapper(dataProviderStrategy, attributeMetadata);

            Message<? extends Object> message = podamFactorySteps.givenATypeManufacturingMessage(
                    paramsWrapper, PodamConstants.HEADER_NAME,  char.class);
            podamValidationSteps.theObjectShouldNotBeNull(message);

            Message value = podamInvocationSteps.whenISendAMessageToTheChannel(inputChannel, message);
            podamValidationSteps.theObjectShouldNotBeNull(value);

            podamValidationSteps.theObjectShouldNotBeNull((Character) value.getPayload());

        } finally {

            if (null != applicationContext) {
                applicationContext.close();
            }

        }

    }

    @Test
    @Title("Podam Spring application context should return a Character wrapped value")
    public void podamApplicationContextShouldReturnACharacterWrappedValue() throws Exception {

        DataProviderStrategy dataProviderStrategy = podamFactorySteps.givenARandomDataProviderStrategy();

        AbstractApplicationContext applicationContext = podamFactorySteps.givenPodamRootApplicationContext();
        podamValidationSteps.theObjectShouldNotBeNull(applicationContext);

        try {
            MessageChannel inputChannel = podamFactorySteps.givenAMessageChannelToManufactureValues(applicationContext);
            podamValidationSteps.theObjectShouldNotBeNull(inputChannel);

            AttributeMetadata attributeMetadata = podamFactorySteps.givenAnEmptyAttributeMetadata
                    (SimplePojoToTestSetters.class);
            podamValidationSteps.theObjectShouldNotBeNull(attributeMetadata);

            TypeManufacturerParamsWrapper paramsWrapper =
                    new TypeManufacturerParamsWrapper(dataProviderStrategy, attributeMetadata);

            Message<? extends Object> message = podamFactorySteps.givenATypeManufacturingMessage(
                    paramsWrapper, PodamConstants.HEADER_NAME,  Character.class);
            podamValidationSteps.theObjectShouldNotBeNull(message);

            Message value = podamInvocationSteps.whenISendAMessageToTheChannel(inputChannel, message);
            podamValidationSteps.theObjectShouldNotBeNull(value);

            podamValidationSteps.theObjectShouldNotBeNull((Character) value.getPayload());

        } finally {

            if (null != applicationContext) {
                applicationContext.close();
            }

        }

    }

    @Test
    @Title("Podam Spring application context should return a short primitive value")
    public void podamApplicationContextShouldReturnAShortPrimitiveValue() throws Exception {

        DataProviderStrategy dataProviderStrategy = podamFactorySteps.givenARandomDataProviderStrategy();

        AbstractApplicationContext applicationContext = podamFactorySteps.givenPodamRootApplicationContext();
        podamValidationSteps.theObjectShouldNotBeNull(applicationContext);

        try {
            MessageChannel inputChannel = podamFactorySteps.givenAMessageChannelToManufactureValues(applicationContext);
            podamValidationSteps.theObjectShouldNotBeNull(inputChannel);

            AttributeMetadata attributeMetadata = podamFactorySteps.givenAnEmptyAttributeMetadata
                    (SimplePojoToTestSetters.class);
            podamValidationSteps.theObjectShouldNotBeNull(attributeMetadata);

            TypeManufacturerParamsWrapper paramsWrapper =
                    new TypeManufacturerParamsWrapper(dataProviderStrategy, attributeMetadata);

            Message<? extends Object> message = podamFactorySteps.givenATypeManufacturingMessage(
                    paramsWrapper, PodamConstants.HEADER_NAME,  short.class);
            podamValidationSteps.theObjectShouldNotBeNull(message);

            Message value = podamInvocationSteps.whenISendAMessageToTheChannel(inputChannel, message);
            podamValidationSteps.theObjectShouldNotBeNull(value);

            podamValidationSteps.theObjectShouldNotBeNull((Short) value.getPayload());

        } finally {

            if (null != applicationContext) {
                applicationContext.close();
            }

        }

    }

    @Test
    @Title("Podam Spring application context should return a Short wrapped value")
    public void podamApplicationContextShouldReturnAShortWrappedValue() throws Exception {

        DataProviderStrategy dataProviderStrategy = podamFactorySteps.givenARandomDataProviderStrategy();

        AbstractApplicationContext applicationContext = podamFactorySteps.givenPodamRootApplicationContext();
        podamValidationSteps.theObjectShouldNotBeNull(applicationContext);

        try {
            MessageChannel inputChannel = podamFactorySteps.givenAMessageChannelToManufactureValues(applicationContext);
            podamValidationSteps.theObjectShouldNotBeNull(inputChannel);

            AttributeMetadata attributeMetadata = podamFactorySteps.givenAnEmptyAttributeMetadata
                    (SimplePojoToTestSetters.class);
            podamValidationSteps.theObjectShouldNotBeNull(attributeMetadata);

            TypeManufacturerParamsWrapper paramsWrapper =
                    new TypeManufacturerParamsWrapper(dataProviderStrategy, attributeMetadata);

            Message<? extends Object> message = podamFactorySteps.givenATypeManufacturingMessage(
                    paramsWrapper, PodamConstants.HEADER_NAME,  Short.class);
            podamValidationSteps.theObjectShouldNotBeNull(message);

            Message value = podamInvocationSteps.whenISendAMessageToTheChannel(inputChannel, message);
            podamValidationSteps.theObjectShouldNotBeNull(value);

            podamValidationSteps.theObjectShouldNotBeNull((Short) value.getPayload());

        } finally {

            if (null != applicationContext) {
                applicationContext.close();
            }

        }

    }

    @Test
    @Title("Podam Spring application context should return a byte primitive value")
    public void podamApplicationContextShouldReturnABytePrimitiveValue() throws Exception {

        DataProviderStrategy dataProviderStrategy = podamFactorySteps.givenARandomDataProviderStrategy();

        AbstractApplicationContext applicationContext = podamFactorySteps.givenPodamRootApplicationContext();
        podamValidationSteps.theObjectShouldNotBeNull(applicationContext);

        try {
            MessageChannel inputChannel = podamFactorySteps.givenAMessageChannelToManufactureValues(applicationContext);
            podamValidationSteps.theObjectShouldNotBeNull(inputChannel);

            AttributeMetadata attributeMetadata = podamFactorySteps.givenAnEmptyAttributeMetadata
                    (SimplePojoToTestSetters.class);
            podamValidationSteps.theObjectShouldNotBeNull(attributeMetadata);

            TypeManufacturerParamsWrapper paramsWrapper =
                    new TypeManufacturerParamsWrapper(dataProviderStrategy, attributeMetadata);

            Message<? extends Object> message = podamFactorySteps.givenATypeManufacturingMessage(
                    paramsWrapper, PodamConstants.HEADER_NAME,  byte.class);
            podamValidationSteps.theObjectShouldNotBeNull(message);

            Message value = podamInvocationSteps.whenISendAMessageToTheChannel(inputChannel, message);
            podamValidationSteps.theObjectShouldNotBeNull(value);

            podamValidationSteps.theObjectShouldNotBeNull((Byte) value.getPayload());

        } finally {

            if (null != applicationContext) {
                applicationContext.close();
            }

        }

    }

    @Test
    @Title("Podam Spring application context should return a Byte wrapped value")
    public void podamApplicationContextShouldReturnAByteWrappedValue() throws Exception {

        DataProviderStrategy dataProviderStrategy = podamFactorySteps.givenARandomDataProviderStrategy();

        AbstractApplicationContext applicationContext = podamFactorySteps.givenPodamRootApplicationContext();
        podamValidationSteps.theObjectShouldNotBeNull(applicationContext);

        try {
            MessageChannel inputChannel = podamFactorySteps.givenAMessageChannelToManufactureValues(applicationContext);
            podamValidationSteps.theObjectShouldNotBeNull(inputChannel);

            AttributeMetadata attributeMetadata = podamFactorySteps.givenAnEmptyAttributeMetadata
                    (SimplePojoToTestSetters.class);
            podamValidationSteps.theObjectShouldNotBeNull(attributeMetadata);

            TypeManufacturerParamsWrapper paramsWrapper =
                    new TypeManufacturerParamsWrapper(dataProviderStrategy, attributeMetadata);

            Message<? extends Object> message = podamFactorySteps.givenATypeManufacturingMessage(
                    paramsWrapper, PodamConstants.HEADER_NAME,  Byte.class);
            podamValidationSteps.theObjectShouldNotBeNull(message);

            Message value = podamInvocationSteps.whenISendAMessageToTheChannel(inputChannel, message);
            podamValidationSteps.theObjectShouldNotBeNull(value);

            podamValidationSteps.theObjectShouldNotBeNull((Byte) value.getPayload());

        } finally {

            if (null != applicationContext) {
                applicationContext.close();
            }

        }

    }

    @Test
    @Title("Podam Spring application context should return a long primitive value")
    public void podamApplicationContextShouldReturnALongPrimitiveValue() throws Exception {

        DataProviderStrategy dataProviderStrategy = podamFactorySteps.givenARandomDataProviderStrategy();

        AbstractApplicationContext applicationContext = podamFactorySteps.givenPodamRootApplicationContext();
        podamValidationSteps.theObjectShouldNotBeNull(applicationContext);

        try {
            MessageChannel inputChannel = podamFactorySteps.givenAMessageChannelToManufactureValues(applicationContext);
            podamValidationSteps.theObjectShouldNotBeNull(inputChannel);

            AttributeMetadata attributeMetadata = podamFactorySteps.givenAnEmptyAttributeMetadata
                    (SimplePojoToTestSetters.class);
            podamValidationSteps.theObjectShouldNotBeNull(attributeMetadata);

            TypeManufacturerParamsWrapper paramsWrapper =
                    new TypeManufacturerParamsWrapper(dataProviderStrategy, attributeMetadata);

            Message<? extends Object> message = podamFactorySteps.givenATypeManufacturingMessage(
                    paramsWrapper, PodamConstants.HEADER_NAME,  long.class);
            podamValidationSteps.theObjectShouldNotBeNull(message);

            Message value = podamInvocationSteps.whenISendAMessageToTheChannel(inputChannel, message);
            podamValidationSteps.theObjectShouldNotBeNull(value);

            podamValidationSteps.theObjectShouldNotBeNull((Long) value.getPayload());

        } finally {

            if (null != applicationContext) {
                applicationContext.close();
            }

        }

    }

    @Test
    @Title("Podam Spring application context should return a Long wrapped value")
    public void podamApplicationContextShouldReturnALongWrappedValue() throws Exception {

        DataProviderStrategy dataProviderStrategy = podamFactorySteps.givenARandomDataProviderStrategy();

        AbstractApplicationContext applicationContext = podamFactorySteps.givenPodamRootApplicationContext();
        podamValidationSteps.theObjectShouldNotBeNull(applicationContext);

        try {
            MessageChannel inputChannel = podamFactorySteps.givenAMessageChannelToManufactureValues(applicationContext);
            podamValidationSteps.theObjectShouldNotBeNull(inputChannel);

            AttributeMetadata attributeMetadata = podamFactorySteps.givenAnEmptyAttributeMetadata
                    (SimplePojoToTestSetters.class);
            podamValidationSteps.theObjectShouldNotBeNull(attributeMetadata);

            TypeManufacturerParamsWrapper paramsWrapper =
                    new TypeManufacturerParamsWrapper(dataProviderStrategy, attributeMetadata);

            Message<? extends Object> message = podamFactorySteps.givenATypeManufacturingMessage(
                    paramsWrapper, PodamConstants.HEADER_NAME,  Long.class);
            podamValidationSteps.theObjectShouldNotBeNull(message);

            Message value = podamInvocationSteps.whenISendAMessageToTheChannel(inputChannel, message);
            podamValidationSteps.theObjectShouldNotBeNull(value);

            podamValidationSteps.theObjectShouldNotBeNull((Long) value.getPayload());

        } finally {

            if (null != applicationContext) {
                applicationContext.close();
            }

        }

    }

    @Test
    @Title("Podam Spring application context should return a float primitive value")
    public void podamApplicationContextShouldReturnAFloatPrimitiveValue() throws Exception {

        DataProviderStrategy dataProviderStrategy = podamFactorySteps.givenARandomDataProviderStrategy();

        AbstractApplicationContext applicationContext = podamFactorySteps.givenPodamRootApplicationContext();
        podamValidationSteps.theObjectShouldNotBeNull(applicationContext);

        try {
            MessageChannel inputChannel = podamFactorySteps.givenAMessageChannelToManufactureValues(applicationContext);
            podamValidationSteps.theObjectShouldNotBeNull(inputChannel);

            AttributeMetadata attributeMetadata = podamFactorySteps.givenAnEmptyAttributeMetadata
                    (SimplePojoToTestSetters.class);
            podamValidationSteps.theObjectShouldNotBeNull(attributeMetadata);

            TypeManufacturerParamsWrapper paramsWrapper =
                    new TypeManufacturerParamsWrapper(dataProviderStrategy, attributeMetadata);

            Message<? extends Object> message = podamFactorySteps.givenATypeManufacturingMessage(
                    paramsWrapper, PodamConstants.HEADER_NAME,  float.class);
            podamValidationSteps.theObjectShouldNotBeNull(message);

            Message value = podamInvocationSteps.whenISendAMessageToTheChannel(inputChannel, message);
            podamValidationSteps.theObjectShouldNotBeNull(value);

            podamValidationSteps.theObjectShouldNotBeNull((Float) value.getPayload());

        } finally {

            if (null != applicationContext) {
                applicationContext.close();
            }

        }

    }

    @Test
    @Title("Podam Spring application context should return a Float wrapped value")
    public void podamApplicationContextShouldReturnAFloatWrappedValue() throws Exception {

        DataProviderStrategy dataProviderStrategy = podamFactorySteps.givenARandomDataProviderStrategy();

        AbstractApplicationContext applicationContext = podamFactorySteps.givenPodamRootApplicationContext();
        podamValidationSteps.theObjectShouldNotBeNull(applicationContext);

        try {
            MessageChannel inputChannel = podamFactorySteps.givenAMessageChannelToManufactureValues(applicationContext);
            podamValidationSteps.theObjectShouldNotBeNull(inputChannel);

            AttributeMetadata attributeMetadata = podamFactorySteps.givenAnEmptyAttributeMetadata
                    (SimplePojoToTestSetters.class);
            podamValidationSteps.theObjectShouldNotBeNull(attributeMetadata);

            TypeManufacturerParamsWrapper paramsWrapper =
                    new TypeManufacturerParamsWrapper(dataProviderStrategy, attributeMetadata);

            Message<? extends Object> message = podamFactorySteps.givenATypeManufacturingMessage(
                    paramsWrapper, PodamConstants.HEADER_NAME,  Float.class);
            podamValidationSteps.theObjectShouldNotBeNull(message);

            Message value = podamInvocationSteps.whenISendAMessageToTheChannel(inputChannel, message);
            podamValidationSteps.theObjectShouldNotBeNull(value);

            podamValidationSteps.theObjectShouldNotBeNull((Float) value.getPayload());

        } finally {

            if (null != applicationContext) {
                applicationContext.close();
            }

        }

    }

    @Test
    @Title("Podam Spring application context should return a double primitive value")
    public void podamApplicationContextShouldReturnADoublePrimitiveValue() throws Exception {

        DataProviderStrategy dataProviderStrategy = podamFactorySteps.givenARandomDataProviderStrategy();

        AbstractApplicationContext applicationContext = podamFactorySteps.givenPodamRootApplicationContext();
        podamValidationSteps.theObjectShouldNotBeNull(applicationContext);

        try {
            MessageChannel inputChannel = podamFactorySteps.givenAMessageChannelToManufactureValues(applicationContext);
            podamValidationSteps.theObjectShouldNotBeNull(inputChannel);

            AttributeMetadata attributeMetadata = podamFactorySteps.givenAnEmptyAttributeMetadata
                    (SimplePojoToTestSetters.class);
            podamValidationSteps.theObjectShouldNotBeNull(attributeMetadata);

            TypeManufacturerParamsWrapper paramsWrapper =
                    new TypeManufacturerParamsWrapper(dataProviderStrategy, attributeMetadata);

            Message<? extends Object> message = podamFactorySteps.givenATypeManufacturingMessage(
                    paramsWrapper, PodamConstants.HEADER_NAME,  double.class);
            podamValidationSteps.theObjectShouldNotBeNull(message);

            Message value = podamInvocationSteps.whenISendAMessageToTheChannel(inputChannel, message);
            podamValidationSteps.theObjectShouldNotBeNull(value);

            podamValidationSteps.theObjectShouldNotBeNull((Double) value.getPayload());

        } finally {

            if (null != applicationContext) {
                applicationContext.close();
            }

        }

    }

    @Test
    @Title("Podam Spring application context should return a Double wrapped value")
    public void podamApplicationContextShouldReturnADoubleWrappedValue() throws Exception {

        DataProviderStrategy dataProviderStrategy = podamFactorySteps.givenARandomDataProviderStrategy();

        AbstractApplicationContext applicationContext = podamFactorySteps.givenPodamRootApplicationContext();
        podamValidationSteps.theObjectShouldNotBeNull(applicationContext);

        try {
            MessageChannel inputChannel = podamFactorySteps.givenAMessageChannelToManufactureValues(applicationContext);
            podamValidationSteps.theObjectShouldNotBeNull(inputChannel);

            AttributeMetadata attributeMetadata = podamFactorySteps.givenAnEmptyAttributeMetadata
                    (SimplePojoToTestSetters.class);
            podamValidationSteps.theObjectShouldNotBeNull(attributeMetadata);

            TypeManufacturerParamsWrapper paramsWrapper =
                    new TypeManufacturerParamsWrapper(dataProviderStrategy, attributeMetadata);

            Message<? extends Object> message = podamFactorySteps.givenATypeManufacturingMessage(
                    paramsWrapper, PodamConstants.HEADER_NAME,  Double.class);
            podamValidationSteps.theObjectShouldNotBeNull(message);

            Message value = podamInvocationSteps.whenISendAMessageToTheChannel(inputChannel, message);
            podamValidationSteps.theObjectShouldNotBeNull(value);

            podamValidationSteps.theObjectShouldNotBeNull((Double) value.getPayload());

        } finally {

            if (null != applicationContext) {
                applicationContext.close();
            }

        }

    }


    @Test
    @Title("Podam Spring application context should return a String value")
    public void podamApplicationContextShouldReturnAStringValue() throws Exception {

        DataProviderStrategy dataProviderStrategy = podamFactorySteps.givenARandomDataProviderStrategy();

        AbstractApplicationContext applicationContext = podamFactorySteps.givenPodamRootApplicationContext();
        podamValidationSteps.theObjectShouldNotBeNull(applicationContext);

        try {
            MessageChannel inputChannel = podamFactorySteps.givenAMessageChannelToManufactureValues(applicationContext);
            podamValidationSteps.theObjectShouldNotBeNull(inputChannel);

            AttributeMetadata attributeMetadata = podamFactorySteps.givenAnEmptyAttributeMetadata
                    (SimplePojoToTestSetters.class);
            podamValidationSteps.theObjectShouldNotBeNull(attributeMetadata);

            TypeManufacturerParamsWrapper paramsWrapper =
                    new TypeManufacturerParamsWrapper(dataProviderStrategy, attributeMetadata);

            Message<? extends Object> message = podamFactorySteps.givenATypeManufacturingMessage(
                    paramsWrapper, PodamConstants.HEADER_NAME,  String.class);
            podamValidationSteps.theObjectShouldNotBeNull(message);

            Message value = podamInvocationSteps.whenISendAMessageToTheChannel(inputChannel, message);
            podamValidationSteps.theObjectShouldNotBeNull(value);

            podamValidationSteps.theObjectShouldNotBeNull((String) value.getPayload());

        } finally {

            if (null != applicationContext) {
                applicationContext.close();
            }

        }

    }

    @Test
    @Title("Podam Spring application context should return an Enum value")
    public void podamApplicationContextShouldReturnAnEnumValue() throws Exception {

        DataProviderStrategy dataProviderStrategy = podamFactorySteps.givenARandomDataProviderStrategy();

        AbstractApplicationContext applicationContext = podamFactorySteps.givenPodamRootApplicationContext();
        podamValidationSteps.theObjectShouldNotBeNull(applicationContext);

        try {
            MessageChannel inputChannel = podamFactorySteps.givenAMessageChannelToManufactureValues(applicationContext);
            podamValidationSteps.theObjectShouldNotBeNull(inputChannel);

            AttributeMetadata attributeMetadata = podamFactorySteps.givenAnAttributeMetadataForEnums
                    (ExternalRatePodamEnum.class);
            podamValidationSteps.theObjectShouldNotBeNull(attributeMetadata);

            TypeManufacturerParamsWrapper paramsWrapper =
                    new TypeManufacturerParamsWrapper(dataProviderStrategy, attributeMetadata);

            Message<? extends Object> message = podamFactorySteps.givenATypeManufacturingMessageWithStringQualifier(
                    paramsWrapper, PodamConstants.HEADER_NAME, PodamConstants.ENUMERATION_QUALIFIER);
            podamValidationSteps.theObjectShouldNotBeNull(message);

            Message value = podamInvocationSteps.whenISendAMessageToTheChannel(inputChannel, message);
            podamValidationSteps.theObjectShouldNotBeNull(value);

            podamValidationSteps.theObjectShouldNotBeNull(value.getPayload());

        } finally {

            if (null != applicationContext) {
                applicationContext.close();
            }

        }

    }

    @Test
    @Title("Podam Spring application context should return a Generic Type value")
    public void podamApplicationContextShouldReturnAGenericTypeValue() throws Exception {

        DataProviderStrategy dataProviderStrategy = podamFactorySteps.givenARandomDataProviderStrategy();

        AbstractApplicationContext applicationContext = podamFactorySteps.givenPodamRootApplicationContext();
        podamValidationSteps.theObjectShouldNotBeNull(applicationContext);

        try {
            MessageChannel inputChannel = podamFactorySteps.givenAMessageChannelToManufactureValues(applicationContext);
            podamValidationSteps.theObjectShouldNotBeNull(inputChannel);

            AttributeMetadata attributeMetadata = podamFactorySteps.givenAnAttributeMetadataForGenericTypes
                    (SimplePojoToTestSetters.class);
            podamValidationSteps.theObjectShouldNotBeNull(attributeMetadata);

            Map<String, Type> genericTypeArgumentsMap = new HashMap<String, Type>();
            Type[] attrGenericArgs = attributeMetadata.getAttrGenericArgs();
            for (int i = 0; i < attrGenericArgs.length; i++) {
                Type attrGenericArg = attrGenericArgs[i];
                genericTypeArgumentsMap.put(attrGenericArg.getTypeName(), attrGenericArg);
            }

            TypeManufacturerParamsWrapperForGenericTypes paramsWrapper =
                    new TypeManufacturerParamsWrapperForGenericTypes(
                            dataProviderStrategy, attributeMetadata, genericTypeArgumentsMap, String.class);

            Message<? extends Object> message = podamFactorySteps.givenATypeManufacturingMessageWithStringQualifier(
                    paramsWrapper, PodamConstants.HEADER_NAME, PodamConstants.GENERIC_TYPE_QUALIFIER);
            podamValidationSteps.theObjectShouldNotBeNull(message);

            Message value = podamInvocationSteps.whenISendAMessageToTheChannel(inputChannel, message);
            podamValidationSteps.theObjectShouldNotBeNull(value);

            podamValidationSteps.theObjectShouldNotBeNull(value.getPayload());

        } finally {

            if (null != applicationContext) {
                applicationContext.close();
            }

        }

    }



}
