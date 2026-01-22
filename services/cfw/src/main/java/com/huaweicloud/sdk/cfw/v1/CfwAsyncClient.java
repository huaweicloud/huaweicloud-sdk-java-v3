package com.huaweicloud.sdk.cfw.v1;

import com.huaweicloud.sdk.cfw.v1.model.AddAclRuleRequest;
import com.huaweicloud.sdk.cfw.v1.model.AddAclRuleResponse;
import com.huaweicloud.sdk.cfw.v1.model.AddAddressItemRequest;
import com.huaweicloud.sdk.cfw.v1.model.AddAddressItemResponse;
import com.huaweicloud.sdk.cfw.v1.model.AddAddressSetRequest;
import com.huaweicloud.sdk.cfw.v1.model.AddAddressSetResponse;
import com.huaweicloud.sdk.cfw.v1.model.AddBlackWhiteListRequest;
import com.huaweicloud.sdk.cfw.v1.model.AddBlackWhiteListResponse;
import com.huaweicloud.sdk.cfw.v1.model.AddCustomDnsServerRequest;
import com.huaweicloud.sdk.cfw.v1.model.AddCustomDnsServerResponse;
import com.huaweicloud.sdk.cfw.v1.model.AddDomainSetRequest;
import com.huaweicloud.sdk.cfw.v1.model.AddDomainSetResponse;
import com.huaweicloud.sdk.cfw.v1.model.AddDomainsRequest;
import com.huaweicloud.sdk.cfw.v1.model.AddDomainsResponse;
import com.huaweicloud.sdk.cfw.v1.model.AddEipAlarmWhitelistRequest;
import com.huaweicloud.sdk.cfw.v1.model.AddEipAlarmWhitelistResponse;
import com.huaweicloud.sdk.cfw.v1.model.AddLogConfigRequest;
import com.huaweicloud.sdk.cfw.v1.model.AddLogConfigResponse;
import com.huaweicloud.sdk.cfw.v1.model.AddServiceItemsRequest;
import com.huaweicloud.sdk.cfw.v1.model.AddServiceItemsResponse;
import com.huaweicloud.sdk.cfw.v1.model.AddServiceSetRequest;
import com.huaweicloud.sdk.cfw.v1.model.AddServiceSetResponse;
import com.huaweicloud.sdk.cfw.v1.model.BatchAddAccountsRequest;
import com.huaweicloud.sdk.cfw.v1.model.BatchAddAccountsResponse;
import com.huaweicloud.sdk.cfw.v1.model.BatchCreateBlackWhiteListRequest;
import com.huaweicloud.sdk.cfw.v1.model.BatchCreateBlackWhiteListResponse;
import com.huaweicloud.sdk.cfw.v1.model.BatchCreateIpsWhitelistRequest;
import com.huaweicloud.sdk.cfw.v1.model.BatchCreateIpsWhitelistResponse;
import com.huaweicloud.sdk.cfw.v1.model.BatchCreatePrivateNetworkSegmentsRequest;
import com.huaweicloud.sdk.cfw.v1.model.BatchCreatePrivateNetworkSegmentsResponse;
import com.huaweicloud.sdk.cfw.v1.model.BatchDeleteAclRulesRequest;
import com.huaweicloud.sdk.cfw.v1.model.BatchDeleteAclRulesResponse;
import com.huaweicloud.sdk.cfw.v1.model.BatchDeleteAddressItemsRequest;
import com.huaweicloud.sdk.cfw.v1.model.BatchDeleteAddressItemsResponse;
import com.huaweicloud.sdk.cfw.v1.model.BatchDeleteAddressSetsRequest;
import com.huaweicloud.sdk.cfw.v1.model.BatchDeleteAddressSetsResponse;
import com.huaweicloud.sdk.cfw.v1.model.BatchDeleteBlackWhiteListsRequest;
import com.huaweicloud.sdk.cfw.v1.model.BatchDeleteBlackWhiteListsResponse;
import com.huaweicloud.sdk.cfw.v1.model.BatchDeleteCustomerIpsRequest;
import com.huaweicloud.sdk.cfw.v1.model.BatchDeleteCustomerIpsResponse;
import com.huaweicloud.sdk.cfw.v1.model.BatchDeleteDomainSetRequest;
import com.huaweicloud.sdk.cfw.v1.model.BatchDeleteDomainSetResponse;
import com.huaweicloud.sdk.cfw.v1.model.BatchDeleteIpsWhitelistRequest;
import com.huaweicloud.sdk.cfw.v1.model.BatchDeleteIpsWhitelistResponse;
import com.huaweicloud.sdk.cfw.v1.model.BatchDeletePrivateNetworkSegmentsRequest;
import com.huaweicloud.sdk.cfw.v1.model.BatchDeletePrivateNetworkSegmentsResponse;
import com.huaweicloud.sdk.cfw.v1.model.BatchDeleteSchedulesRequest;
import com.huaweicloud.sdk.cfw.v1.model.BatchDeleteSchedulesResponse;
import com.huaweicloud.sdk.cfw.v1.model.BatchDeleteServiceItemsRequest;
import com.huaweicloud.sdk.cfw.v1.model.BatchDeleteServiceItemsResponse;
import com.huaweicloud.sdk.cfw.v1.model.BatchDeleteServiceSetsRequest;
import com.huaweicloud.sdk.cfw.v1.model.BatchDeleteServiceSetsResponse;
import com.huaweicloud.sdk.cfw.v1.model.BatchRemoveAccountsRequest;
import com.huaweicloud.sdk.cfw.v1.model.BatchRemoveAccountsResponse;
import com.huaweicloud.sdk.cfw.v1.model.BatchUpdateAclRuleActionsRequest;
import com.huaweicloud.sdk.cfw.v1.model.BatchUpdateAclRuleActionsResponse;
import com.huaweicloud.sdk.cfw.v1.model.BatchUpdateCustomerIpsActionRequest;
import com.huaweicloud.sdk.cfw.v1.model.BatchUpdateCustomerIpsActionResponse;
import com.huaweicloud.sdk.cfw.v1.model.CancelCaptureTaskRequest;
import com.huaweicloud.sdk.cfw.v1.model.CancelCaptureTaskResponse;
import com.huaweicloud.sdk.cfw.v1.model.ChangeEastWestFirewallStatusRequest;
import com.huaweicloud.sdk.cfw.v1.model.ChangeEastWestFirewallStatusResponse;
import com.huaweicloud.sdk.cfw.v1.model.ChangeEipStatusRequest;
import com.huaweicloud.sdk.cfw.v1.model.ChangeEipStatusResponse;
import com.huaweicloud.sdk.cfw.v1.model.ChangeIpsProtectModeRequest;
import com.huaweicloud.sdk.cfw.v1.model.ChangeIpsProtectModeResponse;
import com.huaweicloud.sdk.cfw.v1.model.ChangeIpsRuleModeRequest;
import com.huaweicloud.sdk.cfw.v1.model.ChangeIpsRuleModeResponse;
import com.huaweicloud.sdk.cfw.v1.model.ChangeIpsSwitchStatusRequest;
import com.huaweicloud.sdk.cfw.v1.model.ChangeIpsSwitchStatusResponse;
import com.huaweicloud.sdk.cfw.v1.model.CreateCaptureTaskRequest;
import com.huaweicloud.sdk.cfw.v1.model.CreateCaptureTaskResponse;
import com.huaweicloud.sdk.cfw.v1.model.CreateCustomerIpsRequest;
import com.huaweicloud.sdk.cfw.v1.model.CreateCustomerIpsResponse;
import com.huaweicloud.sdk.cfw.v1.model.CreateEastWestFirewallRequest;
import com.huaweicloud.sdk.cfw.v1.model.CreateEastWestFirewallResponse;
import com.huaweicloud.sdk.cfw.v1.model.CreateFirewallRequest;
import com.huaweicloud.sdk.cfw.v1.model.CreateFirewallResponse;
import com.huaweicloud.sdk.cfw.v1.model.CreateReportProfileRequest;
import com.huaweicloud.sdk.cfw.v1.model.CreateReportProfileResponse;
import com.huaweicloud.sdk.cfw.v1.model.CreateScheduleRequest;
import com.huaweicloud.sdk.cfw.v1.model.CreateScheduleResponse;
import com.huaweicloud.sdk.cfw.v1.model.CreateTagRequest;
import com.huaweicloud.sdk.cfw.v1.model.CreateTagResponse;
import com.huaweicloud.sdk.cfw.v1.model.DeleteAclRuleHitCountRequest;
import com.huaweicloud.sdk.cfw.v1.model.DeleteAclRuleHitCountResponse;
import com.huaweicloud.sdk.cfw.v1.model.DeleteAclRuleRequest;
import com.huaweicloud.sdk.cfw.v1.model.DeleteAclRuleResponse;
import com.huaweicloud.sdk.cfw.v1.model.DeleteAddressItemRequest;
import com.huaweicloud.sdk.cfw.v1.model.DeleteAddressItemResponse;
import com.huaweicloud.sdk.cfw.v1.model.DeleteAddressSetRequest;
import com.huaweicloud.sdk.cfw.v1.model.DeleteAddressSetResponse;
import com.huaweicloud.sdk.cfw.v1.model.DeleteBlackWhiteListRequest;
import com.huaweicloud.sdk.cfw.v1.model.DeleteBlackWhiteListResponse;
import com.huaweicloud.sdk.cfw.v1.model.DeleteCaptureTaskRequest;
import com.huaweicloud.sdk.cfw.v1.model.DeleteCaptureTaskResponse;
import com.huaweicloud.sdk.cfw.v1.model.DeleteDomainSetRequest;
import com.huaweicloud.sdk.cfw.v1.model.DeleteDomainSetResponse;
import com.huaweicloud.sdk.cfw.v1.model.DeleteDomainsRequest;
import com.huaweicloud.sdk.cfw.v1.model.DeleteDomainsResponse;
import com.huaweicloud.sdk.cfw.v1.model.DeleteFirewallRequest;
import com.huaweicloud.sdk.cfw.v1.model.DeleteFirewallResponse;
import com.huaweicloud.sdk.cfw.v1.model.DeleteIpBlacklistRequest;
import com.huaweicloud.sdk.cfw.v1.model.DeleteIpBlacklistResponse;
import com.huaweicloud.sdk.cfw.v1.model.DeleteReportProfileRequest;
import com.huaweicloud.sdk.cfw.v1.model.DeleteReportProfileResponse;
import com.huaweicloud.sdk.cfw.v1.model.DeleteScheduleRequest;
import com.huaweicloud.sdk.cfw.v1.model.DeleteScheduleResponse;
import com.huaweicloud.sdk.cfw.v1.model.DeleteServiceItemRequest;
import com.huaweicloud.sdk.cfw.v1.model.DeleteServiceItemResponse;
import com.huaweicloud.sdk.cfw.v1.model.DeleteServiceSetRequest;
import com.huaweicloud.sdk.cfw.v1.model.DeleteServiceSetResponse;
import com.huaweicloud.sdk.cfw.v1.model.DeleteTagRequest;
import com.huaweicloud.sdk.cfw.v1.model.DeleteTagResponse;
import com.huaweicloud.sdk.cfw.v1.model.DownloadExportResultRequest;
import com.huaweicloud.sdk.cfw.v1.model.DownloadExportResultResponse;
import com.huaweicloud.sdk.cfw.v1.model.DownloadImportResultRequest;
import com.huaweicloud.sdk.cfw.v1.model.DownloadImportResultResponse;
import com.huaweicloud.sdk.cfw.v1.model.DownloadImportTemplateRequest;
import com.huaweicloud.sdk.cfw.v1.model.DownloadImportTemplateResponse;
import com.huaweicloud.sdk.cfw.v1.model.EnableIpBlacklistRequest;
import com.huaweicloud.sdk.cfw.v1.model.EnableIpBlacklistResponse;
import com.huaweicloud.sdk.cfw.v1.model.EnableMultiAccountRequest;
import com.huaweicloud.sdk.cfw.v1.model.EnableMultiAccountResponse;
import com.huaweicloud.sdk.cfw.v1.model.ExportIpBlacklistRequest;
import com.huaweicloud.sdk.cfw.v1.model.ExportIpBlacklistResponse;
import com.huaweicloud.sdk.cfw.v1.model.ExportLogsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ExportLogsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ExportRuleAclRequest;
import com.huaweicloud.sdk.cfw.v1.model.ExportRuleAclResponse;
import com.huaweicloud.sdk.cfw.v1.model.ImportIpBlacklistRequest;
import com.huaweicloud.sdk.cfw.v1.model.ImportIpBlacklistResponse;
import com.huaweicloud.sdk.cfw.v1.model.ImportRuleAclRequest;
import com.huaweicloud.sdk.cfw.v1.model.ImportRuleAclResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListAccessControlLogsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListAccessControlLogsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListAccountsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListAccountsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListAclRuleHitCountRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListAclRuleHitCountResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListAclRuleHitStatusRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListAclRuleHitStatusResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListAclRulesRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListAclRulesResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListAddressItemsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListAddressItemsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListAddressSetDetailRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListAddressSetDetailResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListAddressSetsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListAddressSetsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListAdvancedIpsRulesRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListAdvancedIpsRulesResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListAlarmWhitelistRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListAlarmWhitelistResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListAttackLogsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListAttackLogsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListAttackStatisticRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListAttackStatisticResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListBlackWhiteListsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListBlackWhiteListsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListCaptureResultRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListCaptureResultResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListCaptureTaskRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListCaptureTaskResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListCustomerIpsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListCustomerIpsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListDnsServersRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListDnsServersResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListDomainParseDetailRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListDomainParseDetailResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListDomainParseIpRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListDomainParseIpResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListDomainResolveIpRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListDomainResolveIpResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListDomainSetsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListDomainSetsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListDomainsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListDomainsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListEastWestFirewallRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListEastWestFirewallResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListEipCountRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListEipCountResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListEipsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListEipsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListFirewallDetailRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListFirewallDetailResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListFirewallListRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListFirewallListResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListFlowLogsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListFlowLogsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListFlowStatisticRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListFlowStatisticResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListIpBlacklistRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListIpBlacklistResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListIpBlacklistSwitchRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListIpBlacklistSwitchResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListIpsProtectModeRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListIpsProtectModeResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListIpsRulesRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListIpsRulesResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListIpsSwitchStatusRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListIpsSwitchStatusResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListIpsWhitelistsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListIpsWhitelistsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListJobRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListJobResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListLogConfigRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListLogConfigResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListLogsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListLogsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListOrganizationAccountsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListOrganizationAccountsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListOrganizationTreeRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListOrganizationTreeResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListPrivateNetworkSegmentsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListPrivateNetworkSegmentsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListProjectTagsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListProjectTagsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListProtectedVpcsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListProtectedVpcsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListRegionsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListRegionsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListReportHistoryRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListReportHistoryResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListReportProfilesRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListReportProfilesResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListResourceTagsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListResourceTagsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListRuleAclTagsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListRuleAclTagsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListSchedulesRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListSchedulesResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListServiceItemsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListServiceItemsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListServiceSetDetailRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListServiceSetDetailResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListServiceSetsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListServiceSetsResponse;
import com.huaweicloud.sdk.cfw.v1.model.RetryIpBlacklistRequest;
import com.huaweicloud.sdk.cfw.v1.model.RetryIpBlacklistResponse;
import com.huaweicloud.sdk.cfw.v1.model.SaveTagsRequest;
import com.huaweicloud.sdk.cfw.v1.model.SaveTagsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowAccessDetailRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowAccessDetailResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowAccessTopRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowAccessTopResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowAlarmConfigRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowAlarmConfigResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowAntiVirusRuleRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowAntiVirusRuleResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowAntiVirusSwitchRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowAntiVirusSwitchResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowAttackDetailRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowAttackDetailResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowAttackTopRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowAttackTopResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowAttackTotalRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowAttackTotalResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowAttackTrendRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowAttackTrendResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowAutoProtectStatusRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowAutoProtectStatusResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowConfigQuotaRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowConfigQuotaResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowCustomerIpsInfoRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowCustomerIpsInfoResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowDomainSetDetailRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowDomainSetDetailResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowEwAssociatedErRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowEwAssociatedErResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowEwAssociatedVpcRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowEwAssociatedVpcResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowExportStatusRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowExportStatusResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowFirewallReportRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowFirewallReportResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowFlowDetailRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowFlowDetailResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowFlowTopRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowFlowTopResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowFlowTrendRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowFlowTrendResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowImportStatusRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowImportStatusResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowIpsUpdateTimeRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowIpsUpdateTimeResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowLogsCountRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowLogsCountResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowReportProfileRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowReportProfileResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowSnFirewallProtectionStatusRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowSnFirewallProtectionStatusResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowTrafficTrendRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowTrafficTrendResponse;
import com.huaweicloud.sdk.cfw.v1.model.SwitchAutoProtectStatusRequest;
import com.huaweicloud.sdk.cfw.v1.model.SwitchAutoProtectStatusResponse;
import com.huaweicloud.sdk.cfw.v1.model.SwitchFirewallEipProtectionRequest;
import com.huaweicloud.sdk.cfw.v1.model.SwitchFirewallEipProtectionResponse;
import com.huaweicloud.sdk.cfw.v1.model.UpdateAclRuleOrderRequest;
import com.huaweicloud.sdk.cfw.v1.model.UpdateAclRuleOrderResponse;
import com.huaweicloud.sdk.cfw.v1.model.UpdateAclRuleRequest;
import com.huaweicloud.sdk.cfw.v1.model.UpdateAclRuleResponse;
import com.huaweicloud.sdk.cfw.v1.model.UpdateAddressSetRequest;
import com.huaweicloud.sdk.cfw.v1.model.UpdateAddressSetResponse;
import com.huaweicloud.sdk.cfw.v1.model.UpdateAdvancedIpsRuleRequest;
import com.huaweicloud.sdk.cfw.v1.model.UpdateAdvancedIpsRuleResponse;
import com.huaweicloud.sdk.cfw.v1.model.UpdateAlarmConfigRequest;
import com.huaweicloud.sdk.cfw.v1.model.UpdateAlarmConfigResponse;
import com.huaweicloud.sdk.cfw.v1.model.UpdateAntiVirusRuleRequest;
import com.huaweicloud.sdk.cfw.v1.model.UpdateAntiVirusRuleResponse;
import com.huaweicloud.sdk.cfw.v1.model.UpdateAntiVirusSwitchRequest;
import com.huaweicloud.sdk.cfw.v1.model.UpdateAntiVirusSwitchResponse;
import com.huaweicloud.sdk.cfw.v1.model.UpdateBlackWhiteListRequest;
import com.huaweicloud.sdk.cfw.v1.model.UpdateBlackWhiteListResponse;
import com.huaweicloud.sdk.cfw.v1.model.UpdateCustomerIpsRequest;
import com.huaweicloud.sdk.cfw.v1.model.UpdateCustomerIpsResponse;
import com.huaweicloud.sdk.cfw.v1.model.UpdateDnsServersRequest;
import com.huaweicloud.sdk.cfw.v1.model.UpdateDnsServersResponse;
import com.huaweicloud.sdk.cfw.v1.model.UpdateDomainSetRequest;
import com.huaweicloud.sdk.cfw.v1.model.UpdateDomainSetResponse;
import com.huaweicloud.sdk.cfw.v1.model.UpdateFirewallNameRequest;
import com.huaweicloud.sdk.cfw.v1.model.UpdateFirewallNameResponse;
import com.huaweicloud.sdk.cfw.v1.model.UpdateIpsWhitelistRequest;
import com.huaweicloud.sdk.cfw.v1.model.UpdateIpsWhitelistResponse;
import com.huaweicloud.sdk.cfw.v1.model.UpdateLogConfigRequest;
import com.huaweicloud.sdk.cfw.v1.model.UpdateLogConfigResponse;
import com.huaweicloud.sdk.cfw.v1.model.UpdateObjectConfigDescRequest;
import com.huaweicloud.sdk.cfw.v1.model.UpdateObjectConfigDescResponse;
import com.huaweicloud.sdk.cfw.v1.model.UpdatePrivateNetworkSegmentRequest;
import com.huaweicloud.sdk.cfw.v1.model.UpdatePrivateNetworkSegmentResponse;
import com.huaweicloud.sdk.cfw.v1.model.UpdateReportProfileRequest;
import com.huaweicloud.sdk.cfw.v1.model.UpdateReportProfileResponse;
import com.huaweicloud.sdk.cfw.v1.model.UpdateScheduleRequest;
import com.huaweicloud.sdk.cfw.v1.model.UpdateScheduleResponse;
import com.huaweicloud.sdk.cfw.v1.model.UpdateServiceSetRequest;
import com.huaweicloud.sdk.cfw.v1.model.UpdateServiceSetResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CfwAsyncClient {

    protected HcClient hcClient;

    public CfwAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CfwAsyncClient> newBuilder() {
        ClientBuilder<CfwAsyncClient> clientBuilder = new ClientBuilder<>(CfwAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 取消抓包任务
     *
     * 取消抓包任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelCaptureTaskRequest 请求对象
     * @return CompletableFuture<CancelCaptureTaskResponse>
     */
    public CompletableFuture<CancelCaptureTaskResponse> cancelCaptureTaskAsync(CancelCaptureTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.cancelCaptureTask);
    }

    /**
     * 取消抓包任务
     *
     * 取消抓包任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelCaptureTaskRequest 请求对象
     * @return AsyncInvoker<CancelCaptureTaskRequest, CancelCaptureTaskResponse>
     */
    public AsyncInvoker<CancelCaptureTaskRequest, CancelCaptureTaskResponse> cancelCaptureTaskAsyncInvoker(
        CancelCaptureTaskRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.cancelCaptureTask, hcClient);
    }

    /**
     * 创建抓包任务
     *
     * 创建抓包任务，每个任务只能执行一次。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCaptureTaskRequest 请求对象
     * @return CompletableFuture<CreateCaptureTaskResponse>
     */
    public CompletableFuture<CreateCaptureTaskResponse> createCaptureTaskAsync(CreateCaptureTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.createCaptureTask);
    }

    /**
     * 创建抓包任务
     *
     * 创建抓包任务，每个任务只能执行一次。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCaptureTaskRequest 请求对象
     * @return AsyncInvoker<CreateCaptureTaskRequest, CreateCaptureTaskResponse>
     */
    public AsyncInvoker<CreateCaptureTaskRequest, CreateCaptureTaskResponse> createCaptureTaskAsyncInvoker(
        CreateCaptureTaskRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.createCaptureTask, hcClient);
    }

    /**
     * 批量删除抓包任务
     *
     * 批量删除抓包任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCaptureTaskRequest 请求对象
     * @return CompletableFuture<DeleteCaptureTaskResponse>
     */
    public CompletableFuture<DeleteCaptureTaskResponse> deleteCaptureTaskAsync(DeleteCaptureTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.deleteCaptureTask);
    }

    /**
     * 批量删除抓包任务
     *
     * 批量删除抓包任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCaptureTaskRequest 请求对象
     * @return AsyncInvoker<DeleteCaptureTaskRequest, DeleteCaptureTaskResponse>
     */
    public AsyncInvoker<DeleteCaptureTaskRequest, DeleteCaptureTaskResponse> deleteCaptureTaskAsyncInvoker(
        DeleteCaptureTaskRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.deleteCaptureTask, hcClient);
    }

    /**
     * 删除已经导入的IP黑名单
     *
     * 删除流量过滤功能下已经导入的IP黑名单，指定生效范围进行删除。 标准版的墙只会存在生效范围为EIP的IP黑名单，专业版的墙会存在生效范围为EIP和NAT的IP黑名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIpBlacklistRequest 请求对象
     * @return CompletableFuture<DeleteIpBlacklistResponse>
     */
    public CompletableFuture<DeleteIpBlacklistResponse> deleteIpBlacklistAsync(DeleteIpBlacklistRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.deleteIpBlacklist);
    }

    /**
     * 删除已经导入的IP黑名单
     *
     * 删除流量过滤功能下已经导入的IP黑名单，指定生效范围进行删除。 标准版的墙只会存在生效范围为EIP的IP黑名单，专业版的墙会存在生效范围为EIP和NAT的IP黑名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIpBlacklistRequest 请求对象
     * @return AsyncInvoker<DeleteIpBlacklistRequest, DeleteIpBlacklistResponse>
     */
    public AsyncInvoker<DeleteIpBlacklistRequest, DeleteIpBlacklistResponse> deleteIpBlacklistAsyncInvoker(
        DeleteIpBlacklistRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.deleteIpBlacklist, hcClient);
    }

    /**
     * 开启或者关闭流量过滤的IP黑名单功能
     *
     * 开启或者关闭流量过滤功能，当前流量过滤是通过导入IP黑名单实现的。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableIpBlacklistRequest 请求对象
     * @return CompletableFuture<EnableIpBlacklistResponse>
     */
    public CompletableFuture<EnableIpBlacklistResponse> enableIpBlacklistAsync(EnableIpBlacklistRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.enableIpBlacklist);
    }

    /**
     * 开启或者关闭流量过滤的IP黑名单功能
     *
     * 开启或者关闭流量过滤功能，当前流量过滤是通过导入IP黑名单实现的。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableIpBlacklistRequest 请求对象
     * @return AsyncInvoker<EnableIpBlacklistRequest, EnableIpBlacklistResponse>
     */
    public AsyncInvoker<EnableIpBlacklistRequest, EnableIpBlacklistResponse> enableIpBlacklistAsyncInvoker(
        EnableIpBlacklistRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.enableIpBlacklist, hcClient);
    }

    /**
     * 导出用于流量过滤的IP黑名单
     *
     * 指定IP黑名单的名字进行导出，当前只有两种文件名，在EIP生效的文件名为ip-blacklist-eip.txt，在 NAT生效的文件名为ip-blacklist-nat.txt。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportIpBlacklistRequest 请求对象
     * @return CompletableFuture<ExportIpBlacklistResponse>
     */
    public CompletableFuture<ExportIpBlacklistResponse> exportIpBlacklistAsync(ExportIpBlacklistRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.exportIpBlacklist);
    }

    /**
     * 导出用于流量过滤的IP黑名单
     *
     * 指定IP黑名单的名字进行导出，当前只有两种文件名，在EIP生效的文件名为ip-blacklist-eip.txt，在 NAT生效的文件名为ip-blacklist-nat.txt。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportIpBlacklistRequest 请求对象
     * @return AsyncInvoker<ExportIpBlacklistRequest, ExportIpBlacklistResponse>
     */
    public AsyncInvoker<ExportIpBlacklistRequest, ExportIpBlacklistResponse> exportIpBlacklistAsyncInvoker(
        ExportIpBlacklistRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.exportIpBlacklist, hcClient);
    }

    /**
     * 导入IP黑名单用于流量过滤
     *
     * 此接口用来导入IP黑名单，IP列表保存在request的body中，IP列表支持的格式如下：
     * 单个IP地址，例如：100.1.1.10
     * 连续的IP地址段，例如：80.1.1.3-80.1.1.30
     * 掩码格式的网段，例如：6.6.6.0/24
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportIpBlacklistRequest 请求对象
     * @return CompletableFuture<ImportIpBlacklistResponse>
     */
    public CompletableFuture<ImportIpBlacklistResponse> importIpBlacklistAsync(ImportIpBlacklistRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.importIpBlacklist);
    }

    /**
     * 导入IP黑名单用于流量过滤
     *
     * 此接口用来导入IP黑名单，IP列表保存在request的body中，IP列表支持的格式如下：
     * 单个IP地址，例如：100.1.1.10
     * 连续的IP地址段，例如：80.1.1.3-80.1.1.30
     * 掩码格式的网段，例如：6.6.6.0/24
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportIpBlacklistRequest 请求对象
     * @return AsyncInvoker<ImportIpBlacklistRequest, ImportIpBlacklistResponse>
     */
    public AsyncInvoker<ImportIpBlacklistRequest, ImportIpBlacklistResponse> importIpBlacklistAsyncInvoker(
        ImportIpBlacklistRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.importIpBlacklist, hcClient);
    }

    /**
     * 获取抓包任务结果
     *
     * 获取抓包任务结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCaptureResultRequest 请求对象
     * @return CompletableFuture<ListCaptureResultResponse>
     */
    public CompletableFuture<ListCaptureResultResponse> listCaptureResultAsync(ListCaptureResultRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listCaptureResult);
    }

    /**
     * 获取抓包任务结果
     *
     * 获取抓包任务结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCaptureResultRequest 请求对象
     * @return AsyncInvoker<ListCaptureResultRequest, ListCaptureResultResponse>
     */
    public AsyncInvoker<ListCaptureResultRequest, ListCaptureResultResponse> listCaptureResultAsyncInvoker(
        ListCaptureResultRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listCaptureResult, hcClient);
    }

    /**
     * 查询抓包任务
     *
     * 查询抓包任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCaptureTaskRequest 请求对象
     * @return CompletableFuture<ListCaptureTaskResponse>
     */
    public CompletableFuture<ListCaptureTaskResponse> listCaptureTaskAsync(ListCaptureTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listCaptureTask);
    }

    /**
     * 查询抓包任务
     *
     * 查询抓包任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCaptureTaskRequest 请求对象
     * @return AsyncInvoker<ListCaptureTaskRequest, ListCaptureTaskResponse>
     */
    public AsyncInvoker<ListCaptureTaskRequest, ListCaptureTaskResponse> listCaptureTaskAsyncInvoker(
        ListCaptureTaskRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listCaptureTask, hcClient);
    }

    /**
     * 获取导入的IP黑名单列表信息
     *
     * 获取防火墙实例中已经导入的IP黑名单信息，标准版防火墙只会显示一条EIP的记录，专业版防火墙可能显示EIP、NAT或EIP和NAT的记录，根据导入的情况确定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpBlacklistRequest 请求对象
     * @return CompletableFuture<ListIpBlacklistResponse>
     */
    public CompletableFuture<ListIpBlacklistResponse> listIpBlacklistAsync(ListIpBlacklistRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listIpBlacklist);
    }

    /**
     * 获取导入的IP黑名单列表信息
     *
     * 获取防火墙实例中已经导入的IP黑名单信息，标准版防火墙只会显示一条EIP的记录，专业版防火墙可能显示EIP、NAT或EIP和NAT的记录，根据导入的情况确定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpBlacklistRequest 请求对象
     * @return AsyncInvoker<ListIpBlacklistRequest, ListIpBlacklistResponse>
     */
    public AsyncInvoker<ListIpBlacklistRequest, ListIpBlacklistResponse> listIpBlacklistAsyncInvoker(
        ListIpBlacklistRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listIpBlacklist, hcClient);
    }

    /**
     * 获取流量过滤功能的开关信息
     *
     * 流量过滤功能可以打开或者关闭，通过此接口可以获取当前的开关信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpBlacklistSwitchRequest 请求对象
     * @return CompletableFuture<ListIpBlacklistSwitchResponse>
     */
    public CompletableFuture<ListIpBlacklistSwitchResponse> listIpBlacklistSwitchAsync(
        ListIpBlacklistSwitchRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listIpBlacklistSwitch);
    }

    /**
     * 获取流量过滤功能的开关信息
     *
     * 流量过滤功能可以打开或者关闭，通过此接口可以获取当前的开关信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpBlacklistSwitchRequest 请求对象
     * @return AsyncInvoker<ListIpBlacklistSwitchRequest, ListIpBlacklistSwitchResponse>
     */
    public AsyncInvoker<ListIpBlacklistSwitchRequest, ListIpBlacklistSwitchResponse> listIpBlacklistSwitchAsyncInvoker(
        ListIpBlacklistSwitchRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listIpBlacklistSwitch, hcClient);
    }

    /**
     * 查询标签信息
     *
     * 查询标签信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return CompletableFuture<ListProjectTagsResponse>
     */
    public CompletableFuture<ListProjectTagsResponse> listProjectTagsAsync(ListProjectTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listProjectTags);
    }

    /**
     * 查询标签信息
     *
     * 查询标签信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>
     */
    public AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsAsyncInvoker(
        ListProjectTagsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listProjectTags, hcClient);
    }

    /**
     * 查询资源标签信息
     *
     * 查询资源标签信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceTagsRequest 请求对象
     * @return CompletableFuture<ListResourceTagsResponse>
     */
    public CompletableFuture<ListResourceTagsResponse> listResourceTagsAsync(ListResourceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listResourceTags);
    }

    /**
     * 查询资源标签信息
     *
     * 查询资源标签信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceTagsRequest 请求对象
     * @return AsyncInvoker<ListResourceTagsRequest, ListResourceTagsResponse>
     */
    public AsyncInvoker<ListResourceTagsRequest, ListResourceTagsResponse> listResourceTagsAsyncInvoker(
        ListResourceTagsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listResourceTags, hcClient);
    }

    /**
     * 用于流量过滤的IP黑名单导入失败后进行重新导入
     *
     * 用于流量过滤的IP黑名单导入失败后，调用此接口进行重试。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryIpBlacklistRequest 请求对象
     * @return CompletableFuture<RetryIpBlacklistResponse>
     */
    public CompletableFuture<RetryIpBlacklistResponse> retryIpBlacklistAsync(RetryIpBlacklistRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.retryIpBlacklist);
    }

    /**
     * 用于流量过滤的IP黑名单导入失败后进行重新导入
     *
     * 用于流量过滤的IP黑名单导入失败后，调用此接口进行重试。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryIpBlacklistRequest 请求对象
     * @return AsyncInvoker<RetryIpBlacklistRequest, RetryIpBlacklistResponse>
     */
    public AsyncInvoker<RetryIpBlacklistRequest, RetryIpBlacklistResponse> retryIpBlacklistAsyncInvoker(
        RetryIpBlacklistRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.retryIpBlacklist, hcClient);
    }

    /**
     * 保存资源标签接口
     *
     * 保存资源标签接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveTagsRequest 请求对象
     * @return CompletableFuture<SaveTagsResponse>
     */
    public CompletableFuture<SaveTagsResponse> saveTagsAsync(SaveTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.saveTags);
    }

    /**
     * 保存资源标签接口
     *
     * 保存资源标签接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveTagsRequest 请求对象
     * @return AsyncInvoker<SaveTagsRequest, SaveTagsResponse>
     */
    public AsyncInvoker<SaveTagsRequest, SaveTagsResponse> saveTagsAsyncInvoker(SaveTagsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.saveTags, hcClient);
    }

    /**
     * 获取告警配置信息
     *
     * 获取告警配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlarmConfigRequest 请求对象
     * @return CompletableFuture<ShowAlarmConfigResponse>
     */
    public CompletableFuture<ShowAlarmConfigResponse> showAlarmConfigAsync(ShowAlarmConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.showAlarmConfig);
    }

    /**
     * 获取告警配置信息
     *
     * 获取告警配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlarmConfigRequest 请求对象
     * @return AsyncInvoker<ShowAlarmConfigRequest, ShowAlarmConfigResponse>
     */
    public AsyncInvoker<ShowAlarmConfigRequest, ShowAlarmConfigResponse> showAlarmConfigAsyncInvoker(
        ShowAlarmConfigRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.showAlarmConfig, hcClient);
    }

    /**
     * 获取防火墙反病毒规则信息
     *
     * 获取防火墙反病毒规则信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAntiVirusRuleRequest 请求对象
     * @return CompletableFuture<ShowAntiVirusRuleResponse>
     */
    public CompletableFuture<ShowAntiVirusRuleResponse> showAntiVirusRuleAsync(ShowAntiVirusRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.showAntiVirusRule);
    }

    /**
     * 获取防火墙反病毒规则信息
     *
     * 获取防火墙反病毒规则信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAntiVirusRuleRequest 请求对象
     * @return AsyncInvoker<ShowAntiVirusRuleRequest, ShowAntiVirusRuleResponse>
     */
    public AsyncInvoker<ShowAntiVirusRuleRequest, ShowAntiVirusRuleResponse> showAntiVirusRuleAsyncInvoker(
        ShowAntiVirusRuleRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.showAntiVirusRule, hcClient);
    }

    /**
     * 查看反病毒开关
     *
     * 查看反病毒开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAntiVirusSwitchRequest 请求对象
     * @return CompletableFuture<ShowAntiVirusSwitchResponse>
     */
    public CompletableFuture<ShowAntiVirusSwitchResponse> showAntiVirusSwitchAsync(ShowAntiVirusSwitchRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.showAntiVirusSwitch);
    }

    /**
     * 查看反病毒开关
     *
     * 查看反病毒开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAntiVirusSwitchRequest 请求对象
     * @return AsyncInvoker<ShowAntiVirusSwitchRequest, ShowAntiVirusSwitchResponse>
     */
    public AsyncInvoker<ShowAntiVirusSwitchRequest, ShowAntiVirusSwitchResponse> showAntiVirusSwitchAsyncInvoker(
        ShowAntiVirusSwitchRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.showAntiVirusSwitch, hcClient);
    }

    /**
     * 修改告警配置接口
     *
     * 修改告警配置接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlarmConfigRequest 请求对象
     * @return CompletableFuture<UpdateAlarmConfigResponse>
     */
    public CompletableFuture<UpdateAlarmConfigResponse> updateAlarmConfigAsync(UpdateAlarmConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.updateAlarmConfig);
    }

    /**
     * 修改告警配置接口
     *
     * 修改告警配置接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlarmConfigRequest 请求对象
     * @return AsyncInvoker<UpdateAlarmConfigRequest, UpdateAlarmConfigResponse>
     */
    public AsyncInvoker<UpdateAlarmConfigRequest, UpdateAlarmConfigResponse> updateAlarmConfigAsyncInvoker(
        UpdateAlarmConfigRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.updateAlarmConfig, hcClient);
    }

    /**
     * 修改反病毒规则
     *
     * 修改反病毒规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAntiVirusRuleRequest 请求对象
     * @return CompletableFuture<UpdateAntiVirusRuleResponse>
     */
    public CompletableFuture<UpdateAntiVirusRuleResponse> updateAntiVirusRuleAsync(UpdateAntiVirusRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.updateAntiVirusRule);
    }

    /**
     * 修改反病毒规则
     *
     * 修改反病毒规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAntiVirusRuleRequest 请求对象
     * @return AsyncInvoker<UpdateAntiVirusRuleRequest, UpdateAntiVirusRuleResponse>
     */
    public AsyncInvoker<UpdateAntiVirusRuleRequest, UpdateAntiVirusRuleResponse> updateAntiVirusRuleAsyncInvoker(
        UpdateAntiVirusRuleRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.updateAntiVirusRule, hcClient);
    }

    /**
     * 修改反病毒开关
     *
     * 修改反病毒开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAntiVirusSwitchRequest 请求对象
     * @return CompletableFuture<UpdateAntiVirusSwitchResponse>
     */
    public CompletableFuture<UpdateAntiVirusSwitchResponse> updateAntiVirusSwitchAsync(
        UpdateAntiVirusSwitchRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.updateAntiVirusSwitch);
    }

    /**
     * 修改反病毒开关
     *
     * 修改反病毒开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAntiVirusSwitchRequest 请求对象
     * @return AsyncInvoker<UpdateAntiVirusSwitchRequest, UpdateAntiVirusSwitchResponse>
     */
    public AsyncInvoker<UpdateAntiVirusSwitchRequest, UpdateAntiVirusSwitchResponse> updateAntiVirusSwitchAsyncInvoker(
        UpdateAntiVirusSwitchRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.updateAntiVirusSwitch, hcClient);
    }

    /**
     * 创建ACL规则
     *
     * 创建ACL规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAclRuleRequest 请求对象
     * @return CompletableFuture<AddAclRuleResponse>
     */
    public CompletableFuture<AddAclRuleResponse> addAclRuleAsync(AddAclRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.addAclRule);
    }

    /**
     * 创建ACL规则
     *
     * 创建ACL规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAclRuleRequest 请求对象
     * @return AsyncInvoker<AddAclRuleRequest, AddAclRuleResponse>
     */
    public AsyncInvoker<AddAclRuleRequest, AddAclRuleResponse> addAclRuleAsyncInvoker(AddAclRuleRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.addAclRule, hcClient);
    }

    /**
     * 批量删除Acl规则
     *
     * 批量删除Acl规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAclRulesRequest 请求对象
     * @return CompletableFuture<BatchDeleteAclRulesResponse>
     */
    public CompletableFuture<BatchDeleteAclRulesResponse> batchDeleteAclRulesAsync(BatchDeleteAclRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.batchDeleteAclRules);
    }

    /**
     * 批量删除Acl规则
     *
     * 批量删除Acl规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAclRulesRequest 请求对象
     * @return AsyncInvoker<BatchDeleteAclRulesRequest, BatchDeleteAclRulesResponse>
     */
    public AsyncInvoker<BatchDeleteAclRulesRequest, BatchDeleteAclRulesResponse> batchDeleteAclRulesAsyncInvoker(
        BatchDeleteAclRulesRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.batchDeleteAclRules, hcClient);
    }

    /**
     * 批量更新规则动作
     *
     * 批量更新规则动作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateAclRuleActionsRequest 请求对象
     * @return CompletableFuture<BatchUpdateAclRuleActionsResponse>
     */
    public CompletableFuture<BatchUpdateAclRuleActionsResponse> batchUpdateAclRuleActionsAsync(
        BatchUpdateAclRuleActionsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.batchUpdateAclRuleActions);
    }

    /**
     * 批量更新规则动作
     *
     * 批量更新规则动作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateAclRuleActionsRequest 请求对象
     * @return AsyncInvoker<BatchUpdateAclRuleActionsRequest, BatchUpdateAclRuleActionsResponse>
     */
    public AsyncInvoker<BatchUpdateAclRuleActionsRequest, BatchUpdateAclRuleActionsResponse> batchUpdateAclRuleActionsAsyncInvoker(
        BatchUpdateAclRuleActionsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.batchUpdateAclRuleActions, hcClient);
    }

    /**
     * 删除ACL规则
     *
     * 删除ACL规则组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAclRuleRequest 请求对象
     * @return CompletableFuture<DeleteAclRuleResponse>
     */
    public CompletableFuture<DeleteAclRuleResponse> deleteAclRuleAsync(DeleteAclRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.deleteAclRule);
    }

    /**
     * 删除ACL规则
     *
     * 删除ACL规则组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAclRuleRequest 请求对象
     * @return AsyncInvoker<DeleteAclRuleRequest, DeleteAclRuleResponse>
     */
    public AsyncInvoker<DeleteAclRuleRequest, DeleteAclRuleResponse> deleteAclRuleAsyncInvoker(
        DeleteAclRuleRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.deleteAclRule, hcClient);
    }

    /**
     * 删除规则击中次数
     *
     * 清除规则击中次数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAclRuleHitCountRequest 请求对象
     * @return CompletableFuture<DeleteAclRuleHitCountResponse>
     */
    public CompletableFuture<DeleteAclRuleHitCountResponse> deleteAclRuleHitCountAsync(
        DeleteAclRuleHitCountRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.deleteAclRuleHitCount);
    }

    /**
     * 删除规则击中次数
     *
     * 清除规则击中次数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAclRuleHitCountRequest 请求对象
     * @return AsyncInvoker<DeleteAclRuleHitCountRequest, DeleteAclRuleHitCountResponse>
     */
    public AsyncInvoker<DeleteAclRuleHitCountRequest, DeleteAclRuleHitCountResponse> deleteAclRuleHitCountAsyncInvoker(
        DeleteAclRuleHitCountRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.deleteAclRuleHitCount, hcClient);
    }

    /**
     * 下载导出结果
     *
     * 下载导出结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadExportResultRequest 请求对象
     * @return CompletableFuture<DownloadExportResultResponse>
     */
    public CompletableFuture<DownloadExportResultResponse> downloadExportResultAsync(
        DownloadExportResultRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.downloadExportResult);
    }

    /**
     * 下载导出结果
     *
     * 下载导出结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadExportResultRequest 请求对象
     * @return AsyncInvoker<DownloadExportResultRequest, DownloadExportResultResponse>
     */
    public AsyncInvoker<DownloadExportResultRequest, DownloadExportResultResponse> downloadExportResultAsyncInvoker(
        DownloadExportResultRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.downloadExportResult, hcClient);
    }

    /**
     * 下载导入规则
     *
     * 下载导入规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadImportResultRequest 请求对象
     * @return CompletableFuture<DownloadImportResultResponse>
     */
    public CompletableFuture<DownloadImportResultResponse> downloadImportResultAsync(
        DownloadImportResultRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.downloadImportResult);
    }

    /**
     * 下载导入规则
     *
     * 下载导入规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadImportResultRequest 请求对象
     * @return AsyncInvoker<DownloadImportResultRequest, DownloadImportResultResponse>
     */
    public AsyncInvoker<DownloadImportResultRequest, DownloadImportResultResponse> downloadImportResultAsyncInvoker(
        DownloadImportResultRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.downloadImportResult, hcClient);
    }

    /**
     * 下载导入模板
     *
     * 下载导入模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadImportTemplateRequest 请求对象
     * @return CompletableFuture<DownloadImportTemplateResponse>
     */
    public CompletableFuture<DownloadImportTemplateResponse> downloadImportTemplateAsync(
        DownloadImportTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.downloadImportTemplate);
    }

    /**
     * 下载导入模板
     *
     * 下载导入模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadImportTemplateRequest 请求对象
     * @return AsyncInvoker<DownloadImportTemplateRequest, DownloadImportTemplateResponse>
     */
    public AsyncInvoker<DownloadImportTemplateRequest, DownloadImportTemplateResponse> downloadImportTemplateAsyncInvoker(
        DownloadImportTemplateRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.downloadImportTemplate, hcClient);
    }

    /**
     * 导出访问控制规则
     *
     * 导出访问控制规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportRuleAclRequest 请求对象
     * @return CompletableFuture<ExportRuleAclResponse>
     */
    public CompletableFuture<ExportRuleAclResponse> exportRuleAclAsync(ExportRuleAclRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.exportRuleAcl);
    }

    /**
     * 导出访问控制规则
     *
     * 导出访问控制规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportRuleAclRequest 请求对象
     * @return AsyncInvoker<ExportRuleAclRequest, ExportRuleAclResponse>
     */
    public AsyncInvoker<ExportRuleAclRequest, ExportRuleAclResponse> exportRuleAclAsyncInvoker(
        ExportRuleAclRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.exportRuleAcl, hcClient);
    }

    /**
     * 导入访问控制规则
     *
     * 导入访问控制规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportRuleAclRequest 请求对象
     * @return CompletableFuture<ImportRuleAclResponse>
     */
    public CompletableFuture<ImportRuleAclResponse> importRuleAclAsync(ImportRuleAclRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.importRuleAcl);
    }

    /**
     * 导入访问控制规则
     *
     * 导入访问控制规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportRuleAclRequest 请求对象
     * @return AsyncInvoker<ImportRuleAclRequest, ImportRuleAclResponse>
     */
    public AsyncInvoker<ImportRuleAclRequest, ImportRuleAclResponse> importRuleAclAsyncInvoker(
        ImportRuleAclRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.importRuleAcl, hcClient);
    }

    /**
     * 获取规则击中次数
     *
     * 获取规则击中次数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAclRuleHitCountRequest 请求对象
     * @return CompletableFuture<ListAclRuleHitCountResponse>
     */
    public CompletableFuture<ListAclRuleHitCountResponse> listAclRuleHitCountAsync(ListAclRuleHitCountRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listAclRuleHitCount);
    }

    /**
     * 获取规则击中次数
     *
     * 获取规则击中次数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAclRuleHitCountRequest 请求对象
     * @return AsyncInvoker<ListAclRuleHitCountRequest, ListAclRuleHitCountResponse>
     */
    public AsyncInvoker<ListAclRuleHitCountRequest, ListAclRuleHitCountResponse> listAclRuleHitCountAsyncInvoker(
        ListAclRuleHitCountRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listAclRuleHitCount, hcClient);
    }

    /**
     * 获取规则的命中次数和最后一次命中时间
     *
     * 获取规则的命中次数和最后一次命中时间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAclRuleHitStatusRequest 请求对象
     * @return CompletableFuture<ListAclRuleHitStatusResponse>
     */
    public CompletableFuture<ListAclRuleHitStatusResponse> listAclRuleHitStatusAsync(
        ListAclRuleHitStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listAclRuleHitStatus);
    }

    /**
     * 获取规则的命中次数和最后一次命中时间
     *
     * 获取规则的命中次数和最后一次命中时间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAclRuleHitStatusRequest 请求对象
     * @return AsyncInvoker<ListAclRuleHitStatusRequest, ListAclRuleHitStatusResponse>
     */
    public AsyncInvoker<ListAclRuleHitStatusRequest, ListAclRuleHitStatusResponse> listAclRuleHitStatusAsyncInvoker(
        ListAclRuleHitStatusRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listAclRuleHitStatus, hcClient);
    }

    /**
     * 查询防护规则
     *
     * 查询防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAclRulesRequest 请求对象
     * @return CompletableFuture<ListAclRulesResponse>
     */
    public CompletableFuture<ListAclRulesResponse> listAclRulesAsync(ListAclRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listAclRules);
    }

    /**
     * 查询防护规则
     *
     * 查询防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAclRulesRequest 请求对象
     * @return AsyncInvoker<ListAclRulesRequest, ListAclRulesResponse>
     */
    public AsyncInvoker<ListAclRulesRequest, ListAclRulesResponse> listAclRulesAsyncInvoker(
        ListAclRulesRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listAclRules, hcClient);
    }

    /**
     * 查看region列表
     *
     * 查看region列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRegionsRequest 请求对象
     * @return CompletableFuture<ListRegionsResponse>
     */
    public CompletableFuture<ListRegionsResponse> listRegionsAsync(ListRegionsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listRegions);
    }

    /**
     * 查看region列表
     *
     * 查看region列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRegionsRequest 请求对象
     * @return AsyncInvoker<ListRegionsRequest, ListRegionsResponse>
     */
    public AsyncInvoker<ListRegionsRequest, ListRegionsResponse> listRegionsAsyncInvoker(ListRegionsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listRegions, hcClient);
    }

    /**
     * 查询规则标签
     *
     * 查询规则标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRuleAclTagsRequest 请求对象
     * @return CompletableFuture<ListRuleAclTagsResponse>
     */
    public CompletableFuture<ListRuleAclTagsResponse> listRuleAclTagsAsync(ListRuleAclTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listRuleAclTags);
    }

    /**
     * 查询规则标签
     *
     * 查询规则标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRuleAclTagsRequest 请求对象
     * @return AsyncInvoker<ListRuleAclTagsRequest, ListRuleAclTagsResponse>
     */
    public AsyncInvoker<ListRuleAclTagsRequest, ListRuleAclTagsResponse> listRuleAclTagsAsyncInvoker(
        ListRuleAclTagsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listRuleAclTags, hcClient);
    }

    /**
     * 查询导出结果
     *
     * 查询导出结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowExportStatusRequest 请求对象
     * @return CompletableFuture<ShowExportStatusResponse>
     */
    public CompletableFuture<ShowExportStatusResponse> showExportStatusAsync(ShowExportStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.showExportStatus);
    }

    /**
     * 查询导出结果
     *
     * 查询导出结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowExportStatusRequest 请求对象
     * @return AsyncInvoker<ShowExportStatusRequest, ShowExportStatusResponse>
     */
    public AsyncInvoker<ShowExportStatusRequest, ShowExportStatusResponse> showExportStatusAsyncInvoker(
        ShowExportStatusRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.showExportStatus, hcClient);
    }

    /**
     * 查看导入状态接口
     *
     * 查看导入状态接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImportStatusRequest 请求对象
     * @return CompletableFuture<ShowImportStatusResponse>
     */
    public CompletableFuture<ShowImportStatusResponse> showImportStatusAsync(ShowImportStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.showImportStatus);
    }

    /**
     * 查看导入状态接口
     *
     * 查看导入状态接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImportStatusRequest 请求对象
     * @return AsyncInvoker<ShowImportStatusRequest, ShowImportStatusResponse>
     */
    public AsyncInvoker<ShowImportStatusRequest, ShowImportStatusResponse> showImportStatusAsyncInvoker(
        ShowImportStatusRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.showImportStatus, hcClient);
    }

    /**
     * 更新ACL规则
     *
     * 更新ACL规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAclRuleRequest 请求对象
     * @return CompletableFuture<UpdateAclRuleResponse>
     */
    public CompletableFuture<UpdateAclRuleResponse> updateAclRuleAsync(UpdateAclRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.updateAclRule);
    }

    /**
     * 更新ACL规则
     *
     * 更新ACL规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAclRuleRequest 请求对象
     * @return AsyncInvoker<UpdateAclRuleRequest, UpdateAclRuleResponse>
     */
    public AsyncInvoker<UpdateAclRuleRequest, UpdateAclRuleResponse> updateAclRuleAsyncInvoker(
        UpdateAclRuleRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.updateAclRule, hcClient);
    }

    /**
     * ACL防护规则优先级设置
     *
     * ACL防护规则优先级设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAclRuleOrderRequest 请求对象
     * @return CompletableFuture<UpdateAclRuleOrderResponse>
     */
    public CompletableFuture<UpdateAclRuleOrderResponse> updateAclRuleOrderAsync(UpdateAclRuleOrderRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.updateAclRuleOrder);
    }

    /**
     * ACL防护规则优先级设置
     *
     * ACL防护规则优先级设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAclRuleOrderRequest 请求对象
     * @return AsyncInvoker<UpdateAclRuleOrderRequest, UpdateAclRuleOrderResponse>
     */
    public AsyncInvoker<UpdateAclRuleOrderRequest, UpdateAclRuleOrderResponse> updateAclRuleOrderAsyncInvoker(
        UpdateAclRuleOrderRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.updateAclRuleOrder, hcClient);
    }

    /**
     * 添加地址组成员
     *
     * 添加地址组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAddressItemRequest 请求对象
     * @return CompletableFuture<AddAddressItemResponse>
     */
    public CompletableFuture<AddAddressItemResponse> addAddressItemAsync(AddAddressItemRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.addAddressItem);
    }

    /**
     * 添加地址组成员
     *
     * 添加地址组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAddressItemRequest 请求对象
     * @return AsyncInvoker<AddAddressItemRequest, AddAddressItemResponse>
     */
    public AsyncInvoker<AddAddressItemRequest, AddAddressItemResponse> addAddressItemAsyncInvoker(
        AddAddressItemRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.addAddressItem, hcClient);
    }

    /**
     * 添加地址组
     *
     * 添加地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAddressSetRequest 请求对象
     * @return CompletableFuture<AddAddressSetResponse>
     */
    public CompletableFuture<AddAddressSetResponse> addAddressSetAsync(AddAddressSetRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.addAddressSet);
    }

    /**
     * 添加地址组
     *
     * 添加地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAddressSetRequest 请求对象
     * @return AsyncInvoker<AddAddressSetRequest, AddAddressSetResponse>
     */
    public AsyncInvoker<AddAddressSetRequest, AddAddressSetResponse> addAddressSetAsyncInvoker(
        AddAddressSetRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.addAddressSet, hcClient);
    }

    /**
     * 批量删除地址组成员
     *
     * 批量删除地址组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAddressItemsRequest 请求对象
     * @return CompletableFuture<BatchDeleteAddressItemsResponse>
     */
    public CompletableFuture<BatchDeleteAddressItemsResponse> batchDeleteAddressItemsAsync(
        BatchDeleteAddressItemsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.batchDeleteAddressItems);
    }

    /**
     * 批量删除地址组成员
     *
     * 批量删除地址组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAddressItemsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteAddressItemsRequest, BatchDeleteAddressItemsResponse>
     */
    public AsyncInvoker<BatchDeleteAddressItemsRequest, BatchDeleteAddressItemsResponse> batchDeleteAddressItemsAsyncInvoker(
        BatchDeleteAddressItemsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.batchDeleteAddressItems, hcClient);
    }

    /**
     * 批量删除地址组
     *
     * 批量删除地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAddressSetsRequest 请求对象
     * @return CompletableFuture<BatchDeleteAddressSetsResponse>
     */
    public CompletableFuture<BatchDeleteAddressSetsResponse> batchDeleteAddressSetsAsync(
        BatchDeleteAddressSetsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.batchDeleteAddressSets);
    }

    /**
     * 批量删除地址组
     *
     * 批量删除地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAddressSetsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteAddressSetsRequest, BatchDeleteAddressSetsResponse>
     */
    public AsyncInvoker<BatchDeleteAddressSetsRequest, BatchDeleteAddressSetsResponse> batchDeleteAddressSetsAsyncInvoker(
        BatchDeleteAddressSetsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.batchDeleteAddressSets, hcClient);
    }

    /**
     * 删除地址组成员
     *
     * 删除地址组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAddressItemRequest 请求对象
     * @return CompletableFuture<DeleteAddressItemResponse>
     */
    public CompletableFuture<DeleteAddressItemResponse> deleteAddressItemAsync(DeleteAddressItemRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.deleteAddressItem);
    }

    /**
     * 删除地址组成员
     *
     * 删除地址组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAddressItemRequest 请求对象
     * @return AsyncInvoker<DeleteAddressItemRequest, DeleteAddressItemResponse>
     */
    public AsyncInvoker<DeleteAddressItemRequest, DeleteAddressItemResponse> deleteAddressItemAsyncInvoker(
        DeleteAddressItemRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.deleteAddressItem, hcClient);
    }

    /**
     * 删除地址组
     *
     * 删除地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAddressSetRequest 请求对象
     * @return CompletableFuture<DeleteAddressSetResponse>
     */
    public CompletableFuture<DeleteAddressSetResponse> deleteAddressSetAsync(DeleteAddressSetRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.deleteAddressSet);
    }

    /**
     * 删除地址组
     *
     * 删除地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAddressSetRequest 请求对象
     * @return AsyncInvoker<DeleteAddressSetRequest, DeleteAddressSetResponse>
     */
    public AsyncInvoker<DeleteAddressSetRequest, DeleteAddressSetResponse> deleteAddressSetAsyncInvoker(
        DeleteAddressSetRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.deleteAddressSet, hcClient);
    }

    /**
     * 查询地址组成员
     *
     * 查询地址组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAddressItemsRequest 请求对象
     * @return CompletableFuture<ListAddressItemsResponse>
     */
    public CompletableFuture<ListAddressItemsResponse> listAddressItemsAsync(ListAddressItemsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listAddressItems);
    }

    /**
     * 查询地址组成员
     *
     * 查询地址组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAddressItemsRequest 请求对象
     * @return AsyncInvoker<ListAddressItemsRequest, ListAddressItemsResponse>
     */
    public AsyncInvoker<ListAddressItemsRequest, ListAddressItemsResponse> listAddressItemsAsyncInvoker(
        ListAddressItemsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listAddressItems, hcClient);
    }

    /**
     * 查询地址组详细信息
     *
     * 查询地址组详细
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAddressSetDetailRequest 请求对象
     * @return CompletableFuture<ListAddressSetDetailResponse>
     */
    public CompletableFuture<ListAddressSetDetailResponse> listAddressSetDetailAsync(
        ListAddressSetDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listAddressSetDetail);
    }

    /**
     * 查询地址组详细信息
     *
     * 查询地址组详细
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAddressSetDetailRequest 请求对象
     * @return AsyncInvoker<ListAddressSetDetailRequest, ListAddressSetDetailResponse>
     */
    public AsyncInvoker<ListAddressSetDetailRequest, ListAddressSetDetailResponse> listAddressSetDetailAsyncInvoker(
        ListAddressSetDetailRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listAddressSetDetail, hcClient);
    }

    /**
     * 查询地址组列表
     *
     * 查询地址组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAddressSetsRequest 请求对象
     * @return CompletableFuture<ListAddressSetsResponse>
     */
    public CompletableFuture<ListAddressSetsResponse> listAddressSetsAsync(ListAddressSetsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listAddressSets);
    }

    /**
     * 查询地址组列表
     *
     * 查询地址组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAddressSetsRequest 请求对象
     * @return AsyncInvoker<ListAddressSetsRequest, ListAddressSetsResponse>
     */
    public AsyncInvoker<ListAddressSetsRequest, ListAddressSetsResponse> listAddressSetsAsyncInvoker(
        ListAddressSetsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listAddressSets, hcClient);
    }

    /**
     * 更新地址组信息
     *
     * 更新地址组信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAddressSetRequest 请求对象
     * @return CompletableFuture<UpdateAddressSetResponse>
     */
    public CompletableFuture<UpdateAddressSetResponse> updateAddressSetAsync(UpdateAddressSetRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.updateAddressSet);
    }

    /**
     * 更新地址组信息
     *
     * 更新地址组信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAddressSetRequest 请求对象
     * @return AsyncInvoker<UpdateAddressSetRequest, UpdateAddressSetResponse>
     */
    public AsyncInvoker<UpdateAddressSetRequest, UpdateAddressSetResponse> updateAddressSetAsyncInvoker(
        UpdateAddressSetRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.updateAddressSet, hcClient);
    }

    /**
     * 更新对象配置描述
     *
     * 更新对象配置描述
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateObjectConfigDescRequest 请求对象
     * @return CompletableFuture<UpdateObjectConfigDescResponse>
     */
    public CompletableFuture<UpdateObjectConfigDescResponse> updateObjectConfigDescAsync(
        UpdateObjectConfigDescRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.updateObjectConfigDesc);
    }

    /**
     * 更新对象配置描述
     *
     * 更新对象配置描述
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateObjectConfigDescRequest 请求对象
     * @return AsyncInvoker<UpdateObjectConfigDescRequest, UpdateObjectConfigDescResponse>
     */
    public AsyncInvoker<UpdateObjectConfigDescRequest, UpdateObjectConfigDescResponse> updateObjectConfigDescAsyncInvoker(
        UpdateObjectConfigDescRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.updateObjectConfigDesc, hcClient);
    }

    /**
     * 创建黑白名单规则
     *
     * 创建黑白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddBlackWhiteListRequest 请求对象
     * @return CompletableFuture<AddBlackWhiteListResponse>
     */
    public CompletableFuture<AddBlackWhiteListResponse> addBlackWhiteListAsync(AddBlackWhiteListRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.addBlackWhiteList);
    }

    /**
     * 创建黑白名单规则
     *
     * 创建黑白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddBlackWhiteListRequest 请求对象
     * @return AsyncInvoker<AddBlackWhiteListRequest, AddBlackWhiteListResponse>
     */
    public AsyncInvoker<AddBlackWhiteListRequest, AddBlackWhiteListResponse> addBlackWhiteListAsyncInvoker(
        AddBlackWhiteListRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.addBlackWhiteList, hcClient);
    }

    /**
     * 批量添加黑白名单列表
     *
     * 批量添加黑白名单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateBlackWhiteListRequest 请求对象
     * @return CompletableFuture<BatchCreateBlackWhiteListResponse>
     */
    public CompletableFuture<BatchCreateBlackWhiteListResponse> batchCreateBlackWhiteListAsync(
        BatchCreateBlackWhiteListRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.batchCreateBlackWhiteList);
    }

    /**
     * 批量添加黑白名单列表
     *
     * 批量添加黑白名单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateBlackWhiteListRequest 请求对象
     * @return AsyncInvoker<BatchCreateBlackWhiteListRequest, BatchCreateBlackWhiteListResponse>
     */
    public AsyncInvoker<BatchCreateBlackWhiteListRequest, BatchCreateBlackWhiteListResponse> batchCreateBlackWhiteListAsyncInvoker(
        BatchCreateBlackWhiteListRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.batchCreateBlackWhiteList, hcClient);
    }

    /**
     * 批量删除黑白名单列表
     *
     * 批量删除黑白名单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteBlackWhiteListsRequest 请求对象
     * @return CompletableFuture<BatchDeleteBlackWhiteListsResponse>
     */
    public CompletableFuture<BatchDeleteBlackWhiteListsResponse> batchDeleteBlackWhiteListsAsync(
        BatchDeleteBlackWhiteListsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.batchDeleteBlackWhiteLists);
    }

    /**
     * 批量删除黑白名单列表
     *
     * 批量删除黑白名单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteBlackWhiteListsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteBlackWhiteListsRequest, BatchDeleteBlackWhiteListsResponse>
     */
    public AsyncInvoker<BatchDeleteBlackWhiteListsRequest, BatchDeleteBlackWhiteListsResponse> batchDeleteBlackWhiteListsAsyncInvoker(
        BatchDeleteBlackWhiteListsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.batchDeleteBlackWhiteLists, hcClient);
    }

    /**
     * 删除黑白名单规则
     *
     * 删除黑白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBlackWhiteListRequest 请求对象
     * @return CompletableFuture<DeleteBlackWhiteListResponse>
     */
    public CompletableFuture<DeleteBlackWhiteListResponse> deleteBlackWhiteListAsync(
        DeleteBlackWhiteListRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.deleteBlackWhiteList);
    }

    /**
     * 删除黑白名单规则
     *
     * 删除黑白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBlackWhiteListRequest 请求对象
     * @return AsyncInvoker<DeleteBlackWhiteListRequest, DeleteBlackWhiteListResponse>
     */
    public AsyncInvoker<DeleteBlackWhiteListRequest, DeleteBlackWhiteListResponse> deleteBlackWhiteListAsyncInvoker(
        DeleteBlackWhiteListRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.deleteBlackWhiteList, hcClient);
    }

    /**
     * 查询黑白名单列表
     *
     * 查询黑白名单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBlackWhiteListsRequest 请求对象
     * @return CompletableFuture<ListBlackWhiteListsResponse>
     */
    public CompletableFuture<ListBlackWhiteListsResponse> listBlackWhiteListsAsync(ListBlackWhiteListsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listBlackWhiteLists);
    }

    /**
     * 查询黑白名单列表
     *
     * 查询黑白名单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBlackWhiteListsRequest 请求对象
     * @return AsyncInvoker<ListBlackWhiteListsRequest, ListBlackWhiteListsResponse>
     */
    public AsyncInvoker<ListBlackWhiteListsRequest, ListBlackWhiteListsResponse> listBlackWhiteListsAsyncInvoker(
        ListBlackWhiteListsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listBlackWhiteLists, hcClient);
    }

    /**
     * 更新黑白名单列表
     *
     * 更新黑白名单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBlackWhiteListRequest 请求对象
     * @return CompletableFuture<UpdateBlackWhiteListResponse>
     */
    public CompletableFuture<UpdateBlackWhiteListResponse> updateBlackWhiteListAsync(
        UpdateBlackWhiteListRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.updateBlackWhiteList);
    }

    /**
     * 更新黑白名单列表
     *
     * 更新黑白名单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBlackWhiteListRequest 请求对象
     * @return AsyncInvoker<UpdateBlackWhiteListRequest, UpdateBlackWhiteListResponse>
     */
    public AsyncInvoker<UpdateBlackWhiteListRequest, UpdateBlackWhiteListResponse> updateBlackWhiteListAsyncInvoker(
        UpdateBlackWhiteListRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.updateBlackWhiteList, hcClient);
    }

    /**
     * 添加指定DNS服务器
     *
     * 添加指定DNS服务器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddCustomDnsServerRequest 请求对象
     * @return CompletableFuture<AddCustomDnsServerResponse>
     */
    public CompletableFuture<AddCustomDnsServerResponse> addCustomDnsServerAsync(AddCustomDnsServerRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.addCustomDnsServer);
    }

    /**
     * 添加指定DNS服务器
     *
     * 添加指定DNS服务器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddCustomDnsServerRequest 请求对象
     * @return AsyncInvoker<AddCustomDnsServerRequest, AddCustomDnsServerResponse>
     */
    public AsyncInvoker<AddCustomDnsServerRequest, AddCustomDnsServerResponse> addCustomDnsServerAsyncInvoker(
        AddCustomDnsServerRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.addCustomDnsServer, hcClient);
    }

    /**
     * 添加域名组
     *
     * 添加域名组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDomainSetRequest 请求对象
     * @return CompletableFuture<AddDomainSetResponse>
     */
    public CompletableFuture<AddDomainSetResponse> addDomainSetAsync(AddDomainSetRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.addDomainSet);
    }

    /**
     * 添加域名组
     *
     * 添加域名组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDomainSetRequest 请求对象
     * @return AsyncInvoker<AddDomainSetRequest, AddDomainSetResponse>
     */
    public AsyncInvoker<AddDomainSetRequest, AddDomainSetResponse> addDomainSetAsyncInvoker(
        AddDomainSetRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.addDomainSet, hcClient);
    }

    /**
     * 添加域名列表
     *
     * 添加域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDomainsRequest 请求对象
     * @return CompletableFuture<AddDomainsResponse>
     */
    public CompletableFuture<AddDomainsResponse> addDomainsAsync(AddDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.addDomains);
    }

    /**
     * 添加域名列表
     *
     * 添加域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDomainsRequest 请求对象
     * @return AsyncInvoker<AddDomainsRequest, AddDomainsResponse>
     */
    public AsyncInvoker<AddDomainsRequest, AddDomainsResponse> addDomainsAsyncInvoker(AddDomainsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.addDomains, hcClient);
    }

    /**
     * 批量删除域名组
     *
     * 批量删除域名组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteDomainSetRequest 请求对象
     * @return CompletableFuture<BatchDeleteDomainSetResponse>
     */
    public CompletableFuture<BatchDeleteDomainSetResponse> batchDeleteDomainSetAsync(
        BatchDeleteDomainSetRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.batchDeleteDomainSet);
    }

    /**
     * 批量删除域名组
     *
     * 批量删除域名组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteDomainSetRequest 请求对象
     * @return AsyncInvoker<BatchDeleteDomainSetRequest, BatchDeleteDomainSetResponse>
     */
    public AsyncInvoker<BatchDeleteDomainSetRequest, BatchDeleteDomainSetResponse> batchDeleteDomainSetAsyncInvoker(
        BatchDeleteDomainSetRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.batchDeleteDomainSet, hcClient);
    }

    /**
     * 删除域名组
     *
     * 删除域名组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDomainSetRequest 请求对象
     * @return CompletableFuture<DeleteDomainSetResponse>
     */
    public CompletableFuture<DeleteDomainSetResponse> deleteDomainSetAsync(DeleteDomainSetRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.deleteDomainSet);
    }

    /**
     * 删除域名组
     *
     * 删除域名组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDomainSetRequest 请求对象
     * @return AsyncInvoker<DeleteDomainSetRequest, DeleteDomainSetResponse>
     */
    public AsyncInvoker<DeleteDomainSetRequest, DeleteDomainSetResponse> deleteDomainSetAsyncInvoker(
        DeleteDomainSetRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.deleteDomainSet, hcClient);
    }

    /**
     * 删除域名列表
     *
     * 删除域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDomainsRequest 请求对象
     * @return CompletableFuture<DeleteDomainsResponse>
     */
    public CompletableFuture<DeleteDomainsResponse> deleteDomainsAsync(DeleteDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.deleteDomains);
    }

    /**
     * 删除域名列表
     *
     * 删除域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDomainsRequest 请求对象
     * @return AsyncInvoker<DeleteDomainsRequest, DeleteDomainsResponse>
     */
    public AsyncInvoker<DeleteDomainsRequest, DeleteDomainsResponse> deleteDomainsAsyncInvoker(
        DeleteDomainsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.deleteDomains, hcClient);
    }

    /**
     * 查询DNS服务器列表
     *
     * 查询DNS服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDnsServersRequest 请求对象
     * @return CompletableFuture<ListDnsServersResponse>
     */
    public CompletableFuture<ListDnsServersResponse> listDnsServersAsync(ListDnsServersRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listDnsServers);
    }

    /**
     * 查询DNS服务器列表
     *
     * 查询DNS服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDnsServersRequest 请求对象
     * @return AsyncInvoker<ListDnsServersRequest, ListDnsServersResponse>
     */
    public AsyncInvoker<ListDnsServersRequest, ListDnsServersResponse> listDnsServersAsyncInvoker(
        ListDnsServersRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listDnsServers, hcClient);
    }

    /**
     * 查询域名解析IP地址
     *
     * 测试域名有效性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainParseDetailRequest 请求对象
     * @return CompletableFuture<ListDomainParseDetailResponse>
     */
    public CompletableFuture<ListDomainParseDetailResponse> listDomainParseDetailAsync(
        ListDomainParseDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listDomainParseDetail);
    }

    /**
     * 查询域名解析IP地址
     *
     * 测试域名有效性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainParseDetailRequest 请求对象
     * @return AsyncInvoker<ListDomainParseDetailRequest, ListDomainParseDetailResponse>
     */
    public AsyncInvoker<ListDomainParseDetailRequest, ListDomainParseDetailResponse> listDomainParseDetailAsyncInvoker(
        ListDomainParseDetailRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listDomainParseDetail, hcClient);
    }

    /**
     * 获取域名地址解析结果
     *
     * 获取域名地址解析结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainParseIpRequest 请求对象
     * @return CompletableFuture<ListDomainParseIpResponse>
     */
    public CompletableFuture<ListDomainParseIpResponse> listDomainParseIpAsync(ListDomainParseIpRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listDomainParseIp);
    }

    /**
     * 获取域名地址解析结果
     *
     * 获取域名地址解析结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainParseIpRequest 请求对象
     * @return AsyncInvoker<ListDomainParseIpRequest, ListDomainParseIpResponse>
     */
    public AsyncInvoker<ListDomainParseIpRequest, ListDomainParseIpResponse> listDomainParseIpAsyncInvoker(
        ListDomainParseIpRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listDomainParseIp, hcClient);
    }

    /**
     * 获取域名解析结果
     *
     * 获取域名解析结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainResolveIpRequest 请求对象
     * @return CompletableFuture<ListDomainResolveIpResponse>
     */
    public CompletableFuture<ListDomainResolveIpResponse> listDomainResolveIpAsync(ListDomainResolveIpRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listDomainResolveIp);
    }

    /**
     * 获取域名解析结果
     *
     * 获取域名解析结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainResolveIpRequest 请求对象
     * @return AsyncInvoker<ListDomainResolveIpRequest, ListDomainResolveIpResponse>
     */
    public AsyncInvoker<ListDomainResolveIpRequest, ListDomainResolveIpResponse> listDomainResolveIpAsyncInvoker(
        ListDomainResolveIpRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listDomainResolveIp, hcClient);
    }

    /**
     * 查询域名组列表
     *
     * 查询域名组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainSetsRequest 请求对象
     * @return CompletableFuture<ListDomainSetsResponse>
     */
    public CompletableFuture<ListDomainSetsResponse> listDomainSetsAsync(ListDomainSetsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listDomainSets);
    }

    /**
     * 查询域名组列表
     *
     * 查询域名组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainSetsRequest 请求对象
     * @return AsyncInvoker<ListDomainSetsRequest, ListDomainSetsResponse>
     */
    public AsyncInvoker<ListDomainSetsRequest, ListDomainSetsResponse> listDomainSetsAsyncInvoker(
        ListDomainSetsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listDomainSets, hcClient);
    }

    /**
     * 获取域名组下域名列表
     *
     * 获取域名组下域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainsRequest 请求对象
     * @return CompletableFuture<ListDomainsResponse>
     */
    public CompletableFuture<ListDomainsResponse> listDomainsAsync(ListDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listDomains);
    }

    /**
     * 获取域名组下域名列表
     *
     * 获取域名组下域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainsRequest 请求对象
     * @return AsyncInvoker<ListDomainsRequest, ListDomainsResponse>
     */
    public AsyncInvoker<ListDomainsRequest, ListDomainsResponse> listDomainsAsyncInvoker(ListDomainsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listDomains, hcClient);
    }

    /**
     * 查看域名组详情
     *
     * 查看域名组详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainSetDetailRequest 请求对象
     * @return CompletableFuture<ShowDomainSetDetailResponse>
     */
    public CompletableFuture<ShowDomainSetDetailResponse> showDomainSetDetailAsync(ShowDomainSetDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.showDomainSetDetail);
    }

    /**
     * 查看域名组详情
     *
     * 查看域名组详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainSetDetailRequest 请求对象
     * @return AsyncInvoker<ShowDomainSetDetailRequest, ShowDomainSetDetailResponse>
     */
    public AsyncInvoker<ShowDomainSetDetailRequest, ShowDomainSetDetailResponse> showDomainSetDetailAsyncInvoker(
        ShowDomainSetDetailRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.showDomainSetDetail, hcClient);
    }

    /**
     * 更新DNS服务器列表
     *
     * 更新DNS服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDnsServersRequest 请求对象
     * @return CompletableFuture<UpdateDnsServersResponse>
     */
    public CompletableFuture<UpdateDnsServersResponse> updateDnsServersAsync(UpdateDnsServersRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.updateDnsServers);
    }

    /**
     * 更新DNS服务器列表
     *
     * 更新DNS服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDnsServersRequest 请求对象
     * @return AsyncInvoker<UpdateDnsServersRequest, UpdateDnsServersResponse>
     */
    public AsyncInvoker<UpdateDnsServersRequest, UpdateDnsServersResponse> updateDnsServersAsyncInvoker(
        UpdateDnsServersRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.updateDnsServers, hcClient);
    }

    /**
     * 更新域名组
     *
     * 更新域名组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainSetRequest 请求对象
     * @return CompletableFuture<UpdateDomainSetResponse>
     */
    public CompletableFuture<UpdateDomainSetResponse> updateDomainSetAsync(UpdateDomainSetRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.updateDomainSet);
    }

    /**
     * 更新域名组
     *
     * 更新域名组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainSetRequest 请求对象
     * @return AsyncInvoker<UpdateDomainSetRequest, UpdateDomainSetResponse>
     */
    public AsyncInvoker<UpdateDomainSetRequest, UpdateDomainSetResponse> updateDomainSetAsyncInvoker(
        UpdateDomainSetRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.updateDomainSet, hcClient);
    }

    /**
     * 添加EIP告警白名单
     *
     * 添加EIP告警白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddEipAlarmWhitelistRequest 请求对象
     * @return CompletableFuture<AddEipAlarmWhitelistResponse>
     */
    public CompletableFuture<AddEipAlarmWhitelistResponse> addEipAlarmWhitelistAsync(
        AddEipAlarmWhitelistRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.addEipAlarmWhitelist);
    }

    /**
     * 添加EIP告警白名单
     *
     * 添加EIP告警白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddEipAlarmWhitelistRequest 请求对象
     * @return AsyncInvoker<AddEipAlarmWhitelistRequest, AddEipAlarmWhitelistResponse>
     */
    public AsyncInvoker<AddEipAlarmWhitelistRequest, AddEipAlarmWhitelistResponse> addEipAlarmWhitelistAsyncInvoker(
        AddEipAlarmWhitelistRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.addEipAlarmWhitelist, hcClient);
    }

    /**
     * 弹性IP开启关闭
     *
     * 开启关闭EIP，客户购买EIP后首次开启EIP防护前需使用ListEips同步EIP资产，sync字段设置为1。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeEipStatusRequest 请求对象
     * @return CompletableFuture<ChangeEipStatusResponse>
     */
    public CompletableFuture<ChangeEipStatusResponse> changeEipStatusAsync(ChangeEipStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.changeEipStatus);
    }

    /**
     * 弹性IP开启关闭
     *
     * 开启关闭EIP，客户购买EIP后首次开启EIP防护前需使用ListEips同步EIP资产，sync字段设置为1。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeEipStatusRequest 请求对象
     * @return AsyncInvoker<ChangeEipStatusRequest, ChangeEipStatusResponse>
     */
    public AsyncInvoker<ChangeEipStatusRequest, ChangeEipStatusResponse> changeEipStatusAsyncInvoker(
        ChangeEipStatusRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.changeEipStatus, hcClient);
    }

    /**
     * 查看EIP告警白名单
     *
     * 查看EIP告警白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmWhitelistRequest 请求对象
     * @return CompletableFuture<ListAlarmWhitelistResponse>
     */
    public CompletableFuture<ListAlarmWhitelistResponse> listAlarmWhitelistAsync(ListAlarmWhitelistRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listAlarmWhitelist);
    }

    /**
     * 查看EIP告警白名单
     *
     * 查看EIP告警白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmWhitelistRequest 请求对象
     * @return AsyncInvoker<ListAlarmWhitelistRequest, ListAlarmWhitelistResponse>
     */
    public AsyncInvoker<ListAlarmWhitelistRequest, ListAlarmWhitelistResponse> listAlarmWhitelistAsyncInvoker(
        ListAlarmWhitelistRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listAlarmWhitelist, hcClient);
    }

    /**
     * 查询EIP数量
     *
     * 查询EIP数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEipCountRequest 请求对象
     * @return CompletableFuture<ListEipCountResponse>
     */
    public CompletableFuture<ListEipCountResponse> listEipCountAsync(ListEipCountRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listEipCount);
    }

    /**
     * 查询EIP数量
     *
     * 查询EIP数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEipCountRequest 请求对象
     * @return AsyncInvoker<ListEipCountRequest, ListEipCountResponse>
     */
    public AsyncInvoker<ListEipCountRequest, ListEipCountResponse> listEipCountAsyncInvoker(
        ListEipCountRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listEipCount, hcClient);
    }

    /**
     * 弹性IP列表查询
     *
     * 弹性IP列表查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEipsRequest 请求对象
     * @return CompletableFuture<ListEipsResponse>
     */
    public CompletableFuture<ListEipsResponse> listEipsAsync(ListEipsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listEips);
    }

    /**
     * 弹性IP列表查询
     *
     * 弹性IP列表查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEipsRequest 请求对象
     * @return AsyncInvoker<ListEipsRequest, ListEipsResponse>
     */
    public AsyncInvoker<ListEipsRequest, ListEipsResponse> listEipsAsyncInvoker(ListEipsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listEips, hcClient);
    }

    /**
     * 获取EIP自动防护状态信息
     *
     * 获取EIP自动防护状态信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoProtectStatusRequest 请求对象
     * @return CompletableFuture<ShowAutoProtectStatusResponse>
     */
    public CompletableFuture<ShowAutoProtectStatusResponse> showAutoProtectStatusAsync(
        ShowAutoProtectStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.showAutoProtectStatus);
    }

    /**
     * 获取EIP自动防护状态信息
     *
     * 获取EIP自动防护状态信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoProtectStatusRequest 请求对象
     * @return AsyncInvoker<ShowAutoProtectStatusRequest, ShowAutoProtectStatusResponse>
     */
    public AsyncInvoker<ShowAutoProtectStatusRequest, ShowAutoProtectStatusResponse> showAutoProtectStatusAsyncInvoker(
        ShowAutoProtectStatusRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.showAutoProtectStatus, hcClient);
    }

    /**
     * 修改EIP自动防护开关
     *
     * 修改EIP自动防护开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchAutoProtectStatusRequest 请求对象
     * @return CompletableFuture<SwitchAutoProtectStatusResponse>
     */
    public CompletableFuture<SwitchAutoProtectStatusResponse> switchAutoProtectStatusAsync(
        SwitchAutoProtectStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.switchAutoProtectStatus);
    }

    /**
     * 修改EIP自动防护开关
     *
     * 修改EIP自动防护开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchAutoProtectStatusRequest 请求对象
     * @return AsyncInvoker<SwitchAutoProtectStatusRequest, SwitchAutoProtectStatusResponse>
     */
    public AsyncInvoker<SwitchAutoProtectStatusRequest, SwitchAutoProtectStatusResponse> switchAutoProtectStatusAsyncInvoker(
        SwitchAutoProtectStatusRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.switchAutoProtectStatus, hcClient);
    }

    /**
     * 一键逃生/一键恢复开关
     *
     * 一键逃生/一键恢复开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchFirewallEipProtectionRequest 请求对象
     * @return CompletableFuture<SwitchFirewallEipProtectionResponse>
     */
    public CompletableFuture<SwitchFirewallEipProtectionResponse> switchFirewallEipProtectionAsync(
        SwitchFirewallEipProtectionRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.switchFirewallEipProtection);
    }

    /**
     * 一键逃生/一键恢复开关
     *
     * 一键逃生/一键恢复开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchFirewallEipProtectionRequest 请求对象
     * @return AsyncInvoker<SwitchFirewallEipProtectionRequest, SwitchFirewallEipProtectionResponse>
     */
    public AsyncInvoker<SwitchFirewallEipProtectionRequest, SwitchFirewallEipProtectionResponse> switchFirewallEipProtectionAsyncInvoker(
        SwitchFirewallEipProtectionRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.switchFirewallEipProtection, hcClient);
    }

    /**
     * 创建东西向防火墙
     *
     * 创建东西向防火墙
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEastWestFirewallRequest 请求对象
     * @return CompletableFuture<CreateEastWestFirewallResponse>
     */
    public CompletableFuture<CreateEastWestFirewallResponse> createEastWestFirewallAsync(
        CreateEastWestFirewallRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.createEastWestFirewall);
    }

    /**
     * 创建东西向防火墙
     *
     * 创建东西向防火墙
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEastWestFirewallRequest 请求对象
     * @return AsyncInvoker<CreateEastWestFirewallRequest, CreateEastWestFirewallResponse>
     */
    public AsyncInvoker<CreateEastWestFirewallRequest, CreateEastWestFirewallResponse> createEastWestFirewallAsyncInvoker(
        CreateEastWestFirewallRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.createEastWestFirewall, hcClient);
    }

    /**
     * 创建防火墙
     *
     * 创建防火墙
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFirewallRequest 请求对象
     * @return CompletableFuture<CreateFirewallResponse>
     */
    public CompletableFuture<CreateFirewallResponse> createFirewallAsync(CreateFirewallRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.createFirewall);
    }

    /**
     * 创建防火墙
     *
     * 创建防火墙
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFirewallRequest 请求对象
     * @return AsyncInvoker<CreateFirewallRequest, CreateFirewallResponse>
     */
    public AsyncInvoker<CreateFirewallRequest, CreateFirewallResponse> createFirewallAsyncInvoker(
        CreateFirewallRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.createFirewall, hcClient);
    }

    /**
     * 标签创建接口
     *
     * 创建标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTagRequest 请求对象
     * @return CompletableFuture<CreateTagResponse>
     */
    public CompletableFuture<CreateTagResponse> createTagAsync(CreateTagRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.createTag);
    }

    /**
     * 标签创建接口
     *
     * 创建标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTagRequest 请求对象
     * @return AsyncInvoker<CreateTagRequest, CreateTagResponse>
     */
    public AsyncInvoker<CreateTagRequest, CreateTagResponse> createTagAsyncInvoker(CreateTagRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.createTag, hcClient);
    }

    /**
     * 删除防火墙
     *
     * 删除防火墙，仅按需生效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFirewallRequest 请求对象
     * @return CompletableFuture<DeleteFirewallResponse>
     */
    public CompletableFuture<DeleteFirewallResponse> deleteFirewallAsync(DeleteFirewallRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.deleteFirewall);
    }

    /**
     * 删除防火墙
     *
     * 删除防火墙，仅按需生效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFirewallRequest 请求对象
     * @return AsyncInvoker<DeleteFirewallRequest, DeleteFirewallResponse>
     */
    public AsyncInvoker<DeleteFirewallRequest, DeleteFirewallResponse> deleteFirewallAsyncInvoker(
        DeleteFirewallRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.deleteFirewall, hcClient);
    }

    /**
     * 删除标签
     *
     * 删除标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTagRequest 请求对象
     * @return CompletableFuture<DeleteTagResponse>
     */
    public CompletableFuture<DeleteTagResponse> deleteTagAsync(DeleteTagRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.deleteTag);
    }

    /**
     * 删除标签
     *
     * 删除标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTagRequest 请求对象
     * @return AsyncInvoker<DeleteTagRequest, DeleteTagResponse>
     */
    public AsyncInvoker<DeleteTagRequest, DeleteTagResponse> deleteTagAsyncInvoker(DeleteTagRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.deleteTag, hcClient);
    }

    /**
     * 获取东西向防火墙信息
     *
     * 获取东西向防火墙信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEastWestFirewallRequest 请求对象
     * @return CompletableFuture<ListEastWestFirewallResponse>
     */
    public CompletableFuture<ListEastWestFirewallResponse> listEastWestFirewallAsync(
        ListEastWestFirewallRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listEastWestFirewall);
    }

    /**
     * 获取东西向防火墙信息
     *
     * 获取东西向防火墙信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEastWestFirewallRequest 请求对象
     * @return AsyncInvoker<ListEastWestFirewallRequest, ListEastWestFirewallResponse>
     */
    public AsyncInvoker<ListEastWestFirewallRequest, ListEastWestFirewallResponse> listEastWestFirewallAsyncInvoker(
        ListEastWestFirewallRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listEastWestFirewall, hcClient);
    }

    /**
     * 查询防火墙详细信息
     *
     * 查询防火墙实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFirewallDetailRequest 请求对象
     * @return CompletableFuture<ListFirewallDetailResponse>
     */
    public CompletableFuture<ListFirewallDetailResponse> listFirewallDetailAsync(ListFirewallDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listFirewallDetail);
    }

    /**
     * 查询防火墙详细信息
     *
     * 查询防火墙实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFirewallDetailRequest 请求对象
     * @return AsyncInvoker<ListFirewallDetailRequest, ListFirewallDetailResponse>
     */
    public AsyncInvoker<ListFirewallDetailRequest, ListFirewallDetailResponse> listFirewallDetailAsyncInvoker(
        ListFirewallDetailRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listFirewallDetail, hcClient);
    }

    /**
     * 查询防火墙列表
     *
     * 查询防火墙列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFirewallListRequest 请求对象
     * @return CompletableFuture<ListFirewallListResponse>
     */
    public CompletableFuture<ListFirewallListResponse> listFirewallListAsync(ListFirewallListRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listFirewallList);
    }

    /**
     * 查询防火墙列表
     *
     * 查询防火墙列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFirewallListRequest 请求对象
     * @return AsyncInvoker<ListFirewallListRequest, ListFirewallListResponse>
     */
    public AsyncInvoker<ListFirewallListRequest, ListFirewallListResponse> listFirewallListAsyncInvoker(
        ListFirewallListRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listFirewallList, hcClient);
    }

    /**
     * 获取CFW任务执行状态
     *
     * 获取CFW任务执行状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobRequest 请求对象
     * @return CompletableFuture<ListJobResponse>
     */
    public CompletableFuture<ListJobResponse> listJobAsync(ListJobRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listJob);
    }

    /**
     * 获取CFW任务执行状态
     *
     * 获取CFW任务执行状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobRequest 请求对象
     * @return AsyncInvoker<ListJobRequest, ListJobResponse>
     */
    public AsyncInvoker<ListJobRequest, ListJobResponse> listJobAsyncInvoker(ListJobRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listJob, hcClient);
    }

    /**
     * 查询防护VPC数
     *
     * 查询防护vpc信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProtectedVpcsRequest 请求对象
     * @return CompletableFuture<ListProtectedVpcsResponse>
     */
    public CompletableFuture<ListProtectedVpcsResponse> listProtectedVpcsAsync(ListProtectedVpcsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listProtectedVpcs);
    }

    /**
     * 查询防护VPC数
     *
     * 查询防护vpc信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProtectedVpcsRequest 请求对象
     * @return AsyncInvoker<ListProtectedVpcsRequest, ListProtectedVpcsResponse>
     */
    public AsyncInvoker<ListProtectedVpcsRequest, ListProtectedVpcsResponse> listProtectedVpcsAsyncInvoker(
        ListProtectedVpcsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listProtectedVpcs, hcClient);
    }

    /**
     * 查询防火墙配额信息
     *
     * 查询防火墙配额信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigQuotaRequest 请求对象
     * @return CompletableFuture<ShowConfigQuotaResponse>
     */
    public CompletableFuture<ShowConfigQuotaResponse> showConfigQuotaAsync(ShowConfigQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.showConfigQuota);
    }

    /**
     * 查询防火墙配额信息
     *
     * 查询防火墙配额信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigQuotaRequest 请求对象
     * @return AsyncInvoker<ShowConfigQuotaRequest, ShowConfigQuotaResponse>
     */
    public AsyncInvoker<ShowConfigQuotaRequest, ShowConfigQuotaResponse> showConfigQuotaAsyncInvoker(
        ShowConfigQuotaRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.showConfigQuota, hcClient);
    }

    /**
     * 查询南北向防火墙防护状态
     *
     * 查询南北向防火墙防护状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSnFirewallProtectionStatusRequest 请求对象
     * @return CompletableFuture<ShowSnFirewallProtectionStatusResponse>
     */
    public CompletableFuture<ShowSnFirewallProtectionStatusResponse> showSnFirewallProtectionStatusAsync(
        ShowSnFirewallProtectionStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.showSnFirewallProtectionStatus);
    }

    /**
     * 查询南北向防火墙防护状态
     *
     * 查询南北向防火墙防护状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSnFirewallProtectionStatusRequest 请求对象
     * @return AsyncInvoker<ShowSnFirewallProtectionStatusRequest, ShowSnFirewallProtectionStatusResponse>
     */
    public AsyncInvoker<ShowSnFirewallProtectionStatusRequest, ShowSnFirewallProtectionStatusResponse> showSnFirewallProtectionStatusAsyncInvoker(
        ShowSnFirewallProtectionStatusRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.showSnFirewallProtectionStatus, hcClient);
    }

    /**
     * 更改防火墙名称
     *
     * 更改防火墙名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFirewallNameRequest 请求对象
     * @return CompletableFuture<UpdateFirewallNameResponse>
     */
    public CompletableFuture<UpdateFirewallNameResponse> updateFirewallNameAsync(UpdateFirewallNameRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.updateFirewallName);
    }

    /**
     * 更改防火墙名称
     *
     * 更改防火墙名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFirewallNameRequest 请求对象
     * @return AsyncInvoker<UpdateFirewallNameRequest, UpdateFirewallNameResponse>
     */
    public AsyncInvoker<UpdateFirewallNameRequest, UpdateFirewallNameResponse> updateFirewallNameAsyncInvoker(
        UpdateFirewallNameRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.updateFirewallName, hcClient);
    }

    /**
     * 批量删除自定义IPS规则
     *
     * 批量删除自定义IPS规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteCustomerIpsRequest 请求对象
     * @return CompletableFuture<BatchDeleteCustomerIpsResponse>
     */
    public CompletableFuture<BatchDeleteCustomerIpsResponse> batchDeleteCustomerIpsAsync(
        BatchDeleteCustomerIpsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.batchDeleteCustomerIps);
    }

    /**
     * 批量删除自定义IPS规则
     *
     * 批量删除自定义IPS规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteCustomerIpsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteCustomerIpsRequest, BatchDeleteCustomerIpsResponse>
     */
    public AsyncInvoker<BatchDeleteCustomerIpsRequest, BatchDeleteCustomerIpsResponse> batchDeleteCustomerIpsAsyncInvoker(
        BatchDeleteCustomerIpsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.batchDeleteCustomerIps, hcClient);
    }

    /**
     * 批量更新自定义IPS规则的动作
     *
     * 批量更新自定义IPS规则的动作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateCustomerIpsActionRequest 请求对象
     * @return CompletableFuture<BatchUpdateCustomerIpsActionResponse>
     */
    public CompletableFuture<BatchUpdateCustomerIpsActionResponse> batchUpdateCustomerIpsActionAsync(
        BatchUpdateCustomerIpsActionRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.batchUpdateCustomerIpsAction);
    }

    /**
     * 批量更新自定义IPS规则的动作
     *
     * 批量更新自定义IPS规则的动作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateCustomerIpsActionRequest 请求对象
     * @return AsyncInvoker<BatchUpdateCustomerIpsActionRequest, BatchUpdateCustomerIpsActionResponse>
     */
    public AsyncInvoker<BatchUpdateCustomerIpsActionRequest, BatchUpdateCustomerIpsActionResponse> batchUpdateCustomerIpsActionAsyncInvoker(
        BatchUpdateCustomerIpsActionRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.batchUpdateCustomerIpsAction, hcClient);
    }

    /**
     * 切换防护模式
     *
     * 切换防护模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeIpsProtectModeRequest 请求对象
     * @return CompletableFuture<ChangeIpsProtectModeResponse>
     */
    public CompletableFuture<ChangeIpsProtectModeResponse> changeIpsProtectModeAsync(
        ChangeIpsProtectModeRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.changeIpsProtectMode);
    }

    /**
     * 切换防护模式
     *
     * 切换防护模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeIpsProtectModeRequest 请求对象
     * @return AsyncInvoker<ChangeIpsProtectModeRequest, ChangeIpsProtectModeResponse>
     */
    public AsyncInvoker<ChangeIpsProtectModeRequest, ChangeIpsProtectModeResponse> changeIpsProtectModeAsyncInvoker(
        ChangeIpsProtectModeRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.changeIpsProtectMode, hcClient);
    }

    /**
     * 改变IPS规则模式
     *
     * 改变IPS规则模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeIpsRuleModeRequest 请求对象
     * @return CompletableFuture<ChangeIpsRuleModeResponse>
     */
    public CompletableFuture<ChangeIpsRuleModeResponse> changeIpsRuleModeAsync(ChangeIpsRuleModeRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.changeIpsRuleMode);
    }

    /**
     * 改变IPS规则模式
     *
     * 改变IPS规则模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeIpsRuleModeRequest 请求对象
     * @return AsyncInvoker<ChangeIpsRuleModeRequest, ChangeIpsRuleModeResponse>
     */
    public AsyncInvoker<ChangeIpsRuleModeRequest, ChangeIpsRuleModeResponse> changeIpsRuleModeAsyncInvoker(
        ChangeIpsRuleModeRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.changeIpsRuleMode, hcClient);
    }

    /**
     * IPS特性开关操作
     *
     * 切换开关状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeIpsSwitchStatusRequest 请求对象
     * @return CompletableFuture<ChangeIpsSwitchStatusResponse>
     */
    public CompletableFuture<ChangeIpsSwitchStatusResponse> changeIpsSwitchStatusAsync(
        ChangeIpsSwitchStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.changeIpsSwitchStatus);
    }

    /**
     * IPS特性开关操作
     *
     * 切换开关状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeIpsSwitchStatusRequest 请求对象
     * @return AsyncInvoker<ChangeIpsSwitchStatusRequest, ChangeIpsSwitchStatusResponse>
     */
    public AsyncInvoker<ChangeIpsSwitchStatusRequest, ChangeIpsSwitchStatusResponse> changeIpsSwitchStatusAsyncInvoker(
        ChangeIpsSwitchStatusRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.changeIpsSwitchStatus, hcClient);
    }

    /**
     * 创建自定义IPS规则
     *
     * 创建自定义IPS规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCustomerIpsRequest 请求对象
     * @return CompletableFuture<CreateCustomerIpsResponse>
     */
    public CompletableFuture<CreateCustomerIpsResponse> createCustomerIpsAsync(CreateCustomerIpsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.createCustomerIps);
    }

    /**
     * 创建自定义IPS规则
     *
     * 创建自定义IPS规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCustomerIpsRequest 请求对象
     * @return AsyncInvoker<CreateCustomerIpsRequest, CreateCustomerIpsResponse>
     */
    public AsyncInvoker<CreateCustomerIpsRequest, CreateCustomerIpsResponse> createCustomerIpsAsyncInvoker(
        CreateCustomerIpsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.createCustomerIps, hcClient);
    }

    /**
     * 查询频率IPS规则信息
     *
     * 查询频率IPS规则信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAdvancedIpsRulesRequest 请求对象
     * @return CompletableFuture<ListAdvancedIpsRulesResponse>
     */
    public CompletableFuture<ListAdvancedIpsRulesResponse> listAdvancedIpsRulesAsync(
        ListAdvancedIpsRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listAdvancedIpsRules);
    }

    /**
     * 查询频率IPS规则信息
     *
     * 查询频率IPS规则信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAdvancedIpsRulesRequest 请求对象
     * @return AsyncInvoker<ListAdvancedIpsRulesRequest, ListAdvancedIpsRulesResponse>
     */
    public AsyncInvoker<ListAdvancedIpsRulesRequest, ListAdvancedIpsRulesResponse> listAdvancedIpsRulesAsyncInvoker(
        ListAdvancedIpsRulesRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listAdvancedIpsRules, hcClient);
    }

    /**
     * 查看自定义IPS规则列表
     *
     * 查看自定义IPS规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCustomerIpsRequest 请求对象
     * @return CompletableFuture<ListCustomerIpsResponse>
     */
    public CompletableFuture<ListCustomerIpsResponse> listCustomerIpsAsync(ListCustomerIpsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listCustomerIps);
    }

    /**
     * 查看自定义IPS规则列表
     *
     * 查看自定义IPS规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCustomerIpsRequest 请求对象
     * @return AsyncInvoker<ListCustomerIpsRequest, ListCustomerIpsResponse>
     */
    public AsyncInvoker<ListCustomerIpsRequest, ListCustomerIpsResponse> listCustomerIpsAsyncInvoker(
        ListCustomerIpsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listCustomerIps, hcClient);
    }

    /**
     * 查询防护模式
     *
     * 查询防护模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpsProtectModeRequest 请求对象
     * @return CompletableFuture<ListIpsProtectModeResponse>
     */
    public CompletableFuture<ListIpsProtectModeResponse> listIpsProtectModeAsync(ListIpsProtectModeRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listIpsProtectMode);
    }

    /**
     * 查询防护模式
     *
     * 查询防护模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpsProtectModeRequest 请求对象
     * @return AsyncInvoker<ListIpsProtectModeRequest, ListIpsProtectModeResponse>
     */
    public AsyncInvoker<ListIpsProtectModeRequest, ListIpsProtectModeResponse> listIpsProtectModeAsyncInvoker(
        ListIpsProtectModeRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listIpsProtectMode, hcClient);
    }

    /**
     * 获取IPS规则列表
     *
     * 获取IPS规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpsRulesRequest 请求对象
     * @return CompletableFuture<ListIpsRulesResponse>
     */
    public CompletableFuture<ListIpsRulesResponse> listIpsRulesAsync(ListIpsRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listIpsRules);
    }

    /**
     * 获取IPS规则列表
     *
     * 获取IPS规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpsRulesRequest 请求对象
     * @return AsyncInvoker<ListIpsRulesRequest, ListIpsRulesResponse>
     */
    public AsyncInvoker<ListIpsRulesRequest, ListIpsRulesResponse> listIpsRulesAsyncInvoker(
        ListIpsRulesRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listIpsRules, hcClient);
    }

    /**
     * 查询IPS特性开关状态
     *
     * 查询IPS特性开关状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpsSwitchStatusRequest 请求对象
     * @return CompletableFuture<ListIpsSwitchStatusResponse>
     */
    public CompletableFuture<ListIpsSwitchStatusResponse> listIpsSwitchStatusAsync(ListIpsSwitchStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listIpsSwitchStatus);
    }

    /**
     * 查询IPS特性开关状态
     *
     * 查询IPS特性开关状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpsSwitchStatusRequest 请求对象
     * @return AsyncInvoker<ListIpsSwitchStatusRequest, ListIpsSwitchStatusResponse>
     */
    public AsyncInvoker<ListIpsSwitchStatusRequest, ListIpsSwitchStatusResponse> listIpsSwitchStatusAsyncInvoker(
        ListIpsSwitchStatusRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listIpsSwitchStatus, hcClient);
    }

    /**
     * 查询自定义IPS规则详情
     *
     * 功能说明：自定义IPS规则详情，特性:根据路径输入的IPS ID查看对应的自定义IPS详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCustomerIpsInfoRequest 请求对象
     * @return CompletableFuture<ShowCustomerIpsInfoResponse>
     */
    public CompletableFuture<ShowCustomerIpsInfoResponse> showCustomerIpsInfoAsync(ShowCustomerIpsInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.showCustomerIpsInfo);
    }

    /**
     * 查询自定义IPS规则详情
     *
     * 功能说明：自定义IPS规则详情，特性:根据路径输入的IPS ID查看对应的自定义IPS详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCustomerIpsInfoRequest 请求对象
     * @return AsyncInvoker<ShowCustomerIpsInfoRequest, ShowCustomerIpsInfoResponse>
     */
    public AsyncInvoker<ShowCustomerIpsInfoRequest, ShowCustomerIpsInfoResponse> showCustomerIpsInfoAsyncInvoker(
        ShowCustomerIpsInfoRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.showCustomerIpsInfo, hcClient);
    }

    /**
     * 获取IPS规则细节
     *
     * 获取IPS规则细节
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIpsUpdateTimeRequest 请求对象
     * @return CompletableFuture<ShowIpsUpdateTimeResponse>
     */
    public CompletableFuture<ShowIpsUpdateTimeResponse> showIpsUpdateTimeAsync(ShowIpsUpdateTimeRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.showIpsUpdateTime);
    }

    /**
     * 获取IPS规则细节
     *
     * 获取IPS规则细节
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIpsUpdateTimeRequest 请求对象
     * @return AsyncInvoker<ShowIpsUpdateTimeRequest, ShowIpsUpdateTimeResponse>
     */
    public AsyncInvoker<ShowIpsUpdateTimeRequest, ShowIpsUpdateTimeResponse> showIpsUpdateTimeAsyncInvoker(
        ShowIpsUpdateTimeRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.showIpsUpdateTime, hcClient);
    }

    /**
     * 创建频率IPS规则
     *
     * 创建频率IPS规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAdvancedIpsRuleRequest 请求对象
     * @return CompletableFuture<UpdateAdvancedIpsRuleResponse>
     */
    public CompletableFuture<UpdateAdvancedIpsRuleResponse> updateAdvancedIpsRuleAsync(
        UpdateAdvancedIpsRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.updateAdvancedIpsRule);
    }

    /**
     * 创建频率IPS规则
     *
     * 创建频率IPS规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAdvancedIpsRuleRequest 请求对象
     * @return AsyncInvoker<UpdateAdvancedIpsRuleRequest, UpdateAdvancedIpsRuleResponse>
     */
    public AsyncInvoker<UpdateAdvancedIpsRuleRequest, UpdateAdvancedIpsRuleResponse> updateAdvancedIpsRuleAsyncInvoker(
        UpdateAdvancedIpsRuleRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.updateAdvancedIpsRule, hcClient);
    }

    /**
     * 更新自定义IPS规则
     *
     * 更新自定义IPS规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCustomerIpsRequest 请求对象
     * @return CompletableFuture<UpdateCustomerIpsResponse>
     */
    public CompletableFuture<UpdateCustomerIpsResponse> updateCustomerIpsAsync(UpdateCustomerIpsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.updateCustomerIps);
    }

    /**
     * 更新自定义IPS规则
     *
     * 更新自定义IPS规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCustomerIpsRequest 请求对象
     * @return AsyncInvoker<UpdateCustomerIpsRequest, UpdateCustomerIpsResponse>
     */
    public AsyncInvoker<UpdateCustomerIpsRequest, UpdateCustomerIpsResponse> updateCustomerIpsAsyncInvoker(
        UpdateCustomerIpsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.updateCustomerIps, hcClient);
    }

    /**
     * 批量添加IPS白名单
     *
     * 批量添加IPS白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateIpsWhitelistRequest 请求对象
     * @return CompletableFuture<BatchCreateIpsWhitelistResponse>
     */
    public CompletableFuture<BatchCreateIpsWhitelistResponse> batchCreateIpsWhitelistAsync(
        BatchCreateIpsWhitelistRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.batchCreateIpsWhitelist);
    }

    /**
     * 批量添加IPS白名单
     *
     * 批量添加IPS白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateIpsWhitelistRequest 请求对象
     * @return AsyncInvoker<BatchCreateIpsWhitelistRequest, BatchCreateIpsWhitelistResponse>
     */
    public AsyncInvoker<BatchCreateIpsWhitelistRequest, BatchCreateIpsWhitelistResponse> batchCreateIpsWhitelistAsyncInvoker(
        BatchCreateIpsWhitelistRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.batchCreateIpsWhitelist, hcClient);
    }

    /**
     * 批量删除IPS白名单
     *
     * 批量删除IPS白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteIpsWhitelistRequest 请求对象
     * @return CompletableFuture<BatchDeleteIpsWhitelistResponse>
     */
    public CompletableFuture<BatchDeleteIpsWhitelistResponse> batchDeleteIpsWhitelistAsync(
        BatchDeleteIpsWhitelistRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.batchDeleteIpsWhitelist);
    }

    /**
     * 批量删除IPS白名单
     *
     * 批量删除IPS白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteIpsWhitelistRequest 请求对象
     * @return AsyncInvoker<BatchDeleteIpsWhitelistRequest, BatchDeleteIpsWhitelistResponse>
     */
    public AsyncInvoker<BatchDeleteIpsWhitelistRequest, BatchDeleteIpsWhitelistResponse> batchDeleteIpsWhitelistAsyncInvoker(
        BatchDeleteIpsWhitelistRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.batchDeleteIpsWhitelist, hcClient);
    }

    /**
     * 查询IPS白名单列表详情
     *
     * 查询IPS白名单列表详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpsWhitelistsRequest 请求对象
     * @return CompletableFuture<ListIpsWhitelistsResponse>
     */
    public CompletableFuture<ListIpsWhitelistsResponse> listIpsWhitelistsAsync(ListIpsWhitelistsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listIpsWhitelists);
    }

    /**
     * 查询IPS白名单列表详情
     *
     * 查询IPS白名单列表详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpsWhitelistsRequest 请求对象
     * @return AsyncInvoker<ListIpsWhitelistsRequest, ListIpsWhitelistsResponse>
     */
    public AsyncInvoker<ListIpsWhitelistsRequest, ListIpsWhitelistsResponse> listIpsWhitelistsAsyncInvoker(
        ListIpsWhitelistsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listIpsWhitelists, hcClient);
    }

    /**
     * 更新IPS白名单
     *
     * 更新IPS白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIpsWhitelistRequest 请求对象
     * @return CompletableFuture<UpdateIpsWhitelistResponse>
     */
    public CompletableFuture<UpdateIpsWhitelistResponse> updateIpsWhitelistAsync(UpdateIpsWhitelistRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.updateIpsWhitelist);
    }

    /**
     * 更新IPS白名单
     *
     * 更新IPS白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIpsWhitelistRequest 请求对象
     * @return AsyncInvoker<UpdateIpsWhitelistRequest, UpdateIpsWhitelistResponse>
     */
    public AsyncInvoker<UpdateIpsWhitelistRequest, UpdateIpsWhitelistResponse> updateIpsWhitelistAsyncInvoker(
        UpdateIpsWhitelistRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.updateIpsWhitelist, hcClient);
    }

    /**
     * 查询攻击统计
     *
     * 根据防火墙攻击日志，查询攻击统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAttackStatisticRequest 请求对象
     * @return CompletableFuture<ListAttackStatisticResponse>
     */
    public CompletableFuture<ListAttackStatisticResponse> listAttackStatisticAsync(ListAttackStatisticRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listAttackStatistic);
    }

    /**
     * 查询攻击统计
     *
     * 根据防火墙攻击日志，查询攻击统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAttackStatisticRequest 请求对象
     * @return AsyncInvoker<ListAttackStatisticRequest, ListAttackStatisticResponse>
     */
    public AsyncInvoker<ListAttackStatisticRequest, ListAttackStatisticResponse> listAttackStatisticAsyncInvoker(
        ListAttackStatisticRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listAttackStatistic, hcClient);
    }

    /**
     * 查询流量日志统计
     *
     * 查询流量日志统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlowStatisticRequest 请求对象
     * @return CompletableFuture<ListFlowStatisticResponse>
     */
    public CompletableFuture<ListFlowStatisticResponse> listFlowStatisticAsync(ListFlowStatisticRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listFlowStatistic);
    }

    /**
     * 查询流量日志统计
     *
     * 查询流量日志统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlowStatisticRequest 请求对象
     * @return AsyncInvoker<ListFlowStatisticRequest, ListFlowStatisticResponse>
     */
    public AsyncInvoker<ListFlowStatisticRequest, ListFlowStatisticResponse> listFlowStatisticAsyncInvoker(
        ListFlowStatisticRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listFlowStatistic, hcClient);
    }

    /**
     * 查询访问控制统计详情
     *
     * 查询访问控制统计详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAccessDetailRequest 请求对象
     * @return CompletableFuture<ShowAccessDetailResponse>
     */
    public CompletableFuture<ShowAccessDetailResponse> showAccessDetailAsync(ShowAccessDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.showAccessDetail);
    }

    /**
     * 查询访问控制统计详情
     *
     * 查询访问控制统计详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAccessDetailRequest 请求对象
     * @return AsyncInvoker<ShowAccessDetailRequest, ShowAccessDetailResponse>
     */
    public AsyncInvoker<ShowAccessDetailRequest, ShowAccessDetailResponse> showAccessDetailAsyncInvoker(
        ShowAccessDetailRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.showAccessDetail, hcClient);
    }

    /**
     * 查询访问日志统计信息
     *
     * 获取访问日志的TOP统计信息，如TOP命中规则等
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAccessTopRequest 请求对象
     * @return CompletableFuture<ShowAccessTopResponse>
     */
    public CompletableFuture<ShowAccessTopResponse> showAccessTopAsync(ShowAccessTopRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.showAccessTop);
    }

    /**
     * 查询访问日志统计信息
     *
     * 获取访问日志的TOP统计信息，如TOP命中规则等
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAccessTopRequest 请求对象
     * @return AsyncInvoker<ShowAccessTopRequest, ShowAccessTopResponse>
     */
    public AsyncInvoker<ShowAccessTopRequest, ShowAccessTopResponse> showAccessTopAsyncInvoker(
        ShowAccessTopRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.showAccessTop, hcClient);
    }

    /**
     * 查询攻击日志统计详情
     *
     * 查询攻击日志统计详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAttackDetailRequest 请求对象
     * @return CompletableFuture<ShowAttackDetailResponse>
     */
    public CompletableFuture<ShowAttackDetailResponse> showAttackDetailAsync(ShowAttackDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.showAttackDetail);
    }

    /**
     * 查询攻击日志统计详情
     *
     * 查询攻击日志统计详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAttackDetailRequest 请求对象
     * @return AsyncInvoker<ShowAttackDetailRequest, ShowAttackDetailResponse>
     */
    public AsyncInvoker<ShowAttackDetailRequest, ShowAttackDetailResponse> showAttackDetailAsyncInvoker(
        ShowAttackDetailRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.showAttackDetail, hcClient);
    }

    /**
     * 查询攻击日志TOP统计
     *
     * 查询攻击日志TOP统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAttackTopRequest 请求对象
     * @return CompletableFuture<ShowAttackTopResponse>
     */
    public CompletableFuture<ShowAttackTopResponse> showAttackTopAsync(ShowAttackTopRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.showAttackTop);
    }

    /**
     * 查询攻击日志TOP统计
     *
     * 查询攻击日志TOP统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAttackTopRequest 请求对象
     * @return AsyncInvoker<ShowAttackTopRequest, ShowAttackTopResponse>
     */
    public AsyncInvoker<ShowAttackTopRequest, ShowAttackTopResponse> showAttackTopAsyncInvoker(
        ShowAttackTopRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.showAttackTop, hcClient);
    }

    /**
     * 查询攻击概览
     *
     * 查询攻击概览
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAttackTotalRequest 请求对象
     * @return CompletableFuture<ShowAttackTotalResponse>
     */
    public CompletableFuture<ShowAttackTotalResponse> showAttackTotalAsync(ShowAttackTotalRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.showAttackTotal);
    }

    /**
     * 查询攻击概览
     *
     * 查询攻击概览
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAttackTotalRequest 请求对象
     * @return AsyncInvoker<ShowAttackTotalRequest, ShowAttackTotalResponse>
     */
    public AsyncInvoker<ShowAttackTotalRequest, ShowAttackTotalResponse> showAttackTotalAsyncInvoker(
        ShowAttackTotalRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.showAttackTotal, hcClient);
    }

    /**
     * 查询攻击趋势
     *
     * 查询攻击趋势
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAttackTrendRequest 请求对象
     * @return CompletableFuture<ShowAttackTrendResponse>
     */
    public CompletableFuture<ShowAttackTrendResponse> showAttackTrendAsync(ShowAttackTrendRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.showAttackTrend);
    }

    /**
     * 查询攻击趋势
     *
     * 查询攻击趋势
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAttackTrendRequest 请求对象
     * @return AsyncInvoker<ShowAttackTrendRequest, ShowAttackTrendResponse>
     */
    public AsyncInvoker<ShowAttackTrendRequest, ShowAttackTrendResponse> showAttackTrendAsyncInvoker(
        ShowAttackTrendRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.showAttackTrend, hcClient);
    }

    /**
     * 查询流量日志统计详情
     *
     * 查询流量日志统计详情，如统计某个源IP访问详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFlowDetailRequest 请求对象
     * @return CompletableFuture<ShowFlowDetailResponse>
     */
    public CompletableFuture<ShowFlowDetailResponse> showFlowDetailAsync(ShowFlowDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.showFlowDetail);
    }

    /**
     * 查询流量日志统计详情
     *
     * 查询流量日志统计详情，如统计某个源IP访问详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFlowDetailRequest 请求对象
     * @return AsyncInvoker<ShowFlowDetailRequest, ShowFlowDetailResponse>
     */
    public AsyncInvoker<ShowFlowDetailRequest, ShowFlowDetailResponse> showFlowDetailAsyncInvoker(
        ShowFlowDetailRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.showFlowDetail, hcClient);
    }

    /**
     * 查询流量TOP统计
     *
     * 查询流量TOP统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFlowTopRequest 请求对象
     * @return CompletableFuture<ShowFlowTopResponse>
     */
    public CompletableFuture<ShowFlowTopResponse> showFlowTopAsync(ShowFlowTopRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.showFlowTop);
    }

    /**
     * 查询流量TOP统计
     *
     * 查询流量TOP统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFlowTopRequest 请求对象
     * @return AsyncInvoker<ShowFlowTopRequest, ShowFlowTopResponse>
     */
    public AsyncInvoker<ShowFlowTopRequest, ShowFlowTopResponse> showFlowTopAsyncInvoker(ShowFlowTopRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.showFlowTop, hcClient);
    }

    /**
     * 查询会话趋势
     *
     * 查询会话趋势
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFlowTrendRequest 请求对象
     * @return CompletableFuture<ShowFlowTrendResponse>
     */
    public CompletableFuture<ShowFlowTrendResponse> showFlowTrendAsync(ShowFlowTrendRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.showFlowTrend);
    }

    /**
     * 查询会话趋势
     *
     * 查询会话趋势
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFlowTrendRequest 请求对象
     * @return AsyncInvoker<ShowFlowTrendRequest, ShowFlowTrendResponse>
     */
    public AsyncInvoker<ShowFlowTrendRequest, ShowFlowTrendResponse> showFlowTrendAsyncInvoker(
        ShowFlowTrendRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.showFlowTrend, hcClient);
    }

    /**
     * 查询日志数量
     *
     * 统计日志数量，如统计风险IP的数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogsCountRequest 请求对象
     * @return CompletableFuture<ShowLogsCountResponse>
     */
    public CompletableFuture<ShowLogsCountResponse> showLogsCountAsync(ShowLogsCountRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.showLogsCount);
    }

    /**
     * 查询日志数量
     *
     * 统计日志数量，如统计风险IP的数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogsCountRequest 请求对象
     * @return AsyncInvoker<ShowLogsCountRequest, ShowLogsCountResponse>
     */
    public AsyncInvoker<ShowLogsCountRequest, ShowLogsCountResponse> showLogsCountAsyncInvoker(
        ShowLogsCountRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.showLogsCount, hcClient);
    }

    /**
     * 查询流量趋势
     *
     * 查询流量趋势，包括南北向、EIP、东西向的流量趋势
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrafficTrendRequest 请求对象
     * @return CompletableFuture<ShowTrafficTrendResponse>
     */
    public CompletableFuture<ShowTrafficTrendResponse> showTrafficTrendAsync(ShowTrafficTrendRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.showTrafficTrend);
    }

    /**
     * 查询流量趋势
     *
     * 查询流量趋势，包括南北向、EIP、东西向的流量趋势
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrafficTrendRequest 请求对象
     * @return AsyncInvoker<ShowTrafficTrendRequest, ShowTrafficTrendResponse>
     */
    public AsyncInvoker<ShowTrafficTrendRequest, ShowTrafficTrendResponse> showTrafficTrendAsyncInvoker(
        ShowTrafficTrendRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.showTrafficTrend, hcClient);
    }

    /**
     * 创建日志配置
     *
     * 创建日志配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddLogConfigRequest 请求对象
     * @return CompletableFuture<AddLogConfigResponse>
     */
    public CompletableFuture<AddLogConfigResponse> addLogConfigAsync(AddLogConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.addLogConfig);
    }

    /**
     * 创建日志配置
     *
     * 创建日志配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddLogConfigRequest 请求对象
     * @return AsyncInvoker<AddLogConfigRequest, AddLogConfigResponse>
     */
    public AsyncInvoker<AddLogConfigRequest, AddLogConfigResponse> addLogConfigAsyncInvoker(
        AddLogConfigRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.addLogConfig, hcClient);
    }

    /**
     * 导出防火墙日志
     *
     * 导出防火墙日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportLogsRequest 请求对象
     * @return CompletableFuture<ExportLogsResponse>
     */
    public CompletableFuture<ExportLogsResponse> exportLogsAsync(ExportLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.exportLogs);
    }

    /**
     * 导出防火墙日志
     *
     * 导出防火墙日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportLogsRequest 请求对象
     * @return AsyncInvoker<ExportLogsRequest, ExportLogsResponse>
     */
    public AsyncInvoker<ExportLogsRequest, ExportLogsResponse> exportLogsAsyncInvoker(ExportLogsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.exportLogs, hcClient);
    }

    /**
     * 查询访问控制日志
     *
     * 查询访问控制日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccessControlLogsRequest 请求对象
     * @return CompletableFuture<ListAccessControlLogsResponse>
     */
    public CompletableFuture<ListAccessControlLogsResponse> listAccessControlLogsAsync(
        ListAccessControlLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listAccessControlLogs);
    }

    /**
     * 查询访问控制日志
     *
     * 查询访问控制日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccessControlLogsRequest 请求对象
     * @return AsyncInvoker<ListAccessControlLogsRequest, ListAccessControlLogsResponse>
     */
    public AsyncInvoker<ListAccessControlLogsRequest, ListAccessControlLogsResponse> listAccessControlLogsAsyncInvoker(
        ListAccessControlLogsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listAccessControlLogs, hcClient);
    }

    /**
     * 查询攻击日志
     *
     * 查询攻击日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAttackLogsRequest 请求对象
     * @return CompletableFuture<ListAttackLogsResponse>
     */
    public CompletableFuture<ListAttackLogsResponse> listAttackLogsAsync(ListAttackLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listAttackLogs);
    }

    /**
     * 查询攻击日志
     *
     * 查询攻击日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAttackLogsRequest 请求对象
     * @return AsyncInvoker<ListAttackLogsRequest, ListAttackLogsResponse>
     */
    public AsyncInvoker<ListAttackLogsRequest, ListAttackLogsResponse> listAttackLogsAsyncInvoker(
        ListAttackLogsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listAttackLogs, hcClient);
    }

    /**
     * 查询流日志
     *
     * 查询流日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlowLogsRequest 请求对象
     * @return CompletableFuture<ListFlowLogsResponse>
     */
    public CompletableFuture<ListFlowLogsResponse> listFlowLogsAsync(ListFlowLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listFlowLogs);
    }

    /**
     * 查询流日志
     *
     * 查询流日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlowLogsRequest 请求对象
     * @return AsyncInvoker<ListFlowLogsRequest, ListFlowLogsResponse>
     */
    public AsyncInvoker<ListFlowLogsRequest, ListFlowLogsResponse> listFlowLogsAsyncInvoker(
        ListFlowLogsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listFlowLogs, hcClient);
    }

    /**
     * 获取日志配置
     *
     * 获取日志配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogConfigRequest 请求对象
     * @return CompletableFuture<ListLogConfigResponse>
     */
    public CompletableFuture<ListLogConfigResponse> listLogConfigAsync(ListLogConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listLogConfig);
    }

    /**
     * 获取日志配置
     *
     * 获取日志配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogConfigRequest 请求对象
     * @return AsyncInvoker<ListLogConfigRequest, ListLogConfigResponse>
     */
    public AsyncInvoker<ListLogConfigRequest, ListLogConfigResponse> listLogConfigAsyncInvoker(
        ListLogConfigRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listLogConfig, hcClient);
    }

    /**
     * 查询防火墙日志
     *
     * 查询防火墙日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogsRequest 请求对象
     * @return CompletableFuture<ListLogsResponse>
     */
    public CompletableFuture<ListLogsResponse> listLogsAsync(ListLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listLogs);
    }

    /**
     * 查询防火墙日志
     *
     * 查询防火墙日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogsRequest 请求对象
     * @return AsyncInvoker<ListLogsRequest, ListLogsResponse>
     */
    public AsyncInvoker<ListLogsRequest, ListLogsResponse> listLogsAsyncInvoker(ListLogsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listLogs, hcClient);
    }

    /**
     * 更新日志配置
     *
     * 更新日志配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLogConfigRequest 请求对象
     * @return CompletableFuture<UpdateLogConfigResponse>
     */
    public CompletableFuture<UpdateLogConfigResponse> updateLogConfigAsync(UpdateLogConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.updateLogConfig);
    }

    /**
     * 更新日志配置
     *
     * 更新日志配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLogConfigRequest 请求对象
     * @return AsyncInvoker<UpdateLogConfigRequest, UpdateLogConfigResponse>
     */
    public AsyncInvoker<UpdateLogConfigRequest, UpdateLogConfigResponse> updateLogConfigAsyncInvoker(
        UpdateLogConfigRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.updateLogConfig, hcClient);
    }

    /**
     * 批量添加账号
     *
     * 批量添加账号
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddAccountsRequest 请求对象
     * @return CompletableFuture<BatchAddAccountsResponse>
     */
    public CompletableFuture<BatchAddAccountsResponse> batchAddAccountsAsync(BatchAddAccountsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.batchAddAccounts);
    }

    /**
     * 批量添加账号
     *
     * 批量添加账号
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddAccountsRequest 请求对象
     * @return AsyncInvoker<BatchAddAccountsRequest, BatchAddAccountsResponse>
     */
    public AsyncInvoker<BatchAddAccountsRequest, BatchAddAccountsResponse> batchAddAccountsAsyncInvoker(
        BatchAddAccountsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.batchAddAccounts, hcClient);
    }

    /**
     * 批量移除账号
     *
     * 批量移除账号
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRemoveAccountsRequest 请求对象
     * @return CompletableFuture<BatchRemoveAccountsResponse>
     */
    public CompletableFuture<BatchRemoveAccountsResponse> batchRemoveAccountsAsync(BatchRemoveAccountsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.batchRemoveAccounts);
    }

    /**
     * 批量移除账号
     *
     * 批量移除账号
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRemoveAccountsRequest 请求对象
     * @return AsyncInvoker<BatchRemoveAccountsRequest, BatchRemoveAccountsResponse>
     */
    public AsyncInvoker<BatchRemoveAccountsRequest, BatchRemoveAccountsResponse> batchRemoveAccountsAsyncInvoker(
        BatchRemoveAccountsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.batchRemoveAccounts, hcClient);
    }

    /**
     * 开启多账号管理
     *
     * 开启多账号管理
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableMultiAccountRequest 请求对象
     * @return CompletableFuture<EnableMultiAccountResponse>
     */
    public CompletableFuture<EnableMultiAccountResponse> enableMultiAccountAsync(EnableMultiAccountRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.enableMultiAccount);
    }

    /**
     * 开启多账号管理
     *
     * 开启多账号管理
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableMultiAccountRequest 请求对象
     * @return AsyncInvoker<EnableMultiAccountRequest, EnableMultiAccountResponse>
     */
    public AsyncInvoker<EnableMultiAccountRequest, EnableMultiAccountResponse> enableMultiAccountAsyncInvoker(
        EnableMultiAccountRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.enableMultiAccount, hcClient);
    }

    /**
     * 查询账号列表
     *
     * 查询账号列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccountsRequest 请求对象
     * @return CompletableFuture<ListAccountsResponse>
     */
    public CompletableFuture<ListAccountsResponse> listAccountsAsync(ListAccountsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listAccounts);
    }

    /**
     * 查询账号列表
     *
     * 查询账号列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccountsRequest 请求对象
     * @return AsyncInvoker<ListAccountsRequest, ListAccountsResponse>
     */
    public AsyncInvoker<ListAccountsRequest, ListAccountsResponse> listAccountsAsyncInvoker(
        ListAccountsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listAccounts, hcClient);
    }

    /**
     * 查询组织账号列表
     *
     * 查询组织账号列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOrganizationAccountsRequest 请求对象
     * @return CompletableFuture<ListOrganizationAccountsResponse>
     */
    public CompletableFuture<ListOrganizationAccountsResponse> listOrganizationAccountsAsync(
        ListOrganizationAccountsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listOrganizationAccounts);
    }

    /**
     * 查询组织账号列表
     *
     * 查询组织账号列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOrganizationAccountsRequest 请求对象
     * @return AsyncInvoker<ListOrganizationAccountsRequest, ListOrganizationAccountsResponse>
     */
    public AsyncInvoker<ListOrganizationAccountsRequest, ListOrganizationAccountsResponse> listOrganizationAccountsAsyncInvoker(
        ListOrganizationAccountsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listOrganizationAccounts, hcClient);
    }

    /**
     * 查询组织结构
     *
     * 查询组织结构
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOrganizationTreeRequest 请求对象
     * @return CompletableFuture<ListOrganizationTreeResponse>
     */
    public CompletableFuture<ListOrganizationTreeResponse> listOrganizationTreeAsync(
        ListOrganizationTreeRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listOrganizationTree);
    }

    /**
     * 查询组织结构
     *
     * 查询组织结构
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOrganizationTreeRequest 请求对象
     * @return AsyncInvoker<ListOrganizationTreeRequest, ListOrganizationTreeResponse>
     */
    public AsyncInvoker<ListOrganizationTreeRequest, ListOrganizationTreeResponse> listOrganizationTreeAsyncInvoker(
        ListOrganizationTreeRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listOrganizationTree, hcClient);
    }

    /**
     * 批量删除时间表
     *
     * 批量删除时间表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteSchedulesRequest 请求对象
     * @return CompletableFuture<BatchDeleteSchedulesResponse>
     */
    public CompletableFuture<BatchDeleteSchedulesResponse> batchDeleteSchedulesAsync(
        BatchDeleteSchedulesRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.batchDeleteSchedules);
    }

    /**
     * 批量删除时间表
     *
     * 批量删除时间表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteSchedulesRequest 请求对象
     * @return AsyncInvoker<BatchDeleteSchedulesRequest, BatchDeleteSchedulesResponse>
     */
    public AsyncInvoker<BatchDeleteSchedulesRequest, BatchDeleteSchedulesResponse> batchDeleteSchedulesAsyncInvoker(
        BatchDeleteSchedulesRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.batchDeleteSchedules, hcClient);
    }

    /**
     * 创建时间表
     *
     * 创建时间表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScheduleRequest 请求对象
     * @return CompletableFuture<CreateScheduleResponse>
     */
    public CompletableFuture<CreateScheduleResponse> createScheduleAsync(CreateScheduleRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.createSchedule);
    }

    /**
     * 创建时间表
     *
     * 创建时间表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScheduleRequest 请求对象
     * @return AsyncInvoker<CreateScheduleRequest, CreateScheduleResponse>
     */
    public AsyncInvoker<CreateScheduleRequest, CreateScheduleResponse> createScheduleAsyncInvoker(
        CreateScheduleRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.createSchedule, hcClient);
    }

    /**
     * 删除时间表
     *
     * 删除时间表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScheduleRequest 请求对象
     * @return CompletableFuture<DeleteScheduleResponse>
     */
    public CompletableFuture<DeleteScheduleResponse> deleteScheduleAsync(DeleteScheduleRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.deleteSchedule);
    }

    /**
     * 删除时间表
     *
     * 删除时间表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScheduleRequest 请求对象
     * @return AsyncInvoker<DeleteScheduleRequest, DeleteScheduleResponse>
     */
    public AsyncInvoker<DeleteScheduleRequest, DeleteScheduleResponse> deleteScheduleAsyncInvoker(
        DeleteScheduleRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.deleteSchedule, hcClient);
    }

    /**
     * 查询时间表列表
     *
     * 查询时间表列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSchedulesRequest 请求对象
     * @return CompletableFuture<ListSchedulesResponse>
     */
    public CompletableFuture<ListSchedulesResponse> listSchedulesAsync(ListSchedulesRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listSchedules);
    }

    /**
     * 查询时间表列表
     *
     * 查询时间表列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSchedulesRequest 请求对象
     * @return AsyncInvoker<ListSchedulesRequest, ListSchedulesResponse>
     */
    public AsyncInvoker<ListSchedulesRequest, ListSchedulesResponse> listSchedulesAsyncInvoker(
        ListSchedulesRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listSchedules, hcClient);
    }

    /**
     * 更新时间表
     *
     * 更新时间表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScheduleRequest 请求对象
     * @return CompletableFuture<UpdateScheduleResponse>
     */
    public CompletableFuture<UpdateScheduleResponse> updateScheduleAsync(UpdateScheduleRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.updateSchedule);
    }

    /**
     * 更新时间表
     *
     * 更新时间表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScheduleRequest 请求对象
     * @return AsyncInvoker<UpdateScheduleRequest, UpdateScheduleResponse>
     */
    public AsyncInvoker<UpdateScheduleRequest, UpdateScheduleResponse> updateScheduleAsyncInvoker(
        UpdateScheduleRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.updateSchedule, hcClient);
    }

    /**
     * 创建安全报告模板
     *
     * 创建安全报告模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateReportProfileRequest 请求对象
     * @return CompletableFuture<CreateReportProfileResponse>
     */
    public CompletableFuture<CreateReportProfileResponse> createReportProfileAsync(CreateReportProfileRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.createReportProfile);
    }

    /**
     * 创建安全报告模板
     *
     * 创建安全报告模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateReportProfileRequest 请求对象
     * @return AsyncInvoker<CreateReportProfileRequest, CreateReportProfileResponse>
     */
    public AsyncInvoker<CreateReportProfileRequest, CreateReportProfileResponse> createReportProfileAsyncInvoker(
        CreateReportProfileRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.createReportProfile, hcClient);
    }

    /**
     * 删除安全报告模板
     *
     * 删除安全报告模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteReportProfileRequest 请求对象
     * @return CompletableFuture<DeleteReportProfileResponse>
     */
    public CompletableFuture<DeleteReportProfileResponse> deleteReportProfileAsync(DeleteReportProfileRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.deleteReportProfile);
    }

    /**
     * 删除安全报告模板
     *
     * 删除安全报告模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteReportProfileRequest 请求对象
     * @return AsyncInvoker<DeleteReportProfileRequest, DeleteReportProfileResponse>
     */
    public AsyncInvoker<DeleteReportProfileRequest, DeleteReportProfileResponse> deleteReportProfileAsyncInvoker(
        DeleteReportProfileRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.deleteReportProfile, hcClient);
    }

    /**
     * 查询安全报告发送历史
     *
     * 查询安全报告发送历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListReportHistoryRequest 请求对象
     * @return CompletableFuture<ListReportHistoryResponse>
     */
    public CompletableFuture<ListReportHistoryResponse> listReportHistoryAsync(ListReportHistoryRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listReportHistory);
    }

    /**
     * 查询安全报告发送历史
     *
     * 查询安全报告发送历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListReportHistoryRequest 请求对象
     * @return AsyncInvoker<ListReportHistoryRequest, ListReportHistoryResponse>
     */
    public AsyncInvoker<ListReportHistoryRequest, ListReportHistoryResponse> listReportHistoryAsyncInvoker(
        ListReportHistoryRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listReportHistory, hcClient);
    }

    /**
     * 查询安全报告模板列表
     *
     * 查询安全报告模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListReportProfilesRequest 请求对象
     * @return CompletableFuture<ListReportProfilesResponse>
     */
    public CompletableFuture<ListReportProfilesResponse> listReportProfilesAsync(ListReportProfilesRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listReportProfiles);
    }

    /**
     * 查询安全报告模板列表
     *
     * 查询安全报告模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListReportProfilesRequest 请求对象
     * @return AsyncInvoker<ListReportProfilesRequest, ListReportProfilesResponse>
     */
    public AsyncInvoker<ListReportProfilesRequest, ListReportProfilesResponse> listReportProfilesAsyncInvoker(
        ListReportProfilesRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listReportProfiles, hcClient);
    }

    /**
     * 查询安全报告
     *
     * 查询安全报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFirewallReportRequest 请求对象
     * @return CompletableFuture<ShowFirewallReportResponse>
     */
    public CompletableFuture<ShowFirewallReportResponse> showFirewallReportAsync(ShowFirewallReportRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.showFirewallReport);
    }

    /**
     * 查询安全报告
     *
     * 查询安全报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFirewallReportRequest 请求对象
     * @return AsyncInvoker<ShowFirewallReportRequest, ShowFirewallReportResponse>
     */
    public AsyncInvoker<ShowFirewallReportRequest, ShowFirewallReportResponse> showFirewallReportAsyncInvoker(
        ShowFirewallReportRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.showFirewallReport, hcClient);
    }

    /**
     * 获取安全报告模板
     *
     * 获取安全报告模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReportProfileRequest 请求对象
     * @return CompletableFuture<ShowReportProfileResponse>
     */
    public CompletableFuture<ShowReportProfileResponse> showReportProfileAsync(ShowReportProfileRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.showReportProfile);
    }

    /**
     * 获取安全报告模板
     *
     * 获取安全报告模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReportProfileRequest 请求对象
     * @return AsyncInvoker<ShowReportProfileRequest, ShowReportProfileResponse>
     */
    public AsyncInvoker<ShowReportProfileRequest, ShowReportProfileResponse> showReportProfileAsyncInvoker(
        ShowReportProfileRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.showReportProfile, hcClient);
    }

    /**
     * 更新安全报告模板
     *
     * 更新安全报告模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateReportProfileRequest 请求对象
     * @return CompletableFuture<UpdateReportProfileResponse>
     */
    public CompletableFuture<UpdateReportProfileResponse> updateReportProfileAsync(UpdateReportProfileRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.updateReportProfile);
    }

    /**
     * 更新安全报告模板
     *
     * 更新安全报告模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateReportProfileRequest 请求对象
     * @return AsyncInvoker<UpdateReportProfileRequest, UpdateReportProfileResponse>
     */
    public AsyncInvoker<UpdateReportProfileRequest, UpdateReportProfileResponse> updateReportProfileAsyncInvoker(
        UpdateReportProfileRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.updateReportProfile, hcClient);
    }

    /**
     * 新建服务成员
     *
     * 批量添加服务组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddServiceItemsRequest 请求对象
     * @return CompletableFuture<AddServiceItemsResponse>
     */
    public CompletableFuture<AddServiceItemsResponse> addServiceItemsAsync(AddServiceItemsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.addServiceItems);
    }

    /**
     * 新建服务成员
     *
     * 批量添加服务组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddServiceItemsRequest 请求对象
     * @return AsyncInvoker<AddServiceItemsRequest, AddServiceItemsResponse>
     */
    public AsyncInvoker<AddServiceItemsRequest, AddServiceItemsResponse> addServiceItemsAsyncInvoker(
        AddServiceItemsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.addServiceItems, hcClient);
    }

    /**
     * 新建服务组
     *
     * 创建服务组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddServiceSetRequest 请求对象
     * @return CompletableFuture<AddServiceSetResponse>
     */
    public CompletableFuture<AddServiceSetResponse> addServiceSetAsync(AddServiceSetRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.addServiceSet);
    }

    /**
     * 新建服务组
     *
     * 创建服务组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddServiceSetRequest 请求对象
     * @return AsyncInvoker<AddServiceSetRequest, AddServiceSetResponse>
     */
    public AsyncInvoker<AddServiceSetRequest, AddServiceSetResponse> addServiceSetAsyncInvoker(
        AddServiceSetRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.addServiceSet, hcClient);
    }

    /**
     * 批量删除服务组成员信息
     *
     * 批量删除服务组成员信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteServiceItemsRequest 请求对象
     * @return CompletableFuture<BatchDeleteServiceItemsResponse>
     */
    public CompletableFuture<BatchDeleteServiceItemsResponse> batchDeleteServiceItemsAsync(
        BatchDeleteServiceItemsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.batchDeleteServiceItems);
    }

    /**
     * 批量删除服务组成员信息
     *
     * 批量删除服务组成员信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteServiceItemsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteServiceItemsRequest, BatchDeleteServiceItemsResponse>
     */
    public AsyncInvoker<BatchDeleteServiceItemsRequest, BatchDeleteServiceItemsResponse> batchDeleteServiceItemsAsyncInvoker(
        BatchDeleteServiceItemsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.batchDeleteServiceItems, hcClient);
    }

    /**
     * 批量删除服务组
     *
     * 批量删除服务组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteServiceSetsRequest 请求对象
     * @return CompletableFuture<BatchDeleteServiceSetsResponse>
     */
    public CompletableFuture<BatchDeleteServiceSetsResponse> batchDeleteServiceSetsAsync(
        BatchDeleteServiceSetsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.batchDeleteServiceSets);
    }

    /**
     * 批量删除服务组
     *
     * 批量删除服务组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteServiceSetsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteServiceSetsRequest, BatchDeleteServiceSetsResponse>
     */
    public AsyncInvoker<BatchDeleteServiceSetsRequest, BatchDeleteServiceSetsResponse> batchDeleteServiceSetsAsyncInvoker(
        BatchDeleteServiceSetsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.batchDeleteServiceSets, hcClient);
    }

    /**
     * 删除服务组成员
     *
     * 删除服务组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServiceItemRequest 请求对象
     * @return CompletableFuture<DeleteServiceItemResponse>
     */
    public CompletableFuture<DeleteServiceItemResponse> deleteServiceItemAsync(DeleteServiceItemRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.deleteServiceItem);
    }

    /**
     * 删除服务组成员
     *
     * 删除服务组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServiceItemRequest 请求对象
     * @return AsyncInvoker<DeleteServiceItemRequest, DeleteServiceItemResponse>
     */
    public AsyncInvoker<DeleteServiceItemRequest, DeleteServiceItemResponse> deleteServiceItemAsyncInvoker(
        DeleteServiceItemRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.deleteServiceItem, hcClient);
    }

    /**
     * 删除服务组
     *
     * 删除服务组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServiceSetRequest 请求对象
     * @return CompletableFuture<DeleteServiceSetResponse>
     */
    public CompletableFuture<DeleteServiceSetResponse> deleteServiceSetAsync(DeleteServiceSetRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.deleteServiceSet);
    }

    /**
     * 删除服务组
     *
     * 删除服务组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServiceSetRequest 请求对象
     * @return AsyncInvoker<DeleteServiceSetRequest, DeleteServiceSetResponse>
     */
    public AsyncInvoker<DeleteServiceSetRequest, DeleteServiceSetResponse> deleteServiceSetAsyncInvoker(
        DeleteServiceSetRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.deleteServiceSet, hcClient);
    }

    /**
     * 查询服务成员列表
     *
     * 查询服务组成员列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServiceItemsRequest 请求对象
     * @return CompletableFuture<ListServiceItemsResponse>
     */
    public CompletableFuture<ListServiceItemsResponse> listServiceItemsAsync(ListServiceItemsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listServiceItems);
    }

    /**
     * 查询服务成员列表
     *
     * 查询服务组成员列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServiceItemsRequest 请求对象
     * @return AsyncInvoker<ListServiceItemsRequest, ListServiceItemsResponse>
     */
    public AsyncInvoker<ListServiceItemsRequest, ListServiceItemsResponse> listServiceItemsAsyncInvoker(
        ListServiceItemsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listServiceItems, hcClient);
    }

    /**
     * 查询服务组详情
     *
     * 查询服务组细节
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServiceSetDetailRequest 请求对象
     * @return CompletableFuture<ListServiceSetDetailResponse>
     */
    public CompletableFuture<ListServiceSetDetailResponse> listServiceSetDetailAsync(
        ListServiceSetDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listServiceSetDetail);
    }

    /**
     * 查询服务组详情
     *
     * 查询服务组细节
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServiceSetDetailRequest 请求对象
     * @return AsyncInvoker<ListServiceSetDetailRequest, ListServiceSetDetailResponse>
     */
    public AsyncInvoker<ListServiceSetDetailRequest, ListServiceSetDetailResponse> listServiceSetDetailAsyncInvoker(
        ListServiceSetDetailRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listServiceSetDetail, hcClient);
    }

    /**
     * 获取服务组列表
     *
     * 获取服务组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServiceSetsRequest 请求对象
     * @return CompletableFuture<ListServiceSetsResponse>
     */
    public CompletableFuture<ListServiceSetsResponse> listServiceSetsAsync(ListServiceSetsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listServiceSets);
    }

    /**
     * 获取服务组列表
     *
     * 获取服务组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServiceSetsRequest 请求对象
     * @return AsyncInvoker<ListServiceSetsRequest, ListServiceSetsResponse>
     */
    public AsyncInvoker<ListServiceSetsRequest, ListServiceSetsResponse> listServiceSetsAsyncInvoker(
        ListServiceSetsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listServiceSets, hcClient);
    }

    /**
     * 修改服务组
     *
     * 更新服务组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateServiceSetRequest 请求对象
     * @return CompletableFuture<UpdateServiceSetResponse>
     */
    public CompletableFuture<UpdateServiceSetResponse> updateServiceSetAsync(UpdateServiceSetRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.updateServiceSet);
    }

    /**
     * 修改服务组
     *
     * 更新服务组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateServiceSetRequest 请求对象
     * @return AsyncInvoker<UpdateServiceSetRequest, UpdateServiceSetResponse>
     */
    public AsyncInvoker<UpdateServiceSetRequest, UpdateServiceSetResponse> updateServiceSetAsyncInvoker(
        UpdateServiceSetRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.updateServiceSet, hcClient);
    }

    /**
     * 创建私网网段
     *
     * 添加私网网段的接口，添加私网网段后该网段的流量将引流到VPC防火墙防护
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreatePrivateNetworkSegmentsRequest 请求对象
     * @return CompletableFuture<BatchCreatePrivateNetworkSegmentsResponse>
     */
    public CompletableFuture<BatchCreatePrivateNetworkSegmentsResponse> batchCreatePrivateNetworkSegmentsAsync(
        BatchCreatePrivateNetworkSegmentsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.batchCreatePrivateNetworkSegments);
    }

    /**
     * 创建私网网段
     *
     * 添加私网网段的接口，添加私网网段后该网段的流量将引流到VPC防火墙防护
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreatePrivateNetworkSegmentsRequest 请求对象
     * @return AsyncInvoker<BatchCreatePrivateNetworkSegmentsRequest, BatchCreatePrivateNetworkSegmentsResponse>
     */
    public AsyncInvoker<BatchCreatePrivateNetworkSegmentsRequest, BatchCreatePrivateNetworkSegmentsResponse> batchCreatePrivateNetworkSegmentsAsyncInvoker(
        BatchCreatePrivateNetworkSegmentsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.batchCreatePrivateNetworkSegments, hcClient);
    }

    /**
     * 删除私网网段信息
     *
     * 删除私网网段的接口，根据用户输入的私网网段conf_id，删除对应ID的私网网段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeletePrivateNetworkSegmentsRequest 请求对象
     * @return CompletableFuture<BatchDeletePrivateNetworkSegmentsResponse>
     */
    public CompletableFuture<BatchDeletePrivateNetworkSegmentsResponse> batchDeletePrivateNetworkSegmentsAsync(
        BatchDeletePrivateNetworkSegmentsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.batchDeletePrivateNetworkSegments);
    }

    /**
     * 删除私网网段信息
     *
     * 删除私网网段的接口，根据用户输入的私网网段conf_id，删除对应ID的私网网段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeletePrivateNetworkSegmentsRequest 请求对象
     * @return AsyncInvoker<BatchDeletePrivateNetworkSegmentsRequest, BatchDeletePrivateNetworkSegmentsResponse>
     */
    public AsyncInvoker<BatchDeletePrivateNetworkSegmentsRequest, BatchDeletePrivateNetworkSegmentsResponse> batchDeletePrivateNetworkSegmentsAsyncInvoker(
        BatchDeletePrivateNetworkSegmentsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.batchDeletePrivateNetworkSegments, hcClient);
    }

    /**
     * 更新VPC间防火墙防护状态
     *
     * 更新VPC间防火墙防护状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeEastWestFirewallStatusRequest 请求对象
     * @return CompletableFuture<ChangeEastWestFirewallStatusResponse>
     */
    public CompletableFuture<ChangeEastWestFirewallStatusResponse> changeEastWestFirewallStatusAsync(
        ChangeEastWestFirewallStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.changeEastWestFirewallStatus);
    }

    /**
     * 更新VPC间防火墙防护状态
     *
     * 更新VPC间防火墙防护状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeEastWestFirewallStatusRequest 请求对象
     * @return AsyncInvoker<ChangeEastWestFirewallStatusRequest, ChangeEastWestFirewallStatusResponse>
     */
    public AsyncInvoker<ChangeEastWestFirewallStatusRequest, ChangeEastWestFirewallStatusResponse> changeEastWestFirewallStatusAsyncInvoker(
        ChangeEastWestFirewallStatusRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.changeEastWestFirewallStatus, hcClient);
    }

    /**
     * 获取私网网段的信息
     *
     * 东西向私网网段查询接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPrivateNetworkSegmentsRequest 请求对象
     * @return CompletableFuture<ListPrivateNetworkSegmentsResponse>
     */
    public CompletableFuture<ListPrivateNetworkSegmentsResponse> listPrivateNetworkSegmentsAsync(
        ListPrivateNetworkSegmentsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listPrivateNetworkSegments);
    }

    /**
     * 获取私网网段的信息
     *
     * 东西向私网网段查询接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPrivateNetworkSegmentsRequest 请求对象
     * @return AsyncInvoker<ListPrivateNetworkSegmentsRequest, ListPrivateNetworkSegmentsResponse>
     */
    public AsyncInvoker<ListPrivateNetworkSegmentsRequest, ListPrivateNetworkSegmentsResponse> listPrivateNetworkSegmentsAsyncInvoker(
        ListPrivateNetworkSegmentsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listPrivateNetworkSegments, hcClient);
    }

    /**
     * 查询VPC间防火墙使用的企业路由器信息
     *
     * 查询VPC间防火墙使用的企业路由器信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEwAssociatedErRequest 请求对象
     * @return CompletableFuture<ShowEwAssociatedErResponse>
     */
    public CompletableFuture<ShowEwAssociatedErResponse> showEwAssociatedErAsync(ShowEwAssociatedErRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.showEwAssociatedEr);
    }

    /**
     * 查询VPC间防火墙使用的企业路由器信息
     *
     * 查询VPC间防火墙使用的企业路由器信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEwAssociatedErRequest 请求对象
     * @return AsyncInvoker<ShowEwAssociatedErRequest, ShowEwAssociatedErResponse>
     */
    public AsyncInvoker<ShowEwAssociatedErRequest, ShowEwAssociatedErResponse> showEwAssociatedErAsyncInvoker(
        ShowEwAssociatedErRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.showEwAssociatedEr, hcClient);
    }

    /**
     * 查询VPC边界防火墙使用的引流VPC信息
     *
     * 查询VPC边界防火墙使用的引流VPC信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEwAssociatedVpcRequest 请求对象
     * @return CompletableFuture<ShowEwAssociatedVpcResponse>
     */
    public CompletableFuture<ShowEwAssociatedVpcResponse> showEwAssociatedVpcAsync(ShowEwAssociatedVpcRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.showEwAssociatedVpc);
    }

    /**
     * 查询VPC边界防火墙使用的引流VPC信息
     *
     * 查询VPC边界防火墙使用的引流VPC信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEwAssociatedVpcRequest 请求对象
     * @return AsyncInvoker<ShowEwAssociatedVpcRequest, ShowEwAssociatedVpcResponse>
     */
    public AsyncInvoker<ShowEwAssociatedVpcRequest, ShowEwAssociatedVpcResponse> showEwAssociatedVpcAsyncInvoker(
        ShowEwAssociatedVpcRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.showEwAssociatedVpc, hcClient);
    }

    /**
     * 更新私网网段
     *
     * 更新私网网段的REST接口，主要特性：
     *  * 根据私网网段ID，更新对应的私网网段信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePrivateNetworkSegmentRequest 请求对象
     * @return CompletableFuture<UpdatePrivateNetworkSegmentResponse>
     */
    public CompletableFuture<UpdatePrivateNetworkSegmentResponse> updatePrivateNetworkSegmentAsync(
        UpdatePrivateNetworkSegmentRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.updatePrivateNetworkSegment);
    }

    /**
     * 更新私网网段
     *
     * 更新私网网段的REST接口，主要特性：
     *  * 根据私网网段ID，更新对应的私网网段信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePrivateNetworkSegmentRequest 请求对象
     * @return AsyncInvoker<UpdatePrivateNetworkSegmentRequest, UpdatePrivateNetworkSegmentResponse>
     */
    public AsyncInvoker<UpdatePrivateNetworkSegmentRequest, UpdatePrivateNetworkSegmentResponse> updatePrivateNetworkSegmentAsyncInvoker(
        UpdatePrivateNetworkSegmentRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.updatePrivateNetworkSegment, hcClient);
    }

}
