package com.huaweicloud.sdk.ocr.v1;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.ocr.v1.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class OcrMeta {

    public static final HttpRequestDef<RecognizeAutoClassificationRequest, RecognizeAutoClassificationResponse> recognizeAutoClassification = genForrecognizeAutoClassification();

    private static HttpRequestDef<RecognizeAutoClassificationRequest, RecognizeAutoClassificationResponse> genForrecognizeAutoClassification() {
        // basic
        HttpRequestDef.Builder<RecognizeAutoClassificationRequest, RecognizeAutoClassificationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RecognizeAutoClassificationRequest.class, RecognizeAutoClassificationResponse.class)
                .withName("RecognizeAutoClassification")
                .withUri("/v2/{project_id}/ocr/auto-classification")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            AutoClassificationRequestBody.class,
            f -> f.withMarshaller(RecognizeAutoClassificationRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RecognizeBankcardRequest, RecognizeBankcardResponse> recognizeBankcard = genForrecognizeBankcard();

    private static HttpRequestDef<RecognizeBankcardRequest, RecognizeBankcardResponse> genForrecognizeBankcard() {
        // basic
        HttpRequestDef.Builder<RecognizeBankcardRequest, RecognizeBankcardResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RecognizeBankcardRequest.class, RecognizeBankcardResponse.class)
                .withName("RecognizeBankcard")
                .withUri("/v2/{project_id}/ocr/bankcard")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BankcardRequestBody.class,
            f -> f.withMarshaller(RecognizeBankcardRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RecognizeBusinessCardRequest, RecognizeBusinessCardResponse> recognizeBusinessCard = genForrecognizeBusinessCard();

    private static HttpRequestDef<RecognizeBusinessCardRequest, RecognizeBusinessCardResponse> genForrecognizeBusinessCard() {
        // basic
        HttpRequestDef.Builder<RecognizeBusinessCardRequest, RecognizeBusinessCardResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RecognizeBusinessCardRequest.class, RecognizeBusinessCardResponse.class)
                .withName("RecognizeBusinessCard")
                .withUri("/v2/{project_id}/ocr/business-card")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BusinessCardRequestBody.class,
            f -> f.withMarshaller(RecognizeBusinessCardRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RecognizeBusinessLicenseRequest, RecognizeBusinessLicenseResponse> recognizeBusinessLicense = genForrecognizeBusinessLicense();

    private static HttpRequestDef<RecognizeBusinessLicenseRequest, RecognizeBusinessLicenseResponse> genForrecognizeBusinessLicense() {
        // basic
        HttpRequestDef.Builder<RecognizeBusinessLicenseRequest, RecognizeBusinessLicenseResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RecognizeBusinessLicenseRequest.class, RecognizeBusinessLicenseResponse.class)
                .withName("RecognizeBusinessLicense")
                .withUri("/v2/{project_id}/ocr/business-license")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BusinessLicenseRequestBody.class,
            f -> f.withMarshaller(RecognizeBusinessLicenseRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RecognizeDriverLicenseRequest, RecognizeDriverLicenseResponse> recognizeDriverLicense = genForrecognizeDriverLicense();

    private static HttpRequestDef<RecognizeDriverLicenseRequest, RecognizeDriverLicenseResponse> genForrecognizeDriverLicense() {
        // basic
        HttpRequestDef.Builder<RecognizeDriverLicenseRequest, RecognizeDriverLicenseResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RecognizeDriverLicenseRequest.class, RecognizeDriverLicenseResponse.class)
                .withName("RecognizeDriverLicense")
                .withUri("/v2/{project_id}/ocr/driver-license")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            DriverLicenseRequestBody.class,
            f -> f.withMarshaller(RecognizeDriverLicenseRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RecognizeFlightItineraryRequest, RecognizeFlightItineraryResponse> recognizeFlightItinerary = genForrecognizeFlightItinerary();

    private static HttpRequestDef<RecognizeFlightItineraryRequest, RecognizeFlightItineraryResponse> genForrecognizeFlightItinerary() {
        // basic
        HttpRequestDef.Builder<RecognizeFlightItineraryRequest, RecognizeFlightItineraryResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RecognizeFlightItineraryRequest.class, RecognizeFlightItineraryResponse.class)
                .withName("RecognizeFlightItinerary")
                .withUri("/v2/{project_id}/ocr/flight-itinerary")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            FlightItineraryRequestBody.class,
            f -> f.withMarshaller(RecognizeFlightItineraryRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RecognizeGeneralTableRequest, RecognizeGeneralTableResponse> recognizeGeneralTable = genForrecognizeGeneralTable();

    private static HttpRequestDef<RecognizeGeneralTableRequest, RecognizeGeneralTableResponse> genForrecognizeGeneralTable() {
        // basic
        HttpRequestDef.Builder<RecognizeGeneralTableRequest, RecognizeGeneralTableResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RecognizeGeneralTableRequest.class, RecognizeGeneralTableResponse.class)
                .withName("RecognizeGeneralTable")
                .withUri("/v2/{project_id}/ocr/general-table")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            GeneralTableRequestBody.class,
            f -> f.withMarshaller(RecognizeGeneralTableRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RecognizeGeneralTextRequest, RecognizeGeneralTextResponse> recognizeGeneralText = genForrecognizeGeneralText();

    private static HttpRequestDef<RecognizeGeneralTextRequest, RecognizeGeneralTextResponse> genForrecognizeGeneralText() {
        // basic
        HttpRequestDef.Builder<RecognizeGeneralTextRequest, RecognizeGeneralTextResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RecognizeGeneralTextRequest.class, RecognizeGeneralTextResponse.class)
                .withName("RecognizeGeneralText")
                .withUri("/v2/{project_id}/ocr/general-text")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            GeneralTextRequestBody.class,
            f -> f.withMarshaller(RecognizeGeneralTextRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RecognizeHandwritingRequest, RecognizeHandwritingResponse> recognizeHandwriting = genForrecognizeHandwriting();

    private static HttpRequestDef<RecognizeHandwritingRequest, RecognizeHandwritingResponse> genForrecognizeHandwriting() {
        // basic
        HttpRequestDef.Builder<RecognizeHandwritingRequest, RecognizeHandwritingResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RecognizeHandwritingRequest.class, RecognizeHandwritingResponse.class)
                .withName("RecognizeHandwriting")
                .withUri("/v2/{project_id}/ocr/handwriting")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            HandwritingRequestBody.class,
            f -> f.withMarshaller(RecognizeHandwritingRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RecognizeIdCardRequest, RecognizeIdCardResponse> recognizeIdCard = genForrecognizeIdCard();

    private static HttpRequestDef<RecognizeIdCardRequest, RecognizeIdCardResponse> genForrecognizeIdCard() {
        // basic
        HttpRequestDef.Builder<RecognizeIdCardRequest, RecognizeIdCardResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RecognizeIdCardRequest.class, RecognizeIdCardResponse.class)
                .withName("RecognizeIdCard")
                .withUri("/v2/{project_id}/ocr/id-card")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            IdCardRequestBody.class,
            f -> f.withMarshaller(RecognizeIdCardRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RecognizeLicensePlateRequest, RecognizeLicensePlateResponse> recognizeLicensePlate = genForrecognizeLicensePlate();

    private static HttpRequestDef<RecognizeLicensePlateRequest, RecognizeLicensePlateResponse> genForrecognizeLicensePlate() {
        // basic
        HttpRequestDef.Builder<RecognizeLicensePlateRequest, RecognizeLicensePlateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RecognizeLicensePlateRequest.class, RecognizeLicensePlateResponse.class)
                .withName("RecognizeLicensePlate")
                .withUri("/v2/{project_id}/ocr/license-plate")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            LicensePlateRequestBody.class,
            f -> f.withMarshaller(RecognizeLicensePlateRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RecognizeMvsInvoiceRequest, RecognizeMvsInvoiceResponse> recognizeMvsInvoice = genForrecognizeMvsInvoice();

    private static HttpRequestDef<RecognizeMvsInvoiceRequest, RecognizeMvsInvoiceResponse> genForrecognizeMvsInvoice() {
        // basic
        HttpRequestDef.Builder<RecognizeMvsInvoiceRequest, RecognizeMvsInvoiceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RecognizeMvsInvoiceRequest.class, RecognizeMvsInvoiceResponse.class)
                .withName("RecognizeMvsInvoice")
                .withUri("/v2/{project_id}/ocr/mvs-invoice")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            MvsInvoiceRequestBody.class,
            f -> f.withMarshaller(RecognizeMvsInvoiceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RecognizePassportRequest, RecognizePassportResponse> recognizePassport = genForrecognizePassport();

    private static HttpRequestDef<RecognizePassportRequest, RecognizePassportResponse> genForrecognizePassport() {
        // basic
        HttpRequestDef.Builder<RecognizePassportRequest, RecognizePassportResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RecognizePassportRequest.class, RecognizePassportResponse.class)
                .withName("RecognizePassport")
                .withUri("/v2/{project_id}/ocr/passport")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            PassportRequestBody.class,
            f -> f.withMarshaller(RecognizePassportRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RecognizeQuotaInvoiceRequest, RecognizeQuotaInvoiceResponse> recognizeQuotaInvoice = genForrecognizeQuotaInvoice();

    private static HttpRequestDef<RecognizeQuotaInvoiceRequest, RecognizeQuotaInvoiceResponse> genForrecognizeQuotaInvoice() {
        // basic
        HttpRequestDef.Builder<RecognizeQuotaInvoiceRequest, RecognizeQuotaInvoiceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RecognizeQuotaInvoiceRequest.class, RecognizeQuotaInvoiceResponse.class)
                .withName("RecognizeQuotaInvoice")
                .withUri("/v2/{project_id}/ocr/quota-invoice")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            QuotaInvoiceRequestBody.class,
            f -> f.withMarshaller(RecognizeQuotaInvoiceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RecognizeTaxiInvoiceRequest, RecognizeTaxiInvoiceResponse> recognizeTaxiInvoice = genForrecognizeTaxiInvoice();

    private static HttpRequestDef<RecognizeTaxiInvoiceRequest, RecognizeTaxiInvoiceResponse> genForrecognizeTaxiInvoice() {
        // basic
        HttpRequestDef.Builder<RecognizeTaxiInvoiceRequest, RecognizeTaxiInvoiceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RecognizeTaxiInvoiceRequest.class, RecognizeTaxiInvoiceResponse.class)
                .withName("RecognizeTaxiInvoice")
                .withUri("/v2/{project_id}/ocr/taxi-invoice")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TaxiInvoiceRequestBody.class,
            f -> f.withMarshaller(RecognizeTaxiInvoiceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RecognizeTollInvoiceRequest, RecognizeTollInvoiceResponse> recognizeTollInvoice = genForrecognizeTollInvoice();

    private static HttpRequestDef<RecognizeTollInvoiceRequest, RecognizeTollInvoiceResponse> genForrecognizeTollInvoice() {
        // basic
        HttpRequestDef.Builder<RecognizeTollInvoiceRequest, RecognizeTollInvoiceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RecognizeTollInvoiceRequest.class, RecognizeTollInvoiceResponse.class)
                .withName("RecognizeTollInvoice")
                .withUri("/v2/{project_id}/ocr/toll-invoice")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TollInvoiceRequestBody.class,
            f -> f.withMarshaller(RecognizeTollInvoiceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RecognizeTrainTicketRequest, RecognizeTrainTicketResponse> recognizeTrainTicket = genForrecognizeTrainTicket();

    private static HttpRequestDef<RecognizeTrainTicketRequest, RecognizeTrainTicketResponse> genForrecognizeTrainTicket() {
        // basic
        HttpRequestDef.Builder<RecognizeTrainTicketRequest, RecognizeTrainTicketResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RecognizeTrainTicketRequest.class, RecognizeTrainTicketResponse.class)
                .withName("RecognizeTrainTicket")
                .withUri("/v2/{project_id}/ocr/train-ticket")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TrainTicketRequestBody.class,
            f -> f.withMarshaller(RecognizeTrainTicketRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RecognizeTransportationLicenseRequest, RecognizeTransportationLicenseResponse> recognizeTransportationLicense = genForrecognizeTransportationLicense();

    private static HttpRequestDef<RecognizeTransportationLicenseRequest, RecognizeTransportationLicenseResponse> genForrecognizeTransportationLicense() {
        // basic
        HttpRequestDef.Builder<RecognizeTransportationLicenseRequest, RecognizeTransportationLicenseResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RecognizeTransportationLicenseRequest.class, RecognizeTransportationLicenseResponse.class)
                .withName("RecognizeTransportationLicense")
                .withUri("/v2/{project_id}/ocr/transportation-license")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TransportationLicenseRequestBody.class,
            f -> f.withMarshaller(RecognizeTransportationLicenseRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RecognizeVatInvoiceRequest, RecognizeVatInvoiceResponse> recognizeVatInvoice = genForrecognizeVatInvoice();

    private static HttpRequestDef<RecognizeVatInvoiceRequest, RecognizeVatInvoiceResponse> genForrecognizeVatInvoice() {
        // basic
        HttpRequestDef.Builder<RecognizeVatInvoiceRequest, RecognizeVatInvoiceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RecognizeVatInvoiceRequest.class, RecognizeVatInvoiceResponse.class)
                .withName("RecognizeVatInvoice")
                .withUri("/v2/{project_id}/ocr/vat-invoice")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            VatInvoiceRequestBody.class,
            f -> f.withMarshaller(RecognizeVatInvoiceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RecognizeVehicleLicenseRequest, RecognizeVehicleLicenseResponse> recognizeVehicleLicense = genForrecognizeVehicleLicense();

    private static HttpRequestDef<RecognizeVehicleLicenseRequest, RecognizeVehicleLicenseResponse> genForrecognizeVehicleLicense() {
        // basic
        HttpRequestDef.Builder<RecognizeVehicleLicenseRequest, RecognizeVehicleLicenseResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RecognizeVehicleLicenseRequest.class, RecognizeVehicleLicenseResponse.class)
                .withName("RecognizeVehicleLicense")
                .withUri("/v2/{project_id}/ocr/vehicle-license")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            VehicleLicenseRequestBody.class,
            f -> f.withMarshaller(RecognizeVehicleLicenseRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RecognizeWebImageRequest, RecognizeWebImageResponse> recognizeWebImage = genForrecognizeWebImage();

    private static HttpRequestDef<RecognizeWebImageRequest, RecognizeWebImageResponse> genForrecognizeWebImage() {
        // basic
        HttpRequestDef.Builder<RecognizeWebImageRequest, RecognizeWebImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RecognizeWebImageRequest.class, RecognizeWebImageResponse.class)
                .withName("RecognizeWebImage")
                .withUri("/v2/{project_id}/ocr/web-image")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            WebImageRequestBody.class,
            f -> f.withMarshaller(RecognizeWebImageRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RecognizeVinRequest, RecognizeVinResponse> recognizeVin = genForrecognizeVin();

    private static HttpRequestDef<RecognizeVinRequest, RecognizeVinResponse> genForrecognizeVin() {
        // basic
        HttpRequestDef.Builder<RecognizeVinRequest, RecognizeVinResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RecognizeVinRequest.class, RecognizeVinResponse.class)
                .withName("RecognizeVin")
                .withUri("/v2/{project_id}/ocr/vin")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            VinRequestBody.class,
            f -> f.withMarshaller(RecognizeVinRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

}
