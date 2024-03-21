package com.huaweicloud.sdk.ocr.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.ocr.v1.model.AcceptanceBillRequestBody;
import com.huaweicloud.sdk.ocr.v1.model.AutoClassificationRequestBody;
import com.huaweicloud.sdk.ocr.v1.model.BankcardRequestBody;
import com.huaweicloud.sdk.ocr.v1.model.BusinessCardRequestBody;
import com.huaweicloud.sdk.ocr.v1.model.BusinessLicenseRequestBody;
import com.huaweicloud.sdk.ocr.v1.model.CambodianIdCardRequestBody;
import com.huaweicloud.sdk.ocr.v1.model.ChileIdCardRequestBody;
import com.huaweicloud.sdk.ocr.v1.model.ColombiaIdCardRequestBody;
import com.huaweicloud.sdk.ocr.v1.model.CustomTemplateRequestBody;
import com.huaweicloud.sdk.ocr.v1.model.DriverLicenseRequestBody;
import com.huaweicloud.sdk.ocr.v1.model.ExitEntryPermitRequestBody;
import com.huaweicloud.sdk.ocr.v1.model.FinancialStatementRequestBody;
import com.huaweicloud.sdk.ocr.v1.model.FlightItineraryRequestBody;
import com.huaweicloud.sdk.ocr.v1.model.GeneralTableRequestBody;
import com.huaweicloud.sdk.ocr.v1.model.GeneralTextRequestBody;
import com.huaweicloud.sdk.ocr.v1.model.HandwritingRequestBody;
import com.huaweicloud.sdk.ocr.v1.model.HealthCodeRequestBody;
import com.huaweicloud.sdk.ocr.v1.model.HkIdCardRequestBody;
import com.huaweicloud.sdk.ocr.v1.model.HouseholdRegisterRequestBody;
import com.huaweicloud.sdk.ocr.v1.model.IdCardRequestBody;
import com.huaweicloud.sdk.ocr.v1.model.IdDocumentRequestBody;
import com.huaweicloud.sdk.ocr.v1.model.InsurancePolicyRequestBody;
import com.huaweicloud.sdk.ocr.v1.model.InvoiceVerificationRequestBody;
import com.huaweicloud.sdk.ocr.v1.model.LicensePlateRequestBody;
import com.huaweicloud.sdk.ocr.v1.model.MacaoIdCardRequestBody;
import com.huaweicloud.sdk.ocr.v1.model.MainlandTravelPermitRequestBody;
import com.huaweicloud.sdk.ocr.v1.model.MvsInvoiceRequestBody;
import com.huaweicloud.sdk.ocr.v1.model.MyanmarDriverLicenseRequestBody;
import com.huaweicloud.sdk.ocr.v1.model.MyanmarIdcardRequestBody;
import com.huaweicloud.sdk.ocr.v1.model.PassportRequestBody;
import com.huaweicloud.sdk.ocr.v1.model.PcrTestRecordRequestBody;
import com.huaweicloud.sdk.ocr.v1.model.PeruIdCardRequestBody;
import com.huaweicloud.sdk.ocr.v1.model.QualificationCertificateRequestBody;
import com.huaweicloud.sdk.ocr.v1.model.QuotaInvoiceRequestBody;
import com.huaweicloud.sdk.ocr.v1.model.RealEstateCertificateRequestBody;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeAcceptanceBillRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeAcceptanceBillResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeAutoClassificationRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeAutoClassificationResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeBankcardRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeBankcardResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeBusinessCardRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeBusinessCardResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeBusinessLicenseRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeBusinessLicenseResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeCambodianIdCardRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeCambodianIdCardResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeChileIdCardRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeChileIdCardResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeColombiaIdCardRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeColombiaIdCardResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeCustomTemplateRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeCustomTemplateResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeDriverLicenseRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeDriverLicenseResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeExitEntryPermitRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeExitEntryPermitResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeFinancialStatementRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeFinancialStatementResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeFlightItineraryRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeFlightItineraryResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeGeneralTableRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeGeneralTableResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeGeneralTextRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeGeneralTextResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeHandwritingRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeHandwritingResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeHealthCodeRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeHealthCodeResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeHkIdCardRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeHkIdCardResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeHouseholdRegisterRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeHouseholdRegisterResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeIdCardRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeIdCardResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeIdDocumentRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeIdDocumentResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeInsurancePolicyRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeInsurancePolicyResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeInvoiceVerificationRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeInvoiceVerificationResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeLicensePlateRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeLicensePlateResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeMacaoIdCardRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeMacaoIdCardResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeMainlandTravelPermitRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeMainlandTravelPermitResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeMvsInvoiceRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeMvsInvoiceResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeMyanmarDriverLicenseRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeMyanmarDriverLicenseResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeMyanmarIdcardRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeMyanmarIdcardResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizePassportRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizePassportResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizePcrTestRecordRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizePcrTestRecordResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizePeruIdCardRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizePeruIdCardResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeQualificationCertificateRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeQualificationCertificateResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeQuotaInvoiceRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeQuotaInvoiceResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeRealEstateCertificateRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeRealEstateCertificateResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeSealRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeSealResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeSmartDocumentRecognizerRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeSmartDocumentRecognizerResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeTaxiInvoiceRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeTaxiInvoiceResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeThailandIdcardRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeThailandIdcardResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeThailandLicensePlateRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeThailandLicensePlateResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeTollInvoiceRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeTollInvoiceResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeTrainTicketRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeTrainTicketResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeTransportationLicenseRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeTransportationLicenseResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeVatInvoiceRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeVatInvoiceResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeVehicleCertificateRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeVehicleCertificateResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeVehicleLicenseRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeVehicleLicenseResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeVietnamIdCardRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeVietnamIdCardResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeVinRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeVinResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeWaybillElectronicRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeWaybillElectronicResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeWebImageRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeWebImageResponse;
import com.huaweicloud.sdk.ocr.v1.model.SealRequestBody;
import com.huaweicloud.sdk.ocr.v1.model.SmartDocumentRecognizerRequestBody;
import com.huaweicloud.sdk.ocr.v1.model.TaxiInvoiceRequestBody;
import com.huaweicloud.sdk.ocr.v1.model.ThailandIdcardRequestBody;
import com.huaweicloud.sdk.ocr.v1.model.ThailandLicensePlateRequestBody;
import com.huaweicloud.sdk.ocr.v1.model.TollInvoiceRequestBody;
import com.huaweicloud.sdk.ocr.v1.model.TrainTicketRequestBody;
import com.huaweicloud.sdk.ocr.v1.model.TransportationLicenseRequestBody;
import com.huaweicloud.sdk.ocr.v1.model.VatInvoiceRequestBody;
import com.huaweicloud.sdk.ocr.v1.model.VehicleCertificateRequestBody;
import com.huaweicloud.sdk.ocr.v1.model.VehicleLicenseRequestBody;
import com.huaweicloud.sdk.ocr.v1.model.VietnamIdCardRequestBody;
import com.huaweicloud.sdk.ocr.v1.model.VinRequestBody;
import com.huaweicloud.sdk.ocr.v1.model.WaybillElectronicRequestBody;
import com.huaweicloud.sdk.ocr.v1.model.WebImageRequestBody;

@SuppressWarnings("unchecked")
public class OcrMeta {

    public static final HttpRequestDef<RecognizeAcceptanceBillRequest, RecognizeAcceptanceBillResponse> recognizeAcceptanceBill =
        genForRecognizeAcceptanceBill();

    private static HttpRequestDef<RecognizeAcceptanceBillRequest, RecognizeAcceptanceBillResponse> genForRecognizeAcceptanceBill() {
        // basic
        HttpRequestDef.Builder<RecognizeAcceptanceBillRequest, RecognizeAcceptanceBillResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RecognizeAcceptanceBillRequest.class, RecognizeAcceptanceBillResponse.class)
            .withName("RecognizeAcceptanceBill")
            .withUri("/v2/{project_id}/ocr/acceptance-bill")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeAcceptanceBillRequest::getEnterpriseProjectId,
                RecognizeAcceptanceBillRequest::setEnterpriseProjectId));
        builder.<AcceptanceBillRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AcceptanceBillRequestBody.class),
            f -> f.withMarshaller(RecognizeAcceptanceBillRequest::getBody, RecognizeAcceptanceBillRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeAutoClassificationRequest, RecognizeAutoClassificationResponse> recognizeAutoClassification =
        genForRecognizeAutoClassification();

    private static HttpRequestDef<RecognizeAutoClassificationRequest, RecognizeAutoClassificationResponse> genForRecognizeAutoClassification() {
        // basic
        HttpRequestDef.Builder<RecognizeAutoClassificationRequest, RecognizeAutoClassificationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RecognizeAutoClassificationRequest.class,
                    RecognizeAutoClassificationResponse.class)
                .withName("RecognizeAutoClassification")
                .withUri("/v2/{project_id}/ocr/auto-classification")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeAutoClassificationRequest::getEnterpriseProjectId,
                RecognizeAutoClassificationRequest::setEnterpriseProjectId));
        builder.<AutoClassificationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AutoClassificationRequestBody.class),
            f -> f.withMarshaller(RecognizeAutoClassificationRequest::getBody,
                RecognizeAutoClassificationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeBankcardRequest, RecognizeBankcardResponse> recognizeBankcard =
        genForRecognizeBankcard();

    private static HttpRequestDef<RecognizeBankcardRequest, RecognizeBankcardResponse> genForRecognizeBankcard() {
        // basic
        HttpRequestDef.Builder<RecognizeBankcardRequest, RecognizeBankcardResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RecognizeBankcardRequest.class, RecognizeBankcardResponse.class)
                .withName("RecognizeBankcard")
                .withUri("/v2/{project_id}/ocr/bankcard")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeBankcardRequest::getEnterpriseProjectId,
                RecognizeBankcardRequest::setEnterpriseProjectId));
        builder.<BankcardRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BankcardRequestBody.class),
            f -> f.withMarshaller(RecognizeBankcardRequest::getBody, RecognizeBankcardRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeBusinessCardRequest, RecognizeBusinessCardResponse> recognizeBusinessCard =
        genForRecognizeBusinessCard();

    private static HttpRequestDef<RecognizeBusinessCardRequest, RecognizeBusinessCardResponse> genForRecognizeBusinessCard() {
        // basic
        HttpRequestDef.Builder<RecognizeBusinessCardRequest, RecognizeBusinessCardResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RecognizeBusinessCardRequest.class, RecognizeBusinessCardResponse.class)
            .withName("RecognizeBusinessCard")
            .withUri("/v2/{project_id}/ocr/business-card")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeBusinessCardRequest::getEnterpriseProjectId,
                RecognizeBusinessCardRequest::setEnterpriseProjectId));
        builder.<BusinessCardRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BusinessCardRequestBody.class),
            f -> f.withMarshaller(RecognizeBusinessCardRequest::getBody, RecognizeBusinessCardRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeBusinessLicenseRequest, RecognizeBusinessLicenseResponse> recognizeBusinessLicense =
        genForRecognizeBusinessLicense();

    private static HttpRequestDef<RecognizeBusinessLicenseRequest, RecognizeBusinessLicenseResponse> genForRecognizeBusinessLicense() {
        // basic
        HttpRequestDef.Builder<RecognizeBusinessLicenseRequest, RecognizeBusinessLicenseResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, RecognizeBusinessLicenseRequest.class, RecognizeBusinessLicenseResponse.class)
                .withName("RecognizeBusinessLicense")
                .withUri("/v2/{project_id}/ocr/business-license")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeBusinessLicenseRequest::getEnterpriseProjectId,
                RecognizeBusinessLicenseRequest::setEnterpriseProjectId));
        builder.<BusinessLicenseRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BusinessLicenseRequestBody.class),
            f -> f.withMarshaller(RecognizeBusinessLicenseRequest::getBody, RecognizeBusinessLicenseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeCambodianIdCardRequest, RecognizeCambodianIdCardResponse> recognizeCambodianIdCard =
        genForRecognizeCambodianIdCard();

    private static HttpRequestDef<RecognizeCambodianIdCardRequest, RecognizeCambodianIdCardResponse> genForRecognizeCambodianIdCard() {
        // basic
        HttpRequestDef.Builder<RecognizeCambodianIdCardRequest, RecognizeCambodianIdCardResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, RecognizeCambodianIdCardRequest.class, RecognizeCambodianIdCardResponse.class)
                .withName("RecognizeCambodianIdCard")
                .withUri("/v2/{project_id}/ocr/cambodian-idcard")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeCambodianIdCardRequest::getEnterpriseProjectId,
                RecognizeCambodianIdCardRequest::setEnterpriseProjectId));
        builder.<CambodianIdCardRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CambodianIdCardRequestBody.class),
            f -> f.withMarshaller(RecognizeCambodianIdCardRequest::getBody, RecognizeCambodianIdCardRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeChileIdCardRequest, RecognizeChileIdCardResponse> recognizeChileIdCard =
        genForRecognizeChileIdCard();

    private static HttpRequestDef<RecognizeChileIdCardRequest, RecognizeChileIdCardResponse> genForRecognizeChileIdCard() {
        // basic
        HttpRequestDef.Builder<RecognizeChileIdCardRequest, RecognizeChileIdCardResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RecognizeChileIdCardRequest.class, RecognizeChileIdCardResponse.class)
            .withName("RecognizeChileIdCard")
            .withUri("/v2/{project_id}/ocr/chile-id-card")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeChileIdCardRequest::getEnterpriseProjectId,
                RecognizeChileIdCardRequest::setEnterpriseProjectId));
        builder.<ChileIdCardRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChileIdCardRequestBody.class),
            f -> f.withMarshaller(RecognizeChileIdCardRequest::getBody, RecognizeChileIdCardRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeColombiaIdCardRequest, RecognizeColombiaIdCardResponse> recognizeColombiaIdCard =
        genForRecognizeColombiaIdCard();

    private static HttpRequestDef<RecognizeColombiaIdCardRequest, RecognizeColombiaIdCardResponse> genForRecognizeColombiaIdCard() {
        // basic
        HttpRequestDef.Builder<RecognizeColombiaIdCardRequest, RecognizeColombiaIdCardResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RecognizeColombiaIdCardRequest.class, RecognizeColombiaIdCardResponse.class)
            .withName("RecognizeColombiaIdCard")
            .withUri("/v2/{project_id}/ocr/colombia-id-card")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeColombiaIdCardRequest::getEnterpriseProjectId,
                RecognizeColombiaIdCardRequest::setEnterpriseProjectId));
        builder.<ColombiaIdCardRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ColombiaIdCardRequestBody.class),
            f -> f.withMarshaller(RecognizeColombiaIdCardRequest::getBody, RecognizeColombiaIdCardRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeDriverLicenseRequest, RecognizeDriverLicenseResponse> recognizeDriverLicense =
        genForRecognizeDriverLicense();

    private static HttpRequestDef<RecognizeDriverLicenseRequest, RecognizeDriverLicenseResponse> genForRecognizeDriverLicense() {
        // basic
        HttpRequestDef.Builder<RecognizeDriverLicenseRequest, RecognizeDriverLicenseResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RecognizeDriverLicenseRequest.class, RecognizeDriverLicenseResponse.class)
            .withName("RecognizeDriverLicense")
            .withUri("/v2/{project_id}/ocr/driver-license")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeDriverLicenseRequest::getEnterpriseProjectId,
                RecognizeDriverLicenseRequest::setEnterpriseProjectId));
        builder.<DriverLicenseRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DriverLicenseRequestBody.class),
            f -> f.withMarshaller(RecognizeDriverLicenseRequest::getBody, RecognizeDriverLicenseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeExitEntryPermitRequest, RecognizeExitEntryPermitResponse> recognizeExitEntryPermit =
        genForRecognizeExitEntryPermit();

    private static HttpRequestDef<RecognizeExitEntryPermitRequest, RecognizeExitEntryPermitResponse> genForRecognizeExitEntryPermit() {
        // basic
        HttpRequestDef.Builder<RecognizeExitEntryPermitRequest, RecognizeExitEntryPermitResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, RecognizeExitEntryPermitRequest.class, RecognizeExitEntryPermitResponse.class)
                .withName("RecognizeExitEntryPermit")
                .withUri("/v2/{project_id}/ocr/exit-entry-permit")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeExitEntryPermitRequest::getEnterpriseProjectId,
                RecognizeExitEntryPermitRequest::setEnterpriseProjectId));
        builder.<ExitEntryPermitRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExitEntryPermitRequestBody.class),
            f -> f.withMarshaller(RecognizeExitEntryPermitRequest::getBody, RecognizeExitEntryPermitRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeFinancialStatementRequest, RecognizeFinancialStatementResponse> recognizeFinancialStatement =
        genForRecognizeFinancialStatement();

    private static HttpRequestDef<RecognizeFinancialStatementRequest, RecognizeFinancialStatementResponse> genForRecognizeFinancialStatement() {
        // basic
        HttpRequestDef.Builder<RecognizeFinancialStatementRequest, RecognizeFinancialStatementResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RecognizeFinancialStatementRequest.class,
                    RecognizeFinancialStatementResponse.class)
                .withName("RecognizeFinancialStatement")
                .withUri("/v2/{project_id}/ocr/financial-statement")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeFinancialStatementRequest::getEnterpriseProjectId,
                RecognizeFinancialStatementRequest::setEnterpriseProjectId));
        builder.<FinancialStatementRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(FinancialStatementRequestBody.class),
            f -> f.withMarshaller(RecognizeFinancialStatementRequest::getBody,
                RecognizeFinancialStatementRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeFlightItineraryRequest, RecognizeFlightItineraryResponse> recognizeFlightItinerary =
        genForRecognizeFlightItinerary();

    private static HttpRequestDef<RecognizeFlightItineraryRequest, RecognizeFlightItineraryResponse> genForRecognizeFlightItinerary() {
        // basic
        HttpRequestDef.Builder<RecognizeFlightItineraryRequest, RecognizeFlightItineraryResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, RecognizeFlightItineraryRequest.class, RecognizeFlightItineraryResponse.class)
                .withName("RecognizeFlightItinerary")
                .withUri("/v2/{project_id}/ocr/flight-itinerary")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeFlightItineraryRequest::getEnterpriseProjectId,
                RecognizeFlightItineraryRequest::setEnterpriseProjectId));
        builder.<FlightItineraryRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(FlightItineraryRequestBody.class),
            f -> f.withMarshaller(RecognizeFlightItineraryRequest::getBody, RecognizeFlightItineraryRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeGeneralTableRequest, RecognizeGeneralTableResponse> recognizeGeneralTable =
        genForRecognizeGeneralTable();

    private static HttpRequestDef<RecognizeGeneralTableRequest, RecognizeGeneralTableResponse> genForRecognizeGeneralTable() {
        // basic
        HttpRequestDef.Builder<RecognizeGeneralTableRequest, RecognizeGeneralTableResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RecognizeGeneralTableRequest.class, RecognizeGeneralTableResponse.class)
            .withName("RecognizeGeneralTable")
            .withUri("/v2/{project_id}/ocr/general-table")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeGeneralTableRequest::getEnterpriseProjectId,
                RecognizeGeneralTableRequest::setEnterpriseProjectId));
        builder.<GeneralTableRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(GeneralTableRequestBody.class),
            f -> f.withMarshaller(RecognizeGeneralTableRequest::getBody, RecognizeGeneralTableRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeGeneralTextRequest, RecognizeGeneralTextResponse> recognizeGeneralText =
        genForRecognizeGeneralText();

    private static HttpRequestDef<RecognizeGeneralTextRequest, RecognizeGeneralTextResponse> genForRecognizeGeneralText() {
        // basic
        HttpRequestDef.Builder<RecognizeGeneralTextRequest, RecognizeGeneralTextResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RecognizeGeneralTextRequest.class, RecognizeGeneralTextResponse.class)
            .withName("RecognizeGeneralText")
            .withUri("/v2/{project_id}/ocr/general-text")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeGeneralTextRequest::getEnterpriseProjectId,
                RecognizeGeneralTextRequest::setEnterpriseProjectId));
        builder.<GeneralTextRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(GeneralTextRequestBody.class),
            f -> f.withMarshaller(RecognizeGeneralTextRequest::getBody, RecognizeGeneralTextRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeHandwritingRequest, RecognizeHandwritingResponse> recognizeHandwriting =
        genForRecognizeHandwriting();

    private static HttpRequestDef<RecognizeHandwritingRequest, RecognizeHandwritingResponse> genForRecognizeHandwriting() {
        // basic
        HttpRequestDef.Builder<RecognizeHandwritingRequest, RecognizeHandwritingResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RecognizeHandwritingRequest.class, RecognizeHandwritingResponse.class)
            .withName("RecognizeHandwriting")
            .withUri("/v2/{project_id}/ocr/handwriting")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeHandwritingRequest::getEnterpriseProjectId,
                RecognizeHandwritingRequest::setEnterpriseProjectId));
        builder.<HandwritingRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(HandwritingRequestBody.class),
            f -> f.withMarshaller(RecognizeHandwritingRequest::getBody, RecognizeHandwritingRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeHealthCodeRequest, RecognizeHealthCodeResponse> recognizeHealthCode =
        genForRecognizeHealthCode();

    private static HttpRequestDef<RecognizeHealthCodeRequest, RecognizeHealthCodeResponse> genForRecognizeHealthCode() {
        // basic
        HttpRequestDef.Builder<RecognizeHealthCodeRequest, RecognizeHealthCodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RecognizeHealthCodeRequest.class, RecognizeHealthCodeResponse.class)
                .withName("RecognizeHealthCode")
                .withUri("/v2/{project_id}/ocr/health-code")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeHealthCodeRequest::getEnterpriseProjectId,
                RecognizeHealthCodeRequest::setEnterpriseProjectId));
        builder.<HealthCodeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(HealthCodeRequestBody.class),
            f -> f.withMarshaller(RecognizeHealthCodeRequest::getBody, RecognizeHealthCodeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeHkIdCardRequest, RecognizeHkIdCardResponse> recognizeHkIdCard =
        genForRecognizeHkIdCard();

    private static HttpRequestDef<RecognizeHkIdCardRequest, RecognizeHkIdCardResponse> genForRecognizeHkIdCard() {
        // basic
        HttpRequestDef.Builder<RecognizeHkIdCardRequest, RecognizeHkIdCardResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RecognizeHkIdCardRequest.class, RecognizeHkIdCardResponse.class)
                .withName("RecognizeHkIdCard")
                .withUri("/v2/{project_id}/ocr/hk-id-card")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeHkIdCardRequest::getEnterpriseProjectId,
                RecognizeHkIdCardRequest::setEnterpriseProjectId));
        builder.<HkIdCardRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(HkIdCardRequestBody.class),
            f -> f.withMarshaller(RecognizeHkIdCardRequest::getBody, RecognizeHkIdCardRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeHouseholdRegisterRequest, RecognizeHouseholdRegisterResponse> recognizeHouseholdRegister =
        genForRecognizeHouseholdRegister();

    private static HttpRequestDef<RecognizeHouseholdRegisterRequest, RecognizeHouseholdRegisterResponse> genForRecognizeHouseholdRegister() {
        // basic
        HttpRequestDef.Builder<RecognizeHouseholdRegisterRequest, RecognizeHouseholdRegisterResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RecognizeHouseholdRegisterRequest.class,
                    RecognizeHouseholdRegisterResponse.class)
                .withName("RecognizeHouseholdRegister")
                .withUri("/v2/{project_id}/ocr/household-register")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeHouseholdRegisterRequest::getEnterpriseProjectId,
                RecognizeHouseholdRegisterRequest::setEnterpriseProjectId));
        builder.<HouseholdRegisterRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(HouseholdRegisterRequestBody.class),
            f -> f.withMarshaller(RecognizeHouseholdRegisterRequest::getBody,
                RecognizeHouseholdRegisterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeIdCardRequest, RecognizeIdCardResponse> recognizeIdCard =
        genForRecognizeIdCard();

    private static HttpRequestDef<RecognizeIdCardRequest, RecognizeIdCardResponse> genForRecognizeIdCard() {
        // basic
        HttpRequestDef.Builder<RecognizeIdCardRequest, RecognizeIdCardResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RecognizeIdCardRequest.class, RecognizeIdCardResponse.class)
                .withName("RecognizeIdCard")
                .withUri("/v2/{project_id}/ocr/id-card")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeIdCardRequest::getEnterpriseProjectId,
                RecognizeIdCardRequest::setEnterpriseProjectId));
        builder.<IdCardRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IdCardRequestBody.class),
            f -> f.withMarshaller(RecognizeIdCardRequest::getBody, RecognizeIdCardRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeIdDocumentRequest, RecognizeIdDocumentResponse> recognizeIdDocument =
        genForRecognizeIdDocument();

    private static HttpRequestDef<RecognizeIdDocumentRequest, RecognizeIdDocumentResponse> genForRecognizeIdDocument() {
        // basic
        HttpRequestDef.Builder<RecognizeIdDocumentRequest, RecognizeIdDocumentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RecognizeIdDocumentRequest.class, RecognizeIdDocumentResponse.class)
                .withName("RecognizeIdDocument")
                .withUri("/v2/{project_id}/ocr/id-document")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeIdDocumentRequest::getEnterpriseProjectId,
                RecognizeIdDocumentRequest::setEnterpriseProjectId));
        builder.<IdDocumentRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IdDocumentRequestBody.class),
            f -> f.withMarshaller(RecognizeIdDocumentRequest::getBody, RecognizeIdDocumentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeInsurancePolicyRequest, RecognizeInsurancePolicyResponse> recognizeInsurancePolicy =
        genForRecognizeInsurancePolicy();

    private static HttpRequestDef<RecognizeInsurancePolicyRequest, RecognizeInsurancePolicyResponse> genForRecognizeInsurancePolicy() {
        // basic
        HttpRequestDef.Builder<RecognizeInsurancePolicyRequest, RecognizeInsurancePolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, RecognizeInsurancePolicyRequest.class, RecognizeInsurancePolicyResponse.class)
                .withName("RecognizeInsurancePolicy")
                .withUri("/v2/{project_id}/ocr/insurance-policy")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeInsurancePolicyRequest::getEnterpriseProjectId,
                RecognizeInsurancePolicyRequest::setEnterpriseProjectId));
        builder.<InsurancePolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InsurancePolicyRequestBody.class),
            f -> f.withMarshaller(RecognizeInsurancePolicyRequest::getBody, RecognizeInsurancePolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeInvoiceVerificationRequest, RecognizeInvoiceVerificationResponse> recognizeInvoiceVerification =
        genForRecognizeInvoiceVerification();

    private static HttpRequestDef<RecognizeInvoiceVerificationRequest, RecognizeInvoiceVerificationResponse> genForRecognizeInvoiceVerification() {
        // basic
        HttpRequestDef.Builder<RecognizeInvoiceVerificationRequest, RecognizeInvoiceVerificationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RecognizeInvoiceVerificationRequest.class,
                    RecognizeInvoiceVerificationResponse.class)
                .withName("RecognizeInvoiceVerification")
                .withUri("/v2/{project_id}/ocr/invoice-verification")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeInvoiceVerificationRequest::getEnterpriseProjectId,
                RecognizeInvoiceVerificationRequest::setEnterpriseProjectId));
        builder.<InvoiceVerificationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InvoiceVerificationRequestBody.class),
            f -> f.withMarshaller(RecognizeInvoiceVerificationRequest::getBody,
                RecognizeInvoiceVerificationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeLicensePlateRequest, RecognizeLicensePlateResponse> recognizeLicensePlate =
        genForRecognizeLicensePlate();

    private static HttpRequestDef<RecognizeLicensePlateRequest, RecognizeLicensePlateResponse> genForRecognizeLicensePlate() {
        // basic
        HttpRequestDef.Builder<RecognizeLicensePlateRequest, RecognizeLicensePlateResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RecognizeLicensePlateRequest.class, RecognizeLicensePlateResponse.class)
            .withName("RecognizeLicensePlate")
            .withUri("/v2/{project_id}/ocr/license-plate")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeLicensePlateRequest::getEnterpriseProjectId,
                RecognizeLicensePlateRequest::setEnterpriseProjectId));
        builder.<LicensePlateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LicensePlateRequestBody.class),
            f -> f.withMarshaller(RecognizeLicensePlateRequest::getBody, RecognizeLicensePlateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeMacaoIdCardRequest, RecognizeMacaoIdCardResponse> recognizeMacaoIdCard =
        genForRecognizeMacaoIdCard();

    private static HttpRequestDef<RecognizeMacaoIdCardRequest, RecognizeMacaoIdCardResponse> genForRecognizeMacaoIdCard() {
        // basic
        HttpRequestDef.Builder<RecognizeMacaoIdCardRequest, RecognizeMacaoIdCardResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RecognizeMacaoIdCardRequest.class, RecognizeMacaoIdCardResponse.class)
            .withName("RecognizeMacaoIdCard")
            .withUri("/v2/{project_id}/ocr/macao-id-card")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeMacaoIdCardRequest::getEnterpriseProjectId,
                RecognizeMacaoIdCardRequest::setEnterpriseProjectId));
        builder.<MacaoIdCardRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MacaoIdCardRequestBody.class),
            f -> f.withMarshaller(RecognizeMacaoIdCardRequest::getBody, RecognizeMacaoIdCardRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeMainlandTravelPermitRequest, RecognizeMainlandTravelPermitResponse> recognizeMainlandTravelPermit =
        genForRecognizeMainlandTravelPermit();

    private static HttpRequestDef<RecognizeMainlandTravelPermitRequest, RecognizeMainlandTravelPermitResponse> genForRecognizeMainlandTravelPermit() {
        // basic
        HttpRequestDef.Builder<RecognizeMainlandTravelPermitRequest, RecognizeMainlandTravelPermitResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RecognizeMainlandTravelPermitRequest.class,
                    RecognizeMainlandTravelPermitResponse.class)
                .withName("RecognizeMainlandTravelPermit")
                .withUri("/v2/{project_id}/ocr/mainland-travel-permit")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeMainlandTravelPermitRequest::getEnterpriseProjectId,
                RecognizeMainlandTravelPermitRequest::setEnterpriseProjectId));
        builder.<MainlandTravelPermitRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MainlandTravelPermitRequestBody.class),
            f -> f.withMarshaller(RecognizeMainlandTravelPermitRequest::getBody,
                RecognizeMainlandTravelPermitRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeMvsInvoiceRequest, RecognizeMvsInvoiceResponse> recognizeMvsInvoice =
        genForRecognizeMvsInvoice();

    private static HttpRequestDef<RecognizeMvsInvoiceRequest, RecognizeMvsInvoiceResponse> genForRecognizeMvsInvoice() {
        // basic
        HttpRequestDef.Builder<RecognizeMvsInvoiceRequest, RecognizeMvsInvoiceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RecognizeMvsInvoiceRequest.class, RecognizeMvsInvoiceResponse.class)
                .withName("RecognizeMvsInvoice")
                .withUri("/v2/{project_id}/ocr/mvs-invoice")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeMvsInvoiceRequest::getEnterpriseProjectId,
                RecognizeMvsInvoiceRequest::setEnterpriseProjectId));
        builder.<MvsInvoiceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MvsInvoiceRequestBody.class),
            f -> f.withMarshaller(RecognizeMvsInvoiceRequest::getBody, RecognizeMvsInvoiceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeMyanmarDriverLicenseRequest, RecognizeMyanmarDriverLicenseResponse> recognizeMyanmarDriverLicense =
        genForRecognizeMyanmarDriverLicense();

    private static HttpRequestDef<RecognizeMyanmarDriverLicenseRequest, RecognizeMyanmarDriverLicenseResponse> genForRecognizeMyanmarDriverLicense() {
        // basic
        HttpRequestDef.Builder<RecognizeMyanmarDriverLicenseRequest, RecognizeMyanmarDriverLicenseResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RecognizeMyanmarDriverLicenseRequest.class,
                    RecognizeMyanmarDriverLicenseResponse.class)
                .withName("RecognizeMyanmarDriverLicense")
                .withUri("/v2/{project_id}/ocr/myanmar-driver-license")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeMyanmarDriverLicenseRequest::getEnterpriseProjectId,
                RecognizeMyanmarDriverLicenseRequest::setEnterpriseProjectId));
        builder.<MyanmarDriverLicenseRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MyanmarDriverLicenseRequestBody.class),
            f -> f.withMarshaller(RecognizeMyanmarDriverLicenseRequest::getBody,
                RecognizeMyanmarDriverLicenseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeMyanmarIdcardRequest, RecognizeMyanmarIdcardResponse> recognizeMyanmarIdcard =
        genForRecognizeMyanmarIdcard();

    private static HttpRequestDef<RecognizeMyanmarIdcardRequest, RecognizeMyanmarIdcardResponse> genForRecognizeMyanmarIdcard() {
        // basic
        HttpRequestDef.Builder<RecognizeMyanmarIdcardRequest, RecognizeMyanmarIdcardResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RecognizeMyanmarIdcardRequest.class, RecognizeMyanmarIdcardResponse.class)
            .withName("RecognizeMyanmarIdcard")
            .withUri("/v2/{project_id}/ocr/myanmar-id-card")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeMyanmarIdcardRequest::getEnterpriseProjectId,
                RecognizeMyanmarIdcardRequest::setEnterpriseProjectId));
        builder.<MyanmarIdcardRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MyanmarIdcardRequestBody.class),
            f -> f.withMarshaller(RecognizeMyanmarIdcardRequest::getBody, RecognizeMyanmarIdcardRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizePassportRequest, RecognizePassportResponse> recognizePassport =
        genForRecognizePassport();

    private static HttpRequestDef<RecognizePassportRequest, RecognizePassportResponse> genForRecognizePassport() {
        // basic
        HttpRequestDef.Builder<RecognizePassportRequest, RecognizePassportResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RecognizePassportRequest.class, RecognizePassportResponse.class)
                .withName("RecognizePassport")
                .withUri("/v2/{project_id}/ocr/passport")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizePassportRequest::getEnterpriseProjectId,
                RecognizePassportRequest::setEnterpriseProjectId));
        builder.<PassportRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PassportRequestBody.class),
            f -> f.withMarshaller(RecognizePassportRequest::getBody, RecognizePassportRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizePcrTestRecordRequest, RecognizePcrTestRecordResponse> recognizePcrTestRecord =
        genForRecognizePcrTestRecord();

    private static HttpRequestDef<RecognizePcrTestRecordRequest, RecognizePcrTestRecordResponse> genForRecognizePcrTestRecord() {
        // basic
        HttpRequestDef.Builder<RecognizePcrTestRecordRequest, RecognizePcrTestRecordResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RecognizePcrTestRecordRequest.class, RecognizePcrTestRecordResponse.class)
            .withName("RecognizePcrTestRecord")
            .withUri("/v2/{project_id}/ocr/pcr-test-record")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizePcrTestRecordRequest::getEnterpriseProjectId,
                RecognizePcrTestRecordRequest::setEnterpriseProjectId));
        builder.<PcrTestRecordRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PcrTestRecordRequestBody.class),
            f -> f.withMarshaller(RecognizePcrTestRecordRequest::getBody, RecognizePcrTestRecordRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizePeruIdCardRequest, RecognizePeruIdCardResponse> recognizePeruIdCard =
        genForRecognizePeruIdCard();

    private static HttpRequestDef<RecognizePeruIdCardRequest, RecognizePeruIdCardResponse> genForRecognizePeruIdCard() {
        // basic
        HttpRequestDef.Builder<RecognizePeruIdCardRequest, RecognizePeruIdCardResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RecognizePeruIdCardRequest.class, RecognizePeruIdCardResponse.class)
                .withName("RecognizePeruIdCard")
                .withUri("/v2/{project_id}/ocr/peru-id-card")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizePeruIdCardRequest::getEnterpriseProjectId,
                RecognizePeruIdCardRequest::setEnterpriseProjectId));
        builder.<PeruIdCardRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PeruIdCardRequestBody.class),
            f -> f.withMarshaller(RecognizePeruIdCardRequest::getBody, RecognizePeruIdCardRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeQualificationCertificateRequest, RecognizeQualificationCertificateResponse> recognizeQualificationCertificate =
        genForRecognizeQualificationCertificate();

    private static HttpRequestDef<RecognizeQualificationCertificateRequest, RecognizeQualificationCertificateResponse> genForRecognizeQualificationCertificate() {
        // basic
        HttpRequestDef.Builder<RecognizeQualificationCertificateRequest, RecognizeQualificationCertificateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RecognizeQualificationCertificateRequest.class,
                    RecognizeQualificationCertificateResponse.class)
                .withName("RecognizeQualificationCertificate")
                .withUri("/v2/{project_id}/ocr/transportation-qualification-certificate")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeQualificationCertificateRequest::getEnterpriseProjectId,
                RecognizeQualificationCertificateRequest::setEnterpriseProjectId));
        builder.<QualificationCertificateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QualificationCertificateRequestBody.class),
            f -> f.withMarshaller(RecognizeQualificationCertificateRequest::getBody,
                RecognizeQualificationCertificateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeQuotaInvoiceRequest, RecognizeQuotaInvoiceResponse> recognizeQuotaInvoice =
        genForRecognizeQuotaInvoice();

    private static HttpRequestDef<RecognizeQuotaInvoiceRequest, RecognizeQuotaInvoiceResponse> genForRecognizeQuotaInvoice() {
        // basic
        HttpRequestDef.Builder<RecognizeQuotaInvoiceRequest, RecognizeQuotaInvoiceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RecognizeQuotaInvoiceRequest.class, RecognizeQuotaInvoiceResponse.class)
            .withName("RecognizeQuotaInvoice")
            .withUri("/v2/{project_id}/ocr/quota-invoice")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeQuotaInvoiceRequest::getEnterpriseProjectId,
                RecognizeQuotaInvoiceRequest::setEnterpriseProjectId));
        builder.<QuotaInvoiceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QuotaInvoiceRequestBody.class),
            f -> f.withMarshaller(RecognizeQuotaInvoiceRequest::getBody, RecognizeQuotaInvoiceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeRealEstateCertificateRequest, RecognizeRealEstateCertificateResponse> recognizeRealEstateCertificate =
        genForRecognizeRealEstateCertificate();

    private static HttpRequestDef<RecognizeRealEstateCertificateRequest, RecognizeRealEstateCertificateResponse> genForRecognizeRealEstateCertificate() {
        // basic
        HttpRequestDef.Builder<RecognizeRealEstateCertificateRequest, RecognizeRealEstateCertificateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RecognizeRealEstateCertificateRequest.class,
                    RecognizeRealEstateCertificateResponse.class)
                .withName("RecognizeRealEstateCertificate")
                .withUri("/v2/{project_id}/ocr/real-estate-certificate")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeRealEstateCertificateRequest::getEnterpriseProjectId,
                RecognizeRealEstateCertificateRequest::setEnterpriseProjectId));
        builder.<RealEstateCertificateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RealEstateCertificateRequestBody.class),
            f -> f.withMarshaller(RecognizeRealEstateCertificateRequest::getBody,
                RecognizeRealEstateCertificateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeSealRequest, RecognizeSealResponse> recognizeSeal =
        genForRecognizeSeal();

    private static HttpRequestDef<RecognizeSealRequest, RecognizeSealResponse> genForRecognizeSeal() {
        // basic
        HttpRequestDef.Builder<RecognizeSealRequest, RecognizeSealResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RecognizeSealRequest.class, RecognizeSealResponse.class)
                .withName("RecognizeSeal")
                .withUri("/v2/{project_id}/ocr/seal")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeSealRequest::getEnterpriseProjectId,
                RecognizeSealRequest::setEnterpriseProjectId));
        builder.<SealRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SealRequestBody.class),
            f -> f.withMarshaller(RecognizeSealRequest::getBody, RecognizeSealRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeSmartDocumentRecognizerRequest, RecognizeSmartDocumentRecognizerResponse> recognizeSmartDocumentRecognizer =
        genForRecognizeSmartDocumentRecognizer();

    private static HttpRequestDef<RecognizeSmartDocumentRecognizerRequest, RecognizeSmartDocumentRecognizerResponse> genForRecognizeSmartDocumentRecognizer() {
        // basic
        HttpRequestDef.Builder<RecognizeSmartDocumentRecognizerRequest, RecognizeSmartDocumentRecognizerResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RecognizeSmartDocumentRecognizerRequest.class,
                    RecognizeSmartDocumentRecognizerResponse.class)
                .withName("RecognizeSmartDocumentRecognizer")
                .withUri("/v2/{project_id}/ocr/smart-document-recognizer")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeSmartDocumentRecognizerRequest::getEnterpriseProjectId,
                RecognizeSmartDocumentRecognizerRequest::setEnterpriseProjectId));
        builder.<SmartDocumentRecognizerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SmartDocumentRecognizerRequestBody.class),
            f -> f.withMarshaller(RecognizeSmartDocumentRecognizerRequest::getBody,
                RecognizeSmartDocumentRecognizerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeTaxiInvoiceRequest, RecognizeTaxiInvoiceResponse> recognizeTaxiInvoice =
        genForRecognizeTaxiInvoice();

    private static HttpRequestDef<RecognizeTaxiInvoiceRequest, RecognizeTaxiInvoiceResponse> genForRecognizeTaxiInvoice() {
        // basic
        HttpRequestDef.Builder<RecognizeTaxiInvoiceRequest, RecognizeTaxiInvoiceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RecognizeTaxiInvoiceRequest.class, RecognizeTaxiInvoiceResponse.class)
            .withName("RecognizeTaxiInvoice")
            .withUri("/v2/{project_id}/ocr/taxi-invoice")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeTaxiInvoiceRequest::getEnterpriseProjectId,
                RecognizeTaxiInvoiceRequest::setEnterpriseProjectId));
        builder.<TaxiInvoiceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TaxiInvoiceRequestBody.class),
            f -> f.withMarshaller(RecognizeTaxiInvoiceRequest::getBody, RecognizeTaxiInvoiceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeThailandIdcardRequest, RecognizeThailandIdcardResponse> recognizeThailandIdcard =
        genForRecognizeThailandIdcard();

    private static HttpRequestDef<RecognizeThailandIdcardRequest, RecognizeThailandIdcardResponse> genForRecognizeThailandIdcard() {
        // basic
        HttpRequestDef.Builder<RecognizeThailandIdcardRequest, RecognizeThailandIdcardResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RecognizeThailandIdcardRequest.class, RecognizeThailandIdcardResponse.class)
            .withName("RecognizeThailandIdcard")
            .withUri("/v2/{project_id}/ocr/thailand-id-card")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeThailandIdcardRequest::getEnterpriseProjectId,
                RecognizeThailandIdcardRequest::setEnterpriseProjectId));
        builder.<ThailandIdcardRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ThailandIdcardRequestBody.class),
            f -> f.withMarshaller(RecognizeThailandIdcardRequest::getBody, RecognizeThailandIdcardRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeThailandLicensePlateRequest, RecognizeThailandLicensePlateResponse> recognizeThailandLicensePlate =
        genForRecognizeThailandLicensePlate();

    private static HttpRequestDef<RecognizeThailandLicensePlateRequest, RecognizeThailandLicensePlateResponse> genForRecognizeThailandLicensePlate() {
        // basic
        HttpRequestDef.Builder<RecognizeThailandLicensePlateRequest, RecognizeThailandLicensePlateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RecognizeThailandLicensePlateRequest.class,
                    RecognizeThailandLicensePlateResponse.class)
                .withName("RecognizeThailandLicensePlate")
                .withUri("/v2/{project_id}/ocr/thailand-license-plate")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeThailandLicensePlateRequest::getEnterpriseProjectId,
                RecognizeThailandLicensePlateRequest::setEnterpriseProjectId));
        builder.<ThailandLicensePlateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ThailandLicensePlateRequestBody.class),
            f -> f.withMarshaller(RecognizeThailandLicensePlateRequest::getBody,
                RecognizeThailandLicensePlateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeTollInvoiceRequest, RecognizeTollInvoiceResponse> recognizeTollInvoice =
        genForRecognizeTollInvoice();

    private static HttpRequestDef<RecognizeTollInvoiceRequest, RecognizeTollInvoiceResponse> genForRecognizeTollInvoice() {
        // basic
        HttpRequestDef.Builder<RecognizeTollInvoiceRequest, RecognizeTollInvoiceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RecognizeTollInvoiceRequest.class, RecognizeTollInvoiceResponse.class)
            .withName("RecognizeTollInvoice")
            .withUri("/v2/{project_id}/ocr/toll-invoice")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeTollInvoiceRequest::getEnterpriseProjectId,
                RecognizeTollInvoiceRequest::setEnterpriseProjectId));
        builder.<TollInvoiceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TollInvoiceRequestBody.class),
            f -> f.withMarshaller(RecognizeTollInvoiceRequest::getBody, RecognizeTollInvoiceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeTrainTicketRequest, RecognizeTrainTicketResponse> recognizeTrainTicket =
        genForRecognizeTrainTicket();

    private static HttpRequestDef<RecognizeTrainTicketRequest, RecognizeTrainTicketResponse> genForRecognizeTrainTicket() {
        // basic
        HttpRequestDef.Builder<RecognizeTrainTicketRequest, RecognizeTrainTicketResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RecognizeTrainTicketRequest.class, RecognizeTrainTicketResponse.class)
            .withName("RecognizeTrainTicket")
            .withUri("/v2/{project_id}/ocr/train-ticket")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeTrainTicketRequest::getEnterpriseProjectId,
                RecognizeTrainTicketRequest::setEnterpriseProjectId));
        builder.<TrainTicketRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TrainTicketRequestBody.class),
            f -> f.withMarshaller(RecognizeTrainTicketRequest::getBody, RecognizeTrainTicketRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeTransportationLicenseRequest, RecognizeTransportationLicenseResponse> recognizeTransportationLicense =
        genForRecognizeTransportationLicense();

    private static HttpRequestDef<RecognizeTransportationLicenseRequest, RecognizeTransportationLicenseResponse> genForRecognizeTransportationLicense() {
        // basic
        HttpRequestDef.Builder<RecognizeTransportationLicenseRequest, RecognizeTransportationLicenseResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RecognizeTransportationLicenseRequest.class,
                    RecognizeTransportationLicenseResponse.class)
                .withName("RecognizeTransportationLicense")
                .withUri("/v2/{project_id}/ocr/transportation-license")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeTransportationLicenseRequest::getEnterpriseProjectId,
                RecognizeTransportationLicenseRequest::setEnterpriseProjectId));
        builder.<TransportationLicenseRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TransportationLicenseRequestBody.class),
            f -> f.withMarshaller(RecognizeTransportationLicenseRequest::getBody,
                RecognizeTransportationLicenseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeVatInvoiceRequest, RecognizeVatInvoiceResponse> recognizeVatInvoice =
        genForRecognizeVatInvoice();

    private static HttpRequestDef<RecognizeVatInvoiceRequest, RecognizeVatInvoiceResponse> genForRecognizeVatInvoice() {
        // basic
        HttpRequestDef.Builder<RecognizeVatInvoiceRequest, RecognizeVatInvoiceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RecognizeVatInvoiceRequest.class, RecognizeVatInvoiceResponse.class)
                .withName("RecognizeVatInvoice")
                .withUri("/v2/{project_id}/ocr/vat-invoice")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeVatInvoiceRequest::getEnterpriseProjectId,
                RecognizeVatInvoiceRequest::setEnterpriseProjectId));
        builder.<VatInvoiceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VatInvoiceRequestBody.class),
            f -> f.withMarshaller(RecognizeVatInvoiceRequest::getBody, RecognizeVatInvoiceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeVehicleCertificateRequest, RecognizeVehicleCertificateResponse> recognizeVehicleCertificate =
        genForRecognizeVehicleCertificate();

    private static HttpRequestDef<RecognizeVehicleCertificateRequest, RecognizeVehicleCertificateResponse> genForRecognizeVehicleCertificate() {
        // basic
        HttpRequestDef.Builder<RecognizeVehicleCertificateRequest, RecognizeVehicleCertificateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RecognizeVehicleCertificateRequest.class,
                    RecognizeVehicleCertificateResponse.class)
                .withName("RecognizeVehicleCertificate")
                .withUri("/v2/{project_id}/ocr/vehicle-certificate")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeVehicleCertificateRequest::getEnterpriseProjectId,
                RecognizeVehicleCertificateRequest::setEnterpriseProjectId));
        builder.<VehicleCertificateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VehicleCertificateRequestBody.class),
            f -> f.withMarshaller(RecognizeVehicleCertificateRequest::getBody,
                RecognizeVehicleCertificateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeVehicleLicenseRequest, RecognizeVehicleLicenseResponse> recognizeVehicleLicense =
        genForRecognizeVehicleLicense();

    private static HttpRequestDef<RecognizeVehicleLicenseRequest, RecognizeVehicleLicenseResponse> genForRecognizeVehicleLicense() {
        // basic
        HttpRequestDef.Builder<RecognizeVehicleLicenseRequest, RecognizeVehicleLicenseResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RecognizeVehicleLicenseRequest.class, RecognizeVehicleLicenseResponse.class)
            .withName("RecognizeVehicleLicense")
            .withUri("/v2/{project_id}/ocr/vehicle-license")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeVehicleLicenseRequest::getEnterpriseProjectId,
                RecognizeVehicleLicenseRequest::setEnterpriseProjectId));
        builder.<VehicleLicenseRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VehicleLicenseRequestBody.class),
            f -> f.withMarshaller(RecognizeVehicleLicenseRequest::getBody, RecognizeVehicleLicenseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeVietnamIdCardRequest, RecognizeVietnamIdCardResponse> recognizeVietnamIdCard =
        genForRecognizeVietnamIdCard();

    private static HttpRequestDef<RecognizeVietnamIdCardRequest, RecognizeVietnamIdCardResponse> genForRecognizeVietnamIdCard() {
        // basic
        HttpRequestDef.Builder<RecognizeVietnamIdCardRequest, RecognizeVietnamIdCardResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RecognizeVietnamIdCardRequest.class, RecognizeVietnamIdCardResponse.class)
            .withName("RecognizeVietnamIdCard")
            .withUri("/v2/{project_id}/ocr/vietnam-id-card")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeVietnamIdCardRequest::getEnterpriseProjectId,
                RecognizeVietnamIdCardRequest::setEnterpriseProjectId));
        builder.<VietnamIdCardRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VietnamIdCardRequestBody.class),
            f -> f.withMarshaller(RecognizeVietnamIdCardRequest::getBody, RecognizeVietnamIdCardRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeWaybillElectronicRequest, RecognizeWaybillElectronicResponse> recognizeWaybillElectronic =
        genForRecognizeWaybillElectronic();

    private static HttpRequestDef<RecognizeWaybillElectronicRequest, RecognizeWaybillElectronicResponse> genForRecognizeWaybillElectronic() {
        // basic
        HttpRequestDef.Builder<RecognizeWaybillElectronicRequest, RecognizeWaybillElectronicResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RecognizeWaybillElectronicRequest.class,
                    RecognizeWaybillElectronicResponse.class)
                .withName("RecognizeWaybillElectronic")
                .withUri("/v2/{project_id}/ocr/waybill-electronic")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeWaybillElectronicRequest::getEnterpriseProjectId,
                RecognizeWaybillElectronicRequest::setEnterpriseProjectId));
        builder.<WaybillElectronicRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(WaybillElectronicRequestBody.class),
            f -> f.withMarshaller(RecognizeWaybillElectronicRequest::getBody,
                RecognizeWaybillElectronicRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeWebImageRequest, RecognizeWebImageResponse> recognizeWebImage =
        genForRecognizeWebImage();

    private static HttpRequestDef<RecognizeWebImageRequest, RecognizeWebImageResponse> genForRecognizeWebImage() {
        // basic
        HttpRequestDef.Builder<RecognizeWebImageRequest, RecognizeWebImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RecognizeWebImageRequest.class, RecognizeWebImageResponse.class)
                .withName("RecognizeWebImage")
                .withUri("/v2/{project_id}/ocr/web-image")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeWebImageRequest::getEnterpriseProjectId,
                RecognizeWebImageRequest::setEnterpriseProjectId));
        builder.<WebImageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(WebImageRequestBody.class),
            f -> f.withMarshaller(RecognizeWebImageRequest::getBody, RecognizeWebImageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeCustomTemplateRequest, RecognizeCustomTemplateResponse> recognizeCustomTemplate =
        genForRecognizeCustomTemplate();

    private static HttpRequestDef<RecognizeCustomTemplateRequest, RecognizeCustomTemplateResponse> genForRecognizeCustomTemplate() {
        // basic
        HttpRequestDef.Builder<RecognizeCustomTemplateRequest, RecognizeCustomTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RecognizeCustomTemplateRequest.class, RecognizeCustomTemplateResponse.class)
            .withName("RecognizeCustomTemplate")
            .withUri("/v2/{project_id}/ocr/custom-template")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeCustomTemplateRequest::getEnterpriseProjectId,
                RecognizeCustomTemplateRequest::setEnterpriseProjectId));
        builder.<CustomTemplateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CustomTemplateRequestBody.class),
            f -> f.withMarshaller(RecognizeCustomTemplateRequest::getBody, RecognizeCustomTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeVinRequest, RecognizeVinResponse> recognizeVin = genForRecognizeVin();

    private static HttpRequestDef<RecognizeVinRequest, RecognizeVinResponse> genForRecognizeVin() {
        // basic
        HttpRequestDef.Builder<RecognizeVinRequest, RecognizeVinResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RecognizeVinRequest.class, RecognizeVinResponse.class)
                .withName("RecognizeVin")
                .withUri("/v2/{project_id}/ocr/vin")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeVinRequest::getEnterpriseProjectId,
                RecognizeVinRequest::setEnterpriseProjectId));
        builder.<VinRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VinRequestBody.class),
            f -> f.withMarshaller(RecognizeVinRequest::getBody, RecognizeVinRequest::setBody));

        // response

        return builder.build();
    }

}
