Public class JsonParsing {
    
    //Defining the multibureau object based list for caputing all the fields.
    
    
    String dateInStringString,dateClosedInStringString;
    String MM; 
    String DD;
    String YYYY;
  Date DateProceed;
    Integer tempnoofrepay;
    integer writtenOffSettledStatus;
    /*change01*/ Date Todaydate = Date.Today();
    string listaccType;
    public static List<Exception_Log__c> listOfExceptions = new List<Exception_Log__c>();
    static Integer totalTradelines_6M=0;
    static Decimal sum_of_sanctioned_amt_active_loans=0;
    public static list<Aggregatory_Object__c> agglst = new list<Aggregatory_Object__c>();
    
    public class Temp3MDPD
    {
        public Integer DPD1M { get; set; }
        public Integer DPD2M { get; set; }
        public Integer DPD3M { get; set; }
        public Integer DPD4M { get; set; }
        public Date PaymentHisStart { get; set; }
    }
    Public class Returnlist
    {
        Public Integer FinalIScore;
        Public Decimal glhighamount;
        Public Decimal Last_3M_DPD_Count;
        Public Decimal CC_HighestOverdue;
        Public Decimal CC_No_of_Write_Offs_in_24M;
        Public Decimal No_of_Write_Offs_in_24M;
        Public Decimal No_of_Write_Offs_in_12M;
        public Integer SecondaryCount;
        public Date Date_of_Last_Payment;
        public Date Date_Closed;
        public String Written_Off_And_Settled_Status;
        public Decimal Overdue_Amount;
        public Decimal ccIndebtedness;
        public Set<String> panlist;
        public Decimal plAmount;
        Public Decimal alAmount;
        public Decimal ccAmount;
        Public Decimal hlAmount;
        Public Decimal lapAmount;
        Public Decimal twAmount;
        Public Decimal blAmount;
        Public Decimal clAmount;
        Public Decimal liveCL;
        Public Decimal livePL;
        Public Decimal liveBL;
        Public Decimal plenquiries;
        Public Decimal clenquiries; 
        Public Decimal plavailed;
        Public string custCategory;
        Public String subCategory;
        Public Decimal liveloans;
        Public Decimal maxOD24mnths;
        Public Decimal DPD3M;
        Public Decimal DPD6M;
        Public Decimal DPD3Count;
        Public Decimal DPD6Count;
        Public Decimal DPD9Count;
        Public Decimal DPD12Count;
        Public Decimal DPD18Count;
        Public Decimal DPD24Count;
        Public Decimal DPD36Count;
        Public Decimal DPD12woutdtCount;
        public Decimal DPD9M;
        public Decimal DPD12M;
        public Decimal DPD18M;
        public Decimal DPD24M;
        public Decimal DPD36M;
        public Decimal rating;
        public Boolean payhis;
        public Decimal totunsecureLoans, No_LIVE_USL_SANC_MORE_THAN_20K,countPl3M;
        public Decimal totunsecureLoansMSME, SMA_SUB_DBT_LSS_Count_in_L36M;
        public Decimal totenqLast3M,totenqLast6M;
        Public Decimal maxODCC;
        Public Decimal unsecFOIR;
        Public Decimal sumPL;
        Public Decimal sumBL;
        Public Decimal sumAL;
        Public Decimal sumHL;
        Public Decimal sumCL;
        Public Decimal sumCC;
        Public Decimal sumLAP;
        Public Decimal sumTW;
        Public Decimal sumEL;
        Public Decimal sumGL;
        Public Decimal minCC;
        Public Decimal maxCC;
        Public Decimal minCL;
        Public Decimal maxCL;
        Public Decimal minPL;
        Public Decimal maxPL;
        Public Decimal minAL;
        Public Decimal maxAL;
        Public Decimal minBL;
        Public Decimal maxBL;
        Public Decimal minHL;
        Public Decimal maxHL;
        Public Decimal minGL;
        Public Decimal maxGL;
        Public Decimal minEL;
        Public Decimal maxEL;
        Public Decimal minTW;
        Public Decimal maxTW;
        Public Decimal minLAP;
        Public Decimal maxLAP;
        Public String ccFlag;
        Public Decimal newestLoan;
        Public Decimal oldestLoan;
        Public Decimal unsec1M;
        Public Decimal unsec2M;
        Public Decimal unsec3M;
        Public Decimal unsec6M;
        Public Decimal unsec9M;
        Public Decimal unsec12M;
        Public Decimal unsec3MMSME, unsec6MMSME, SecAccTypeBureauMSME, closed_unsec_gt_20KMSME,sumOfSnctnAmtClosedLoans,maxSnctnAmtClosedLoans,diffSnctnCurrBalLiveLoans, maxMSMEBLVintage;
        Public Decimal ratioUnsec;
        Public String ALOwnStatus,customerProfile;
        Public String HLOwnStatus;
        Public String LAPOwnStatus;
        Public Decimal sumunsecLoanAmtin12M;
        Public Decimal nooftrades6M;
        Public Decimal SMA;
        Public Decimal STD; 
        Public Decimal SUB;
        Public Decimal DBT;
        Public Decimal LSS;
        Public Decimal XXX; 
        public Decimal NegCIBILStatusCount;
        Public Integer repaymentMonths,minrepaymentMonths;
        Public Decimal totSecLoans;
        Public Decimal totalNoofSecEnqinLast6M;
        Public Decimal totalNoofUnsecEnqinLast6M;
        Public Decimal totalNoofUnsecEnqinLast12M;
        Public Decimal noOfUnsecuredLoanInLast3M;
                Public Decimal noOfUnsecuredLoanInLast3MMSME;
        Public Decimal totalNoofUnsecEnqinLast1Months;
        Public Decimal totalNoofUnsecEnqinLast2Monthss;
        Public Decimal totalNoofUnsecEnqinLast3Months;
        Public Decimal totalNoofUnsecEnqinLast3MonthsMSME,No_of_USL_Enquiries_for_MSME_in_L1M;
        Public List<MultiBureau_PhoneList__c> mPhonelist;
        Public List<MultiBureau_AccountList__c> mbal;
        Public List<MultiBureau_ScoreList__c> mscrlist;
        Public List<MultiBureau_IdList__c> midlist;
        Public List<MultiBureau_AddressList__c> mAddresslist;
        Public Decimal totSecLiveLoans;
        //Added by Nadeem 17-12-2018
        Public Decimal DPD3woutdtCount; 
        Public Decimal DPD6woutdtCount; 
        Public Decimal DPD9woutdtCount; 
        Public Decimal DPD18woutdtCount; 
        Public Decimal DPD24woutdtCount; 
        Public Decimal DPD36woutdtCount; 
        Public Decimal DPD1MWtDt; 
        Public Decimal DPD3MWtDt; 
        Public Decimal DPD6MWtDt; 
        Public Decimal DPD9MWtDt; 
        Public Decimal DPD12MWtDt; 
        Public Decimal DPD18MWtDt; 
        Public Decimal DPD24MWtDt;
        Public Decimal DPD36MWtDt; 
        Public Decimal DPD3_30CountWtDt; 
        Public Decimal DPD6_30CountWtDt; 
        Public Decimal DPD9_30CountWtDt; 
        Public Decimal DPD12_30CountWtDt; 
        Public Decimal DPD18_30CountWtDt; 
        Public Decimal DPD24_30CountWtDt; 
        Public Decimal DPD12_90CountWtDt;
        Public Decimal DPD24_90CountWtDt;
        Public Decimal DPD36_90CountWtDt;
        Public Decimal DPD36_90CountWtDt1; 
        Public Decimal DPD36_90CountWtDt2;
        Public Decimal ODBalCIBIL1;
        Public Decimal ODBalCIBIL2;   
        Public Decimal No_of_Write_Offs_in_18M;
        Public Decimal maxOD12mnths;
        Public Decimal totUnsecloans,Sum_of_Sanc_Amt_of_other_unsecured_tradl,No_of_other_unsecured_tradelines_act,Sum_of_Curr_bal_for_all_other_unsecured,Sum_of_Sanction_Amt_of_all_Act_Mortg_HL,Sum_of_CurBal_for_all_Act_Mortg_HL,No_of_Active_Mortgages_HL,Sum_of_high_Sanction_Amount_credit_limi,Sum_of_Current_balance_for_all_Active_CC,No_of_Active_CC,Sum_of_Sanction_Amount_of_all_Active_PL,No_of_Active_PL,Sum_of_Sanction_Amount_of_all_Acti_CL_CD,Sum_of_Current_balance_for_all_Active_PL,Sum_of_Current_balance_for_all_Active_CL,No_of_Active_CL ;
        //added for income model
        Public List<MultiBureau_enquirylist__c> mbEnqlist;
        Public List<Multibureau_Data__c> mbd;
        Public List<Multibureau_Data__c> multibureau;
        public decimal Total_EMI_Amount;
        public decimal Total_EMI_Loan_Count;
        public decimal Total_Credit_Cards_Accounts;
        public decimal Indebtedness_as_per_CIBIL;
        public decimal Indebtedness_of_Curr_PersonalUnsecure;
        Public Decimal Indebtedness_as_per_Bureau;
    Public Decimal Total_Accounts_as_per_CIBIL;
        Public Decimal clenquiries3;
        Public Decimal SMASUBDBTLSS;
        Public Decimal SMASUBDBTLSS24;
        Public Decimal plenquiries12;
        Public Decimal TotalLiveLoans;
        public Decimal max_cc_utilization,closedLoans, MAX_CC_OD_UTILIZATION;
        public Decimal sum_BL_CL_EL_PL_TW;
        public Decimal unsecuredLiveLoansAvailed3M;
        public Decimal unsecuredLiveLoansAvailed6M;
        public Decimal unsecuredLiveLoansAvailed12M;
        public Decimal no_of_suit_filed;
        public decimal no_of_Closed_CC;
        Public String mbacbl;
        public string CIBIL_version;
        Public Decimal DPD3PL;
        Public Decimal DPD6PL;
        Public Decimal DPD12PL;
        Public Decimal DPD24PL;
        Public Decimal DPD36PLCC;
        Public Decimal DPD36All,totalRePayments24,totalRePayments12;
        Public Decimal DPD3PLlive;
        Public Decimal DPD6PLlive;
        Public Decimal DPD12PLlive;
        Public Decimal DPD24PLlive;
        Public Decimal highest3DPDtradeline;
        Public Decimal highest6DPDtradeline;
        Public Decimal highest12DPDtradeline;
        Public Decimal highest24DPDtradeline;
        Public Decimal highest3DPDloan;
        Public Decimal highest6DPDloan;
        Public Decimal highest12DPDloan,ROI_exp,Pl_currentBal,Pl_tradeline,delinquentexp;        
        Public Decimal highest24DPDloan;
        Public Decimal newTradelinesLast6Months;
        Public Decimal sum_of_sanctioned_amt,CC_enquiries_in_last_3_months,sum_of_total_sanctioned_amt;
        Public Decimal SMA24,SMA18,sma_lss_L24M,sub_dbt_L6M,currentBalance90DPD12M,WrittenOffAmountCC,Overdue_Balances_as_per_CIBIL,WrittenOffAmount;
        Public Boolean Only_Gold_Loan,Only_2_Wheeler,Only_Auto_Loan,Atleast_One_CC,Atleast_One_CL,Atleast_One_PL,Atleast_One_HL,greater10kflag,less10kflag;
        Public Decimal hl_repayment_max,pl_repayment_max,cc_repayment_max,hl_sanction_max,cc_sanction_max,cc_credit_max,cc_Currbal_max,pl_sanction_max,al_sanction_max,bl_sanction_max,twl_sanction_max,all_sanction_max,pl_Currbal_max;
        Public Date hl_date_close,pl_date_close,cc_date_close,al_date_close,bl_date_close,twl_date_close,all_date_close;
        Public string hl_acct_type,cc_acct_type,pl_acct_type,al_acct_type,bl_acct_type,twl_acct_type;
        public decimal ccoverdue=0; //faircent
        public decimal highdpdexcc,kccoverduebal,odoverduebal,kccodccoverdue,blonemonenq,plonemonenq,nopla50m3,nopla50m6,Countofloans_vinatage18to36;
        public decimal Overdue_CC_KCC_GL,DPD_L1M_EX_GL_CC_KCC_OVERDUE,DPD30Plus_L12M_EX_GL_CC_KCC,DPD60Plus_L18M_EX_GL_CC_KCC,Total_Obligation, No_of_suit_filed_Write_Off_36M, unsecuredLoansLS20KExclCCKCCGL_L3MCount;
    }
    Temp3MDPD Temp3MDPDobj = new Temp3MDPD();
    list <Temp3MDPD> Temp3MDPDlist = New list <Temp3MDPD>();
    // Parsing method all the multibureau information.
    public Returnlist parseJSONString(string jsonStr, string cid, string mid, Integer Flag, String Returnflag){ 
        Returnlist Re = new Returnlist();
        Integer FinalIScore;
        Integer Secondarycount;
        String IndiaLends,bureauCharacteristics ;
        list<String> strlist = new list<String>();
        String newlstAccType = ''; 
         string r1,r2,r3,r4,r5;//to store reason codes for soft pull
        boolean isONDCSoftPull =false;
        Set<String> panlist = new Set<String>();    
        list<Multibureau_Data__c> mbd = New list<Multibureau_Data__c>();
        list <MultiBureau_AccountList__c> MultiBureauAccountList = New list <MultiBureau_AccountList__c>();
        list <MultiBureau_AddressList__c> MultiBureauAddressList = New list <MultiBureau_AddressList__c>();
        list <MultiBureau_EnqActNoList__c> MultiBureauEnqActNoList = New list <MultiBureau_EnqActNoList__c>();
        list <MultiBureau_EnquiryList__c> MultiBureauEnquiryList = New list <MultiBureau_EnquiryList__c>();
        list <MultiBureau_IdList__c> MultiBureauIdList = New list <MultiBureau_IdList__c>();
        list <MultiBureau_PhoneList__c> MultiBureauPhoneList = New list <MultiBureau_PhoneList__c>();
        list <MultiBureau_EmploymentList__c> MultiBureauEmploylist = New list <MultiBureau_EmploymentList__c>();
        list <MultiBureau_ScoreList__c> MultiBureauScoreList = New list <MultiBureau_ScoreList__c>();
        //List object for Secondary Match...
        list <Multibureau_secondaryMatches__c> MultibureausecondaryMatcheslist = New list <Multibureau_secondaryMatches__c>();
        list <MultiBureau_IdList__c> MultiBureauSecIdList = New list <MultiBureau_IdList__c>();
        list <MultiBureau_PhoneList__c> MultiBureauSecPhoneList = New list <MultiBureau_PhoneList__c>();
        list <MultiBureau_AddressList__c> MultiBureauSecAddressList = New list <MultiBureau_AddressList__c>();
        
     
        
        integer loop1 = 0;
        
        Multibureau_Data__c Ml = new Multibureau_Data__c();
        //system.debug('mid ---' +mid);
        if (mid !=Null) {            
            describeSObjectResult describeResult = Multibureau_Data__c.getSObjectType().getDescribe();    
          List<String> fieldNames = new List<String>( describeResult.fields.getMap().keySet() );  
          String strquery =    ' SELECT ' + String.join( fieldNames, ',' ) +' FROM Multibureau_Data__c WHERE id = \'' + mid +'\'' ;       
          Ml = Database.query(strquery);
        } 
        //Ml.Id = Null;
        //Multibureau.add(Ml);
        //jsonStr = jsonStr.replace('JSON-RESPONSE-OBJECT', 'JSON_RESPONSE_OBJECT');
        Ml.PL_enquiries_in_last_3_months__c =0;
        Ml.PL_enquiries_in_last_6_months__c =0;
        Ml.PL_enquiries_in_last_9_months__c =0;
        Ml.PL_enquiries_in_last_12_months__c =0;
        Ml.Total_secured_enquiries_in_last_6_months__c =0;
        system.debug('jsonStr### :' + jsonStr);
        try{
        If (jsonStr !=Null) {
            //system.debug('inside if condition :');
            // Parse entire JSON response.
            JSONParser parser = JSON.createParser(jsonStr);
            while (parser.nextToken() != null) {
                // Start at the array of Header.
                loop1 = loop1 + 1;
                //system.debug('Loop count:' + loop1);
                //system.debug(parser.getCurrentToken());
                //system.debug(parser.getCurrentName());
                // Start at the array of Header.
                if ((parser.getCurrentToken() == JSONToken.START_OBJECT && (parser.getCurrentName() == 'JSON-RESPONSE-OBJECT' || parser.getCurrentName() == 'controlData')) || (parser.getCurrentToken() == JSONToken.START_OBJECT && Flag == 1)) {
                    if(Parser.getCurrentName()=='controlData') isONDCSoftPull=true;
                    while (parser.nextToken() != null) {
                        // Start at the array of Header.
                        loop1 = loop1 + 1;
                        //system.debug('Loop count:' + loop1);
                        //system.debug(parser.getCurrentToken());
                        //system.debug(parser.getCurrentName());
                        // Start at the array of Header.
                        if (parser.getCurrentToken() == JSONToken.START_OBJECT && (parser.getCurrentName() == 'header' ||parser.getCurrentName() == 'tuefHeader')) {
                            
                            while (parser.nextToken() != null  && parser.getCurrentToken() !=JSONToken.END_OBJECT) {
                                if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                    (parser.getText() == 'Version')) {
                                        // Get the value.
                                        parser.nextToken();
                                        Ml.Version__c = Double.valueof(parser.getText());
                                    }
                                if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                    (parser.getText() == 'memberReferenceNumber' || parser.getText() == 'memberRefNo')) {
                                        // Get the value.
                                        parser.nextToken();
                                        Ml.MemberReferenceNumber__c = parser.getText();
                                    }
                                if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                    (parser.getText() == 'enquiryMemberUserID')) {
                                        // Get the value.
                                        parser.nextToken();
                                        Ml.Enquiry_Member_User_ID__c = parser.getText();
                                    }
                                if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                    (parser.getText() == 'subjectReturnCode')) {
                                        // Get the value.
                                        parser.nextToken();
                                        Ml.Subject_Return_Code__c = Double.valueof(parser.getText());
                                    }
                                if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                    (parser.getText() == 'enquiryControlNumber')) {
                                        // Get the value.
                                        parser.nextToken();
                                        Ml.Enquiry_Control_Number__c = Double.valueof(parser.getText());
                                    }    
                                if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                    (parser.getText() == 'dateProceed' || parser.getText() == 'dateProcessed')) {
                                        // Get the value.
                                        parser.nextToken();
                                        dateInStringString = parser.getText();
                                        //system.debug('dateInStringString ' +dateInStringString );
                                        if(dateInStringString != Null){ 
                                            MM = dateInStringString.substring(2, 4); 
                                            DD = dateInStringString.substring(0, 2);
                                            YYYY = dateInStringString.substring(4, 8);
                                            Ml.Date_Proceed__c = Date.newInstance(integer.valueOf(YYYY),integer.valueOf(MM),integer.valueOf(DD));
                        DateProceed = Date.newInstance(integer.valueOf(YYYY),integer.valueOf(MM),integer.valueOf(DD));
                                            //system.debug('##dateInStringString - '+Ml.Date_Proceed__c);
                                        }
                                    } 
                                if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                    (parser.getText() == 'timeProceed'|| parser.getText() == 'timeProcessed')) {
                                        // Get the value.
                                        parser.nextToken();
                                        Ml.Time_Proceed__c = Integer.valueof(parser.getText());
                                    }               
                            }
                        }
                        // Start at the Object of Name.
                        if ((parser.getCurrentToken() == JSONToken.START_OBJECT && parser.getCurrentName() == 'Name')||(parser.getCurrentToken() == JSONToken.START_Array && parser.getCurrentName() == 'names')) {
                            
                            while (parser.nextToken() != null  && parser.getCurrentToken() !=JSONToken.END_OBJECT) {
                                if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                    (parser.getText() == 'name1'|| parser.getText() == 'name')) {
                                        // Get the value.
                                        parser.nextToken();
                                        Ml.Name_1__c  = parser.getText();
                                    }
                                if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                    (parser.getText() == 'name2')) {
                                        // Get the value.
                                        parser.nextToken();
                                        Ml.Name_2__c = parser.getText();
                                    }
                                if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                    (parser.getText() == 'name3')) {
                                        // Get the value.
                                        parser.nextToken();
                                        Ml.Name_3__c = parser.getText();
                                    }
                                if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                    (parser.getText() == 'name4')) {
                                        // Get the value.
                                        parser.nextToken();
                                        Ml.Name_4__c = parser.getText();
                                    }
                                if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                    (parser.getText() == 'name5')) {
                                        // Get the value.
                                        parser.nextToken();
                                        Ml.Name_5__c = parser.getText();
                                    }
                                if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                    (parser.getText() == 'Dob'|| parser.getText() == 'birthDate')) {
                                        // Get the value.
                                        parser.nextToken();
                                        dateInStringString = parser.getText();
                                        if(dateInStringString != Null) { 
                                            MM = dateInStringString.substring(2, 4); 
                                            DD = dateInStringString.substring(0, 2);
                                            YYYY = dateInStringString.substring(4, 8);
                                            Ml.Dob__c  = Date.newInstance(integer.valueOf(YYYY),integer.valueOf(MM),integer.valueOf(DD));
                                            //system.debug('##dateInStringString - '+Ml.Dob__c);
                                        }
                                    } 
                                if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                    (parser.getText() == 'Gender')) {
                                        // Get the value.
                                        parser.nextToken();
                                        Ml.Gender__c = parser.getText();
                                    }
                                if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                    (parser.getText() == 'dateOfEntryForErrorCode')) {
                                        // Get the value.
                                        parser.nextToken();
                                        dateInStringString = parser.getText();
                                        if(dateInStringString != Null) { 
                                            MM = dateInStringString.substring(2, 4); 
                                            DD = dateInStringString.substring(0, 2);
                                            YYYY = dateInStringString.substring(4, 8);
                                            Ml.Date_of_Entry_for_Error_Code__c  = Date.newInstance(integer.valueOf(YYYY),integer.valueOf(MM),integer.valueOf(DD));
                                            //system.debug('##dateInStringString - '+Ml.Date_of_Entry_for_Error_Code__c);
                                        }
                                    } 
                                if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                    (parser.getText() == 'errorSegmentTag')) {
                                        // Get the value.
                                        parser.nextToken();
                                        Ml.Error_Segment_Tag__c = parser.getText();
                                    }
                                if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                    (parser.getText() == 'errorCode')) {
                                        // Get the value.
                                        parser.nextToken();
                                        Ml.Error_Code__c = Double.valueof(parser.getText());
                                    }    
                                if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                    (parser.getText() == 'dateOfEntryForCibilRemarksCode')) {
                                        // Get the value.
                                        parser.nextToken();
                                        dateInStringString = parser.getText();
                                        if(dateInStringString != Null) { 
                                            MM = dateInStringString.substring(2, 4); 
                                            DD = dateInStringString.substring(0, 2);
                                            YYYY = dateInStringString.substring(4, 8);
                                            Ml.Date_of_Entry_For_Cibil_Remarks_Code__c = Date.newInstance(integer.valueOf(YYYY),integer.valueOf(MM),integer.valueOf(DD));
                                            //system.debug('##dateInStringString - '+Ml.Date_of_Entry_For_Cibil_Remarks_Code__c);
                                        }
                                        
                                    } 
                                if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                    (parser.getText() == 'cibilRemarkCode')) {
                                        // Get the value.
                                        parser.nextToken();
                                        Ml.CIBIL_Remark_Code__c = parser.getText();
                                    }
                                if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                    (parser.getText() == 'dateOfEntryForErrorOrDisputeRemarkscode')) {
                                        // Get the value.
                                        parser.nextToken();
                                        dateInStringString = parser.getText();
                                        if(dateInStringString != Null) { 
                                            MM = dateInStringString.substring(2, 4); 
                                            DD = dateInStringString.substring(0, 2);
                                            YYYY = dateInStringString.substring(4, 8);
                                            Ml.DateOfEntryForErrorOrDisputeRemarksCode__c = Date.newInstance(integer.valueOf(YYYY),integer.valueOf(MM),integer.valueOf(DD));
                                            //system.debug('##dateInStringString - '+Ml.DateOfEntryForErrorOrDisputeRemarksCode__c);
                                        }
                                    } 
                                if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                    (parser.getText() == 'errorOrDisputeRemarksCode1')) {
                                        // Get the value.
                                        parser.nextToken();
                                        Ml.Error_or_Dispute_Remarks_Code_1__c = parser.getText();
                                    }
                                if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                    (parser.getText() == 'errorOrDisputeRemarksCode2')) {
                                        // Get the value.
                                        parser.nextToken();
                                        Ml.Error_or_Dispute_Remarks_Code_2__c = parser.getText();
                                    }               
                            }
                        }
                        // Start at the array of Idlist.
                        if (parser.getCurrentToken() == JSONToken.START_ARRAY && (parser.getCurrentName() == 'idList' || parser.getCurrentName() == 'ids')) {
                            while (parser.nextToken() != null && parser.getCurrentToken() !=JSONToken.END_ARRAY) {
                                // Advance to the start object marker to
                                //  find next idList statement object.
                                //system.debug(parser.getCurrentToken());
                                //system.debug(parser.getCurrentName());
                                if (parser.getCurrentToken() == JSONToken.START_OBJECT) {        
                                    // Read entire idList object, including its array of line items.
                             // idList ilist = (idList)parser.readValueAs(idList.class);
                                    JsonParsingHelper.idList ilist = (JsonParsingHelper.idList)parser.readValueAs(JsonParsingHelper.idList.class);                                    // For debugging purposes, serialize again to verify what was parsed.
                                    MultiBureau_IdList__c Mil = new MultiBureau_IdList__c();
                                    Mil.Id_Type__c = ilist.IdType;
                                     if(ilist.idValue!=null)
                                     Mil.Id_Value__c = ilist.IdValue;
                                    else Mil.Id_Value__c= ilist.idNumber;                                        
                                    //Mil.Issue_Date__c = ilist.IssueDate;
                                    if(ilist.IdType=='01'){
                                        panlist.add(ilist.IdValue);
                                        //system.debug('pan id list :'+panlist);
                                    }
                                    
                                    dateInStringString = ilist.IssueDate;
                                    if(dateInStringString != Null) {  
                                        MM = dateInStringString.substring(2, 4); 
                                        DD = dateInStringString.substring(0, 2);
                                        YYYY = dateInStringString.substring(4, 8);
                                        Mil.Issue_Date__c = Date.newInstance(integer.valueOf(YYYY),integer.valueOf(MM),integer.valueOf(DD));
                                        //system.debug('##dateInStringString - '+Mil.Issue_Date__c );
                                    }
                                    dateInStringString = ilist.expiryDate;
                                    if(dateInStringString != Null) {
                                        MM = dateInStringString.substring(2, 4); 
                                        DD = dateInStringString.substring(0, 2);
                                        YYYY = dateInStringString.substring(4, 8);
                                        Mil.Expiry_Date__c = Date.newInstance(integer.valueOf(YYYY),integer.valueOf(MM),integer.valueOf(DD));
                                        //system.debug('##dateInStringString - '+Mil.Expiry_Date__c );
                                    }
                                    Mil.EnrichedThroughtEnquiry__c = ilist.EnrichedThroughtEnquiry;   
                                    
                                    MultiBureauIdList.add(Mil);
                                    String i = JSON.serialize(ilist);
                                    //system.debug('Serialized phoneList: ' + i);
                                    // Skip the child start array and start object markers.
                                    parser.skipChildren();
                                }
                            }
                        }
                         //Parse emails list for ONDC Softpull

                           if (parser.getCurrentToken() == JSONToken.START_ARRAY && parser.getCurrentName() == 'emails') {
                            while (parser.nextToken() != null && parser.getCurrentToken() !=JSONToken.END_ARRAY) {
                                if (parser.getCurrentToken() == JSONToken.START_OBJECT) { 
                                    JsonParsingHelper.emaillist elist = (JsonParsingHelper.emailList)parser.readValueAs(JsonParsingHelper.emailList.class);
                                    MultiBureau_IdList__c Mil = new MultiBureau_IdList__c();
                                    mil.Id_Type__c='EMAIL';
                                    Mil.Id_Value__c = elist.emailID;                                
                                    MultiBureauIdList.add(Mil);        
                                    parser.skipChildren();
                                }

                            }

                        }
                        // Start at the array of phonelist.
                        if (parser.getCurrentToken() == JSONToken.START_ARRAY && (parser.getCurrentName() == 'phoneList' || parser.getcurrentName()=='telephones'))  {
                            while (parser.nextToken() != null && parser.getCurrentToken() !=JSONToken.END_ARRAY) {
                                // Advance to the start object marker to
                                //  find next Addresslist statement object.
                                //system.debug(parser.getCurrentToken());
                                //system.debug(parser.getCurrentName());
                                if (parser.getCurrentToken() == JSONToken.START_OBJECT) {
                                    
                                    // Read entire phoneList object, including its array of line items.
                                    // phoneList pholist = (phoneList)parser.readValueAs(phoneList.class);
                                    JsonParsingHelper.phoneList pholist = (JsonParsingHelper.phoneList)parser.readValueAs(JsonParsingHelper.phoneList.class);
                                    //        //system.debug('Size of list items: ' + MBR.HEADER.size());
                                    // For debugging purposes, serialize again to verify what was parsed.
                                    MultiBureau_PhoneList__c Mpl = new MultiBureau_PhoneList__c();
                                    Mpl.Telephone_Number__c = pholist.TelephoneNumber;
                                    Mpl.Telephone_Extention__c = pholist.TelephoneExtention;
                                    Mpl.Telephone_Type__c = pholist.TelephoneType;
                                    Mpl.Enrich_Enquiry_For_Phone__c = pholist.EnrichEnquiryForPhone;   
                                    
                                    MultiBureauPhoneList.add(Mpl);
                                    
                                    String p = JSON.serialize(pholist);
                                    //system.debug('Serialized phoneList: ' + p);
                                    // Skip the child start array and start object markers.
                                    parser.skipChildren();
                                }
                            }
                        }
                        // Start at the array of employmentList.
                        //system.debug('Employementlist');
                        //system.debug(parser.getCurrentToken());
                        //system.debug(parser.getCurrentName());
                        MultiBureau_EmploymentList__c MEMP = new MultiBureau_EmploymentList__c();
                        if (parser.getCurrentToken() == JSONToken.START_ARRAY && (parser.getCurrentName() == 'employmentList'||parser.getCurrentName() == 'employment')) {
                            
                            while (parser.nextToken() != null  && parser.getCurrentToken() !=JSONToken.END_ARRAY) {
                                if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                    (parser.getText() == 'accountType')) {
                                        // Get the value.
                                        parser.nextToken();
                                        Ml.Account_Type__c  = parser.getText();
                                        MEMP.Account_Type__c = Ml.Account_Type__c;
                                    }
                                if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                    (parser.getText() == 'dateReported')) {
                                        // Get the value.
                                        parser.nextToken();
                                        dateInStringString = parser.getText();
                                        if(dateInStringString != Null) { 
                                            MM = dateInStringString.substring(2, 4); 
                                            DD = dateInStringString.substring(0, 2);
                                            YYYY = dateInStringString.substring(4, 8);
                                            Ml.Date_Reported__c  = Date.newInstance(integer.valueOf(YYYY),integer.valueOf(MM),integer.valueOf(DD));
                                            MEMP.Date_Reported__c = Ml.Date_Reported__c;
                                            //system.debug('##dateInStringString - '+Ml.Date_Reported__c);
                                        }
                                    } 
                                if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                    (parser.getText() == 'occupationCode')) {
                                        // Get the value.
                                        parser.nextToken();
                                        Ml.Occupation_Code__c = parser.getText();
                                         if (Ml.Occupation_Code__c!=null && Ml.Occupation_Code__c !='')MEMP.Occupation_Code__c = Decimal.valueOF(Ml.Occupation_Code__c);
                                    }
                                if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                    (parser.getText() == 'Income')) {
                                        // Get the value.
                                        parser.nextToken();
                                        Ml.Income__c = Integer.valueof(parser.getText());
                                        MEMP.Income__c=Ml.Income__c;
                                    }
                                if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                    (parser.getText() == 'netGrossIndicator')) {
                                        // Get the value.
                                        parser.nextToken();
                                        Ml.Net_Gross_Indicator__c = parser.getText();
                                        MEMP.Net_Gross_Indicator__c = Ml.Net_Gross_Indicator__c;
                                    }
                                if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                    (parser.getText() == 'monthlyAnnuallyIndicator')) {
                                        // Get the value.
                                        parser.nextToken();
                                        Ml.Monthly_Annually_Indicator__c = parser.getText();
                                        MEMP.Monthly_Annually_Indicator__c = Ml.Monthly_Annually_Indicator__c;
                                    }
                                if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                    (parser.getText() == 'dateOfEntryForErrorCode')) {
                                        // Get the value.
                                        parser.nextToken();
                                        dateInStringString = parser.getText();
                                        if(dateInStringString != Null) { 
                                            MM = dateInStringString.substring(2, 4); 
                                            DD = dateInStringString.substring(0, 2);
                                            YYYY = dateInStringString.substring(4, 8);
                                            Ml.Em_Date_of_Entry_for_Error_Code__c  = Date.newInstance(integer.valueOf(YYYY),integer.valueOf(MM),integer.valueOf(DD));
                                            MEMP.Em_Date_of_Entry_for_Error_Code__c = Ml.Em_Date_of_Entry_for_Error_Code__c;
                                            //system.debug('##dateInStringString - '+Ml.Em_Date_of_Entry_for_Error_Code__c);
                                        }
                                    } 
                                if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                    (parser.getText() == 'errorCode')) {
                                        // Get the value.
                                        parser.nextToken();
                                        Ml.Em_Error_Code__c = double.valueof(parser.getText());
                                        MEMP.Em_Error_Code__c = Ml.Em_Error_Code__c;
                                    }
                                if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                    (parser.getText() == 'dateOfEntryForCibilRemarksCode')) {
                                        // Get the value.
                                        parser.nextToken();
                                        dateInStringString = parser.getText();
                                        if(dateInStringString != Null) { 
                                            MM = dateInStringString.substring(2, 4); 
                                            DD = dateInStringString.substring(0, 2);
                                            YYYY = dateInStringString.substring(4, 8);
                                            Ml.Em_Date_of_Entry_For_Cibil_Remarks_Code__c  = Date.newInstance(integer.valueOf(YYYY),integer.valueOf(MM),integer.valueOf(DD));
                                            MEMP.Em_Date_of_Entry_For_Bureau_Remarks_Code__c=Ml.Em_Date_of_Entry_For_Cibil_Remarks_Code__c;
                                            //system.debug('##dateInStringString - '+Ml.Em_Date_of_Entry_For_Cibil_Remarks_Code__c);
                                        }
                                    } 
                                if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                    (parser.getText() == 'cibilRemarkCode')) {
                                        // Get the value.
                                        parser.nextToken();
                                        Ml.Em_CIBIL_Remark_Code__c = parser.getText();
                                        MEMP.Em_Bureau_Remark_Code__c=Ml.Em_CIBIL_Remark_Code__c;
                                    }
                                if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                    (parser.getText() == 'dateOfEntryForErrorOrDisputeRemarksCode')) {
                                        // Get the value.
                                        parser.nextToken();
                                        dateInStringString = parser.getText();
                                        if(dateInStringString != Null) { 
                                            MM = dateInStringString.substring(2, 4); 
                                            DD = dateInStringString.substring(0, 2);
                                            YYYY = dateInStringString.substring(4, 8);
                                            Ml.Em_DOEForErrorOrDisputeRemarksCode__c  = Date.newInstance(integer.valueOf(YYYY),integer.valueOf(MM),integer.valueOf(DD));
                                            MEMP.Em_DOEForErrorOrDisputeRemarksCode__c=Ml.Em_DOEForErrorOrDisputeRemarksCode__c;
                                            //system.debug('##dateInStringString - '+Ml.Em_DOEForErrorOrDisputeRemarksCode__c);
                                        }
                                    } 
                                if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                    (parser.getText() == 'errorOrDisputeRemarksCode1')) {
                                        // Get the value.
                                        parser.nextToken();
                                        Ml.Em_Error_or_Dispute_Remarks_Code_1__c = parser.getText();
                                        MEMP.Em_Error_or_Dispute_Remarks_Code_1__c=Ml.Em_Error_or_Dispute_Remarks_Code_1__c;
                                    }
                                if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                    (parser.getText() == 'errorOrDisputeRemarksCode2')) {
                                        // Get the value.
                                        parser.nextToken();
                                        Ml.Em_Error_or_Dispute_Remarks_Code_2__c = parser.getText();
                                        MEMP.Em_Error_or_Dispute_Remarks_Code_2__c=Ml.Em_Error_or_Dispute_Remarks_Code_2__c;
                                    }             
                            }
                            if (MEMP !=null && MEMP!=null) MultiBureauEmploylist.add(MEMP);
                        }
                        if (parser.getCurrentToken() == JSONToken.START_ARRAY && parser.getCurrentName() == 'enqActNoList') {
                            while (parser.nextToken() != null && parser.getCurrentToken() !=JSONToken.END_ARRAY) {
                                // Advance to the start object marker to
                                //  find next enqActNoList statement object.
                                //system.debug(parser.getCurrentToken());
                                //system.debug(parser.getCurrentName());
                                if (parser.getCurrentToken() == JSONToken.START_OBJECT) {        
                                    // Read entire enqActNoList object, including its array of line items.
                                    enqActNoList eanlist = (enqActNoList)parser.readValueAs(enqActNoList.class);
                                    // For debugging purposes, serialize again to verify what was parsed.
                                    MultiBureau_enqActNoList__c Mel = new MultiBureau_enqActNoList__c();
                                    Mel.Account_Number__c = eanlist.AccountNumber;
                                    MultiBureauEnqActNoList.add(Mel);
                                    String e = JSON.serialize(eanlist);
                                    //system.debug('Serialized phoneList: ' + e);
                                    // Skip the child start array and start object markers.
                                    parser.skipChildren();
                                }
                            }
                        }
                        if (parser.getCurrentToken() == JSONToken.START_ARRAY && (parser.getCurrentName() == 'scoreList' ||parser.getCurrentName() == 'scores')) {
                            while (parser.nextToken() != null && parser.getCurrentToken() !=JSONToken.END_ARRAY) {
                                // Advance to the start object marker to
                                //  find next scoreList statement object.
                                //system.debug(parser.getCurrentToken());
                                //system.debug(parser.getCurrentName());
                                if (parser.getCurrentToken() == JSONToken.START_OBJECT) {        
                                    // Read entire scoreList object, including its array of line items.
                                   // scoreList scolist = (scoreList)parser.readValueAs(scoreList.class);
                                    JsonParsingHelper.scoreList scolist = (JsonParsingHelper.scoreList)parser.readValueAs(JsonParsingHelper.scoreList.class);
                                          if(isONDCSoftPull==true){
                                    list<jsonParsingHelper.reasonCode> reasonCodelist = scolist.reasoncodes;
                                        if(reasoncodelist!=null&&reasonCodeList.size()>0){
                                    for(jsonParsingHelper.reasonCode r:reasoncodeList){
                                      if(r.reasonCodeName=='reasoncode1') r1 = r.reasonCodeValue;
                                      if(r.reasonCodeName=='reasoncode2') r2 = r.reasonCodeValue;
                                      if(r.reasonCodeName=='reasoncode3') r3 = r.reasonCodeValue;
                                      if(r.reasonCodeName=='reasoncode4') r4 = r.reasonCodeValue;
                                      if(r.reasonCodeName=='reasoncode5') r5 = r.reasonCodeValue;
                                    }}}
                                    // For debugging purposes, serialize again to verify what was parsed.
                                    MultiBureau_ScoreList__c Msl = new MultiBureau_ScoreList__c();
                                    Msl.ScoreName__c = scolist.ScoreName;
                                    Msl.Score_Card_Name__c = scolist.ScoreCardName;
                                    Msl.Score_Card_Version__c = scolist.ScoreCardVersion;
                                    if(scolist.bureauCharacteristics1 != null) bureauCharacteristics = scolist.bureauCharacteristics1;
                                    if(scolist.bureauCharacteristics2 != null) bureauCharacteristics = bureauCharacteristics+ scolist.bureauCharacteristics2;
                                    if(scolist.bureauCharacteristics3 != null) bureauCharacteristics = bureauCharacteristics+ scolist.bureauCharacteristics3;
                                    if(scolist.bureauCharacteristics4 != null) bureauCharacteristics = bureauCharacteristics+ scolist.bureauCharacteristics4;
                                    if(scolist.bureauCharacteristics5 != null) bureauCharacteristics = bureauCharacteristics+ scolist.bureauCharacteristics5;
                                    if(scolist.bureauCharacteristics6 != null) bureauCharacteristics = bureauCharacteristics+ scolist.bureauCharacteristics6;
                              
                                    dateInStringString = scolist.ScoreDate;
                                    if(dateInStringString != Null) {
                                        MM = dateInStringString.substring(2, 4); 
                                        DD = dateInStringString.substring(0, 2);
                                        YYYY = dateInStringString.substring(4, 8);
                                        Msl.Score_Date__c  = Date.newInstance(integer.valueOf(YYYY),integer.valueOf(MM),integer.valueOf(DD));
                                        //system.debug('##dateInStringString - '+Msl.Score_Date__c);
                                    }
                                    String scorestring = scolist.Score;
                                    //system.debug('##scorestring'+scorestring);
                                    
                                    //Retrun Score computation
                                    If (Returnflag =='Y') {
                                        if (scorestring !=Null){
                                            String First = scorestring.substring(0, 3); 
                                            //system.debug('##First - '+First);
                                            string finalscore;        
                                            if (Integer.valueof(First) == 0) {
                                                String Second = Scorestring.substring(3, 5);
                                                //system.debug('##Second - '+Second);
                                                Finalscore = Second;
                                            } else {
                                                Finalscore = scorestring;
                                            }
                                            FinalIScore = Integer.Valueof(Finalscore);
                                        } else {
                                            FinalIScore = 0;
                                        }
                                        Re.FinalIScore = FinalIScore;
                                    }
                                    
                                    
                                    Msl.Score__c = scolist.Score;
                                    Msl.Exclusion_Code_1__c = scolist.ExclusionCode1;
                                    Msl.Exclusion_Code_2__c = scolist.ExclusionCode2;
                                    Msl.Exclusion_Code_3__c = scolist.ExclusionCode3;
                                    Msl.Exclusion_Code_4__c = scolist.ExclusionCode4;
                                    Msl.Exclusion_Code_5__c = scolist.ExclusionCode5;
                                    Msl.Exclusion_Code_6__c = scolist.ExclusionCode6;
                                    Msl.Exclusion_Code_7__c = scolist.ExclusionCode7;
                                    Msl.Exclusion_Code_8__c = scolist.ExclusionCode8;
                                    Msl.Exclusion_Code_9__c = scolist.ExclusionCode9;
                                    Msl.Exclusion_Code_10__c = scolist.ExclusionCode10; 
                                      if(scolist.ReasonCode1!=null)  Msl.Reason_Code_1__c = scolist.ReasonCode1;
                                    else Msl.Reason_Code_1__c=r1;
                                    if(scolist.ReasonCode2!=null)  Msl.Reason_Code_2__c = scolist.ReasonCode2;
                                    else Msl.Reason_Code_2__c=r2;
                                    if(scolist.ReasonCode3!=null)  Msl.Reason_Code_3__c = scolist.ReasonCode3;
                                    else Msl.Reason_Code_3__c=r3;
                                    if(scolist.ReasonCode4!=null)  Msl.Reason_Code_4__c = scolist.ReasonCode4;
                                    else Msl.Reason_Code_4__c=r4;
                                    if(scolist.ReasonCode5!=null)  Msl.Reason_Code_5__c = scolist.ReasonCode5;
                                    else Msl.Reason_Code_5__c=r5;
                                    Msl.Score_Error_Code__c = scolist.ScoreErrorCode;
                                    
                                    MultiBureauScoreList.add(Msl);
                                    String s = JSON.serialize(scolist);
                                    //system.debug('Serialized phoneList: ' + s);
                                    // Skip the child start array and start object markers.
                                    parser.skipChildren();
                                }
                            }
                        }
                        if (parser.getCurrentToken() == JSONToken.START_ARRAY && (parser.getCurrentName() == 'addresslist'||parser.getCurrentName() == 'addresses')) {
                            while (parser.nextToken() != null && parser.getCurrentToken() !=JSONToken.END_ARRAY ) {
                                // Advance to the start object marker to
                                //  find next Addresslist object.
                                //system.debug(parser.getCurrentToken());
                                //system.debug(parser.getCurrentName());
                                if (parser.getCurrentToken() == JSONToken.START_OBJECT) {
                                    
                                    // Read entire Addresslist object.
                                   // addresslist Addlist = (addresslist)parser.readValueAs(addresslist.class);
                                   JsonParsingHelper.addresslist Addlist = (JsonParsingHelper.addresslist)parser.readValueAs(JsonParsingHelper.addresslist.class);                                      
                                    MultiBureau_AddressList__c Mal = new MultiBureau_AddressList__c();
                                     if(Addlist.addressLine1!=null) Mal.Address_Line_1__c = Addlist.addressLine1;
                                     else  Mal.Address_Line_1__c = Addlist.line1;
                                     if(Addlist.addressLine2!=null)  Mal.Address_Line_2__c = Addlist.addressLine2;
                                     else  Mal.Address_Line_2__c = Addlist.line2;
                                     if(Addlist.addressLine3!=null)  Mal.Address_Line_3__c = Addlist.addressLine3;
                                     else  Mal.Address_Line_3__c = Addlist.line3;
                                     if(Addlist.addressLine4!=null)  Mal.Address_Line_4__c = Addlist.addressLine4;
                                     else  Mal.Address_Line_4__c = Addlist.line4;
                                     if(Addlist.addressLine5!=null) Mal.Address_Line_5__c = Addlist.addressLine5; 
                                     else  Mal.Address_Line_5__c = Addlist.line5;      
                                    Mal.State_Code__c = Addlist.stateCode;  
                                    Mal.Pin_Code__c = Addlist.pinCode;   
                                    Mal.Address_Category__c = Addlist.addressCategory;    
                                    Mal.Residence_Code__c = Addlist.residenceCode;
                                    
                                    dateInStringString = Addlist.dateReported;
                                    if(dateInStringString != Null) {
                                        MM = dateInStringString.substring(2, 4); 
                                        DD = dateInStringString.substring(0, 2);
                                        YYYY = dateInStringString.substring(4, 8);
                                        Mal.Date_Reported__c  = Date.newInstance(integer.valueOf(YYYY),integer.valueOf(MM),integer.valueOf(DD));
                                        //system.debug('##dateInStringString - '+Mal.Date_Reported__c);
                                    }
                                    
                                    Mal.Member_Short_Name__c = Addlist.memberShortName;
                                    Mal.Enriched_Throught_Enquiry__c = Addlist.enrichedThroughtEnquiry;
                                    
                                    MultiBureauAddressList.add(Mal);
                                    
                                    String a = JSON.serialize(Addlist);
                                    //system.debug('Serialized Addresslist: ' + a);
                                    // Skip the child start array and start object markers.
                                    parser.skipChildren();
                                }
                            }
                        }
                        if (parser.getCurrentToken() == JSONToken.START_ARRAY &&(parser.getCurrentName() == 'accountList'||parser.getCurrentName() == 'accounts')) {
                            while (parser.nextToken() != null && parser.getCurrentToken() !=JSONToken.END_ARRAY) {
                                String reportingMemberShortName;
                                String accountType;
                                String ownershipIndicator;
                                String dateOpenedOrDisbursed;
                                String dateReportedAndCertified;
                                String highCreditOrSanctionedAmount;
                                String currentBalance;
                                String paymentHistory1;
                                String paymentHistoryStartDate;
                                String paymentHistoryEndDate;
                                String repaymentTenure;
                                String emiAmount;
                                String paymentFrequence;
                                String dateOfLastPayment;
                                String dateClosed = null;
                                dateClosedInStringString = null;
                                String rateOfInterest;
                                String creditLimit;
                                String actualPaymentAmount;
                                String valueOfCollateral;
                                String typeOfCollateral,overdueAmount,cashLimit;
                                String paymentHistory2;
                                String writtenOffSettledStatus;
                                String seetlementAmount,writtenOffAndSettledStatus,writtenOffAmounttotal;
                                
                                while (parser.nextToken() != System.JSONToken.END_OBJECT) {
                                    if (parser.getCurrentToken() == System.JSONToken.FIELD_NAME) {
                                        String text = parser.getText();
                                        if (parser.nextToken() != System.JSONToken.VALUE_NULL) {
                                            if (text == 'reportingMemberShortName'||text == 'memberShortName') {
                                                reportingMemberShortName = parser.getText();
                                            } else if (text == 'accountType') {
                                                accountType = parser.getText();
                                            }
                                            //changes starts
                                                else if (text == 'overdueAmount') {
                                                    overdueAmount = parser.getText();
                                                }
                                                else if (text == 'cashLimit') {
                                                    cashLimit = parser.getText();
                                                }
                                                //changes ends 
                                            else if (text == 'ownershipIndicator') {
                                                ownershipIndicator = parser.getText();
                                            } else if (text == 'dateOpenedOrDisbursed'||text == 'dateOpened') {
                                                dateOpenedOrDisbursed = parser.getText();
                                            } else if (text == 'dateReportedAndCertified'||text == 'dateReported') {
                                                dateReportedAndCertified = parser.getText();
                                            } else if (text == 'highCreditOrSanctionedAmount' ||text == 'highCreditAmount') {
                                                highCreditOrSanctionedAmount = parser.getText();
                                            } else if (text == 'currentBalance') {
                                                currentBalance = parser.getText();
                                            } else if (text == 'paymentHistory1'||text == 'paymentHistory') {
                                                paymentHistory1 = parser.getText();
                                            } else if (text == 'paymentHistoryStartDate'||text == 'paymentStartDate') {
                                                paymentHistoryStartDate = parser.getText();
                                            } else if (text == 'paymentHistoryEndDate'||text == 'paymentEndDate') {
                                                paymentHistoryEndDate = parser.getText();
                                            } else if (text == 'repaymentTenure'||text == 'paymentTenure') {
                                                repaymentTenure = parser.getText();
                                            } else if (text == 'emiAmount') {
                                                emiAmount = parser.getText();
                                            } else if (text == 'paymentFrequence'||text=='paymentFrequency') {
                                                paymentFrequence = parser.getText();
                                            } else if (text == 'dateOfLastPayment'||text=='lastPaymentDate') {
                                                dateOfLastPayment = parser.getText();
                                            } else if (text == 'dateClosed') {
                                                dateClosed = parser.getText();
                                            } else if (text == 'rateOfInterest') {
                                                rateOfInterest = parser.getText();
                                            } else if (text == 'creditLimit') {
                                                creditLimit = parser.getText();
                                            } else if (text == 'actualPaymentAmount') {
                                                actualPaymentAmount = parser.getText();
                                            } else if (text == 'valueOfCollateral') {
                                                valueOfCollateral = parser.getText();
                                            } else if (text == 'typeOfCollateral') {
                                                typeOfCollateral = parser.getText();
                                            } else if (text == 'paymentHistory2') {
                                                paymentHistory2 = parser.getText();
                                            } else if (text == 'writtenOff&SettledStatus') {
                                                writtenOffSettledStatus = parser.getText();
                                            } else if (text == 'seetlementAmount') {
                                                seetlementAmount = parser.getText();
                                            } else if(text == 'writtenOffAndSettledStatus'){
                                                writtenOffAndSettledStatus = parser.getText();
                                            } else if(text =='wriitenOffAmount(total)'){
                                                writtenOffAmounttotal = parser.getText();
                                            } 
                                            else {
                                                //system.debug(LoggingLevel.WARN, 'AccountList consuming unrecognized property: '+text);
                                            }
                                        }
                                    }
                                }
                                
                                
                                
                                // Advance to the start object marker to
                                //  find next accountList statement object.
                                //system.debug(parser.getCurrentToken());
                                //system.debug(parser.getCurrentName());
                                // if (parser.getCurrentToken() == JSONToken.START_OBJECT) {
                                // Read entire accountList object, including its array of line items.
                                // accountList acclist = (accountList)parser.readValueAs(accountList.class);
                              JsonParsingHelper.accountList acclist = (JsonParsingHelper.accountList)parser.readValueAs(JsonParsingHelper.accountList.class);                                    //system.debug('acclist :'+acclist);
                                // For debugging purposes, serialize again to verify what was parsed.
                                MultiBureau_accountList__c Macl = new MultiBureau_accountList__c();
                                if(reportingMemberShortName!=null) Macl.Reporting_Member_Short_Name__c = reportingMemberShortName;
                                // Macl.Account_Number__c = accountNumber;
                                if(accountType!=null) Macl.Account_Type__c = accountType;
                                listaccType = accountType;
                                //system.debug('List of Account Type'+listaccType);
                                if(ownershipIndicator!=null) Macl.Ownership_Indicator__c = ownershipIndicator;
                                if(dateOpenedorDisbursed!=null) dateInStringString = dateOpenedorDisbursed;
                                //system.debug('dateInstring :'+dateInStringString);  
                                if(dateInStringString != Null&&dateInStringString.length()>=8) {
                                    MM = dateInStringString.substring(2, 4); 
                                    DD = dateInStringString.substring(0, 2);
                                    YYYY = dateInStringString.substring(4, 8);
                                    Macl.Date_Opened_or_Disbursed__c = Date.newInstance(integer.valueOf(YYYY),integer.valueOf(MM),integer.valueOf(DD));
                                    //system.debug('##dateInStringString - '+Macl.Date_Opened_or_Disbursed__c );
                                }
                                // Macl.Date_Opened_or_Disbursed__c = acclist.DateOpenedorDisbursed;
                                // Macl.Date_of_Last_Payment__c = acclist.DateofLastPayment;
                                if(dateofLastPayment!=null) dateInStringString = dateofLastPayment;
                                if(dateInStringString != Null&&dateInStringString.length()>=8) {
                                    MM = dateInStringString.substring(2, 4); 
                                    DD = dateInStringString.substring(0, 2);
                                    YYYY = dateInStringString.substring(4, 8);
                                    Macl.Date_of_Last_Payment__c = Date.newInstance(integer.valueOf(YYYY),integer.valueOf(MM),integer.valueOf(DD));
                                    //system.debug('##dateInStringString - '+Macl.Date_of_Last_Payment__c );
                                }
                                //  Macl.Date_Closed__c = acclist.DateClosed;
                                if(dateClosed!=null) dateClosedInStringString = dateClosed;
                                if(dateClosedInStringString != Null&&dateClosedInStringString.length()>=8) {
                                    MM = dateClosedInStringString.substring(2, 4); 
                                    DD = dateClosedInStringString.substring(0, 2);
                                    YYYY = dateClosedInStringString.substring(4, 8);
                                    Macl.Date_Closed__c = Date.newInstance(integer.valueOf(YYYY),integer.valueOf(MM),integer.valueOf(DD));
                                    //system.debug('##dateInStringString - '+Macl.Date_Closed__c );
                                }
                                if(dateReportedAndCertified!=null) dateInStringString = dateReportedAndCertified;
                                if(dateInStringString != Null) {
                                    MM = dateInStringString.substring(2, 4); 
                                    DD = dateInStringString.substring(0, 2);
                                    YYYY = dateInStringString.substring(4, 8);
                                    Macl.Date_Reported_And_Certified__c = Date.newInstance(integer.valueOf(YYYY),integer.valueOf(MM),integer.valueOf(DD));
                                    //system.debug('##dateInStringString - '+Macl.Date_Reported_And_Certified__c );
                                }
                                //  Macl.Date_Reported_And_Certified__c = acclist.DateReportedAndCertified;
                                
                                if(highCreditorSanctionedAmount!=null) Macl.High_Credit_or_Sanctioned_Amount__c = Decimal.valueof(highCreditorSanctionedAmount);
                                if(currentBalance!=null) Macl.Current_Balance__c = Decimal.valueof(currentBalance);
                                // Macl.Overdue_Amount__c = overdueAmount;
                                //changes starts
                                if(overdueAmount!=null) Macl.Overdue_Amount__c = Decimal.valueOf(overdueAmount);
                                if(typeOfCollateral!=null) Macl.Type_Of_Collateral__c = typeOfCollateral;
                                if(cashLimit!=null) Macl.Cash_Limit__c = Decimal.valueOf(cashLimit);
                                //changes ends
                                if(paymentHistory1!=null) Macl.Payment_History_1__c = paymentHistory1;
                                if(paymentHistory2!=null) Macl.Payment_History_2__c = paymentHistory2;
                                
                                // Macl.Payment_History_Start_Date__c = acclist.PaymentHistoryStartDate;
                                if(paymentHistoryStartDate!=null) dateInStringString = paymentHistoryStartDate;
                                if(dateInStringString != Null&&dateInStringString.length()>=8) {
                                    MM = dateInStringString.substring(2, 4); 
                                    DD = dateInStringString.substring(0, 2);
                                    YYYY = dateInStringString.substring(4, 8);
                                    Macl.Payment_History_Start_Date__c = Date.newInstance(integer.valueOf(YYYY),integer.valueOf(MM),integer.valueOf(DD));
                                    //system.debug('##dateInStringString - '+Macl.Payment_History_Start_Date__c );
                                }
                                // Changes by Ashish for DS Standard Container
                                    if(dateofLastPayment==null){
                                        Macl.Date_of_Last_Payment__c = Macl.Payment_History_Start_Date__c;
                                    }
                                if(paymentHistoryEndDate!=null) dateInStringString = paymentHistoryEndDate;
                                if(dateInStringString != Null&&dateInStringString.length()>=8) {
                                    MM = dateInStringString.substring(2, 4); 
                                    DD = dateInStringString.substring(0, 2);
                                    YYYY = dateInStringString.substring(4, 8);
                                    Macl.Payment_History_End_Date__c = Date.newInstance(integer.valueOf(YYYY),integer.valueOf(MM),integer.valueOf(DD));
                                    //system.debug('##dateInStringString - '+Macl.Payment_History_End_Date__c );
                                } 
                                // Macl.Payment_History_End_Date__c = acclist.PaymentHistoryEndDate; 
                                // Macl.Suit_Filed_or_Wilful_Default__c = suitFiledorWilfulDefault;
                                //system.debug('status :' +writtenOffSettledStatus);
                                if(WrittenOffAndSettledStatus!=null){
                                    Macl.Written_Off_And_Settled_Status__c = Decimal.valueof(writtenOffAndSettledStatus);    
                                }else if(writtenOffSettledStatus!=null){
                                    Macl.Written_Off_And_Settled_Status__c = Decimal.valueof(writtenOffSettledStatus);
                                }
                                
                                
                                if(valueOfCollateral!=null) Macl.Value_Of_Collateral__c = Decimal.valueof(valueOfCollateral);
                                //  Macl.Type_Of_Collateral__c = yypeOfCollateral;
                                if(creditLimit!=null) Macl.Credit_Limit__c = Decimal.valueof(creditLimit);
                                // Macl.Cash_Limit__c = cashLimit;
                                if(rateOfInterest!=null) Macl.Rate_Of_Interest__c = Decimal.valueof(rateOfInterest);
                                if(repaymentTenure!=null) Macl.Repayment_Tenure__c = Decimal.valueof(repaymentTenure);
                                if(EMIAmount!=null) Macl.EMI_Amount__c = Decimal.valueof(EMIAmount);
                                if(writtenOffAmounttotal!=null) Macl.Written_Off_Amount_Total__c = Decimal.valueof(writtenOffAmounttotal);
                                //Macl.Written_Off_Amount_Principal__c = writtenOffAmountPrincipal; 
                                // Macl.Settlement_Amount__c = settlementAmount;
                                if(paymentFrequence!=null) Macl.Payment_Frequence__c = Decimal.valueof(paymentFrequence);
                                if(actualPaymentAmount!=null) Macl.Actual_Payment_Amount__c = Decimal.valueof(actualPaymentAmount);
                                
                                // dateInStringString = dateOfEntryForErrorCode;
                                if(dateInStringString != Null) {
                                    MM = dateInStringString.substring(2, 4); 
                                    DD = dateInStringString.substring(0, 2);
                                    YYYY = dateInStringString.substring(4, 8);
                                    Macl.Date_Of_Entry_For_Error_Code__c = Date.newInstance(integer.valueOf(YYYY),integer.valueOf(MM),integer.valueOf(DD));
                                    //system.debug('##dateInStringString - '+Macl.Date_Of_Entry_For_Error_Code__c );
                                }
                                //  Macl.Date_Of_Entry_For_Error_Code__c = acclist.DateOfEntryForErrorCode;
                                // Macl.Error_Code__c = acclist.ErrorCode;
                                
                                // dateInStringString = dateOfEntryForCibilRemarksCode;
                                if(dateInStringString != Null) {
                                    MM = dateInStringString.substring(2, 4); 
                                    DD = dateInStringString.substring(0, 2);
                                    YYYY = dateInStringString.substring(4, 8);
                                    Macl.DateOfEntryForCibilRemarksCode__c = Date.newInstance(integer.valueOf(YYYY),integer.valueOf(MM),integer.valueOf(DD));
                                    //system.debug('##dateInStringString - '+Macl.DateOfEntryForCibilRemarksCode__c );
                                }
                                //  Macl.DateOfEntryForCibilRemarksCode__c = acclist.DateOfEntryForCibilRemarksCode;
                                //  Macl.CIBIL_Remark_Code__c = CIBILRemarkCode;
                                
                                //  dateInStringString = dateOfEntryForErrorOrDisputeRemarksCode;
                                if(dateInStringString != Null) {
                                    MM = dateInStringString.substring(2, 4); 
                                    DD = dateInStringString.substring(0, 2);
                                    YYYY = dateInStringString.substring(4, 8);
                                    Macl.DateOfEntryForErrorOrDisputeRemarksCode__c = Date.newInstance(integer.valueOf(YYYY),integer.valueOf(MM),integer.valueOf(DD));
                                    //system.debug('##dateInStringString - '+Macl.DateOfEntryForErrorOrDisputeRemarksCode__c );
                                }
                                //  Macl.DateOfEntryForErrorOrDisputeRemarksCode__c = acclist.DateOfEntryForErrorOrDisputeRemarksCode;
                                // Macl.Error_or_Dispute_Remarks_Code_1__c = ErrororDisputeRemarksCode1;
                                // Macl.Error_or_Dispute_Remarks_Code_2__c = ErrororDisputeRemarksCode2;                        
                                MultiBureauAccountList.add(Macl);
                                //system.debug('*****MultiBureauAccountList :' +MultiBureauAccountList);
                                strlist.add(listaccType);
                                system.debug('### value of strlist ='+strlist);
system.debug('### value of strlist size ='+strlist.size());
                                for(String s : strList){
                                    newlstAccType = newlstAccType + s + ',';                                        
                                }
                                system.debug('### Value of newlstAccType ='+newlstAccType );
 system.debug('### Value of newlstAccType size ='+newlstAccType.length() );
                                system.debug('*****listaccType :' +listaccType);
                                String ac = JSON.serialize(acclist);
                                //system.debug('Serialized phoneList: ' + ac);
                                // Skip the child start array and start object markers.
                                parser.skipChildren();
                                // }
                            }
                        }
                        
                       
                        
                        if (parser.getCurrentToken() == JSONToken.START_ARRAY && (parser.getCurrentName() == 'enquiryList'||parser.getCurrentName()=='enquiries')) {
                            while (parser.nextToken() != null && parser.getCurrentToken() !=JSONToken.END_ARRAY ) {
                                // Advance to the start object marker to
                                //  find next enquiryList object.
                                //system.debug(parser.getCurrentToken());
                                //system.debug(parser.getCurrentName());
                                if (parser.getCurrentToken() == JSONToken.START_OBJECT) {
                                    
                                    // Read entire enquiryList object.
                                // enquiryList enqlist = (enquiryList)parser.readValueAs(enquiryList.class); 
                                 JsonParsingHelper.enquiryList enqlist = (JsonParsingHelper.enquiryList)parser.readValueAs(JsonParsingHelper.enquiryList.class);                                     MultiBureau_EnquiryList__c Mql = new MultiBureau_EnquiryList__c();
                                    if(enqlist.dateReported!=null)
                                    dateInStringString = enqlist.dateReported;
                                     else   dateInStringString = enqlist.enquiryDate;                                     if(dateInStringString != Null) {
                                        MM = dateInStringString.substring(2, 4); 
                                        DD = dateInStringString.substring(0, 2);
                                        YYYY = dateInStringString.substring(4, 8);
                                        Mql.Date_Reported__c = Date.newInstance(integer.valueOf(YYYY),integer.valueOf(MM),integer.valueOf(DD));
                                        //system.debug('##dateInStringString - '+Mql.Date_Reported__c );
                                        
                                    }
                                    
                                    
                                    // Mql.Date_Reported__c = enqlist.dateReported;
                                    if(enqlist.reportingMemberShortName!=null)
                                    Mql.Reporting_Member_Short_Name__c = enqlist.reportingMemberShortName;
                                    else  Mql.Reporting_Member_Short_Name__c = enqlist.memberShortName;                                    Mql.Enquiry_Purpose__c = enqlist.enquiryPurpose;
                                    Mql.Enquiry_Amount__c = enqlist.enquiryAmount;   
                                    MultiBureauEnquiryList.add(Mql);
                                    
                                    String q = JSON.serialize(enqlist);
                                    //system.debug('Serialized enquiryList: ' + q);
                                    // Skip the child start array and start object markers.
                                    parser.skipChildren();
                                }
                            }
                        }
                        // Start at the array of disputeRemarks.
                        if (parser.getCurrentToken() == JSONToken.START_OBJECT && parser.getCurrentName() == 'disputeRemarks') {
                            
                            while (parser.nextToken() != null  && parser.getCurrentToken() !=JSONToken.END_OBJECT) {
                                if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                    (parser.getText() == 'dateOfEntry')) {
                                        // Get the value.
                                        parser.nextToken();
                                        dateInStringString = parser.getText();
                                        if(dateInStringString != Null) {
                                            MM = dateInStringString.substring(2, 4); 
                                            DD = dateInStringString.substring(0, 2);
                                            YYYY = dateInStringString.substring(4, 8);
                                            Ml.Date_Of_Entry__c  = Date.newInstance(integer.valueOf(YYYY),integer.valueOf(MM),integer.valueOf(DD));
                                            //system.debug('##dateInStringString - '+Ml.Date_Of_Entry__c);
                                        }
                                    } 
                                if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                    (parser.getText() == 'disputeRemarksLine1')) {
                                        // Get the value.
                                        parser.nextToken();
                                        Ml.Dispute_Remarks_Line_1__c  = parser.getText();
                                    }
                                if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                    (parser.getText() == 'disputeRemarksLine2')) {
                                        // Get the value.
                                        parser.nextToken();
                                        Ml.Dispute_Remarks_Line_2__c  = parser.getText();
                                    }
                                if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                    (parser.getText() == 'disputeRemarksLine3')) {
                                        // Get the value.
                                        parser.nextToken();
                                        Ml.Dispute_Remarks_Line_3__c  = parser.getText();
                                    }
                                if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                    (parser.getText() == 'disputeRemarksLine4')) {
                                        // Get the value.
                                        parser.nextToken();
                                        Ml.Dispute_Remarks_Line_4__c  = parser.getText();
                                    }
                                if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                    (parser.getText() == 'disputeRemarksLine5')) {
                                        // Get the value.
                                        parser.nextToken();
                                        Ml.Dispute_Remarks_Line_5__c  = parser.getText();
                                    }
                                if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                    (parser.getText() == 'disputeRemarksLine6')) {
                                        // Get the value.
                                        parser.nextToken();
                                        Ml.Dispute_Remarks_Line_6__c  = parser.getText();
                                    }
                            }
                        }
                        // Start at the array of Secondary Match.
                        if (parser.getCurrentToken() == JSONToken.START_ARRAY && parser.getCurrentName() == 'secondaryMatches') {
                            Multibureau_secondaryMatches__c Msel = new Multibureau_secondaryMatches__c();
                            while (parser.nextToken() != null && parser.getCurrentToken() !=JSONToken.END_ARRAY ) {
                                // Advance to the start object marker to
                                //  find next secondaryMatches object.
                                //system.debug(parser.getCurrentToken());
                                //system.debug(parser.getCurrentName());
                                if (parser.getCurrentToken() == JSONToken.START_OBJECT && parser.getCurrentName() == 'secName') {
                                    while (parser.nextToken() != null  && parser.getCurrentToken() !=JSONToken.END_OBJECT) {
                                        if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                            (parser.getText() == 'name1')) {
                                                // Get the value.
                                                parser.nextToken();
                                                Msel.Name1__c  = parser.getText();
                                            }
                                        if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                            (parser.getText() == 'name2')) {
                                                // Get the value.
                                                parser.nextToken();
                                                Msel.Name2__c = parser.getText();
                                            }
                                        if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                            (parser.getText() == 'name3')) {
                                                // Get the value.
                                                parser.nextToken();
                                                Msel.Name3__c = parser.getText();
                                            }
                                        if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                            (parser.getText() == 'name4')) {
                                                // Get the value.
                                                parser.nextToken();
                                                Msel.Name4__c = parser.getText();
                                            }
                                        if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                            (parser.getText() == 'name5')) {
                                                // Get the value.
                                                parser.nextToken();
                                                Msel.Name5__c = parser.getText();
                                            }
                                        if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                            (parser.getText() == 'Dob')) {
                                                // Get the value.
                                                parser.nextToken();
                                                dateInStringString = parser.getText();
                                                if(dateInStringString != Null) { 
                                                    MM = dateInStringString.substring(2, 4); 
                                                    DD = dateInStringString.substring(0, 2);
                                                    YYYY = dateInStringString.substring(4, 8);
                                                    Msel.Dob__c  = Date.newInstance(integer.valueOf(YYYY),integer.valueOf(MM),integer.valueOf(DD));
                                                    //system.debug('##dateInStringString - '+Msel.Dob__c);
                                                }
                                            } 
                                        if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                            (parser.getText() == 'Gender')) {
                                                // Get the value.
                                                parser.nextToken();
                                                Msel.Gender__c = parser.getText();
                                            }
                                        if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                            (parser.getText() == 'dateOfEntryForErrorCode')) {
                                                // Get the value.
                                                parser.nextToken();
                                                dateInStringString = parser.getText();
                                                if(dateInStringString != Null) { 
                                                    MM = dateInStringString.substring(2, 4); 
                                                    DD = dateInStringString.substring(0, 2);
                                                    YYYY = dateInStringString.substring(4, 8);
                                                    Msel.DateofEntryforErrorCode__c  = Date.newInstance(integer.valueOf(YYYY),integer.valueOf(MM),integer.valueOf(DD));
                                                    //system.debug('##dateInStringString - '+Msel.DateofEntryforErrorCode__c);
                                                }
                                            } 
                                        if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                            (parser.getText() == 'errorSegmentTag')) {
                                                // Get the value.
                                                parser.nextToken();
                                                Msel.ErrorSegmentTag__c = parser.getText();
                                            }
                                        if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                            (parser.getText() == 'errorCode')) {
                                                // Get the value.
                                                parser.nextToken();
                                                Msel.ErrorCode__c = Double.valueof(parser.getText());
                                            }    
                                        if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                            (parser.getText() == 'dateOfEntryForCibilRemarksCode')) {
                                                // Get the value.
                                                parser.nextToken();
                                                dateInStringString = parser.getText();
                                                if(dateInStringString != Null) { 
                                                    MM = dateInStringString.substring(2, 4); 
                                                    DD = dateInStringString.substring(0, 2);
                                                    YYYY = dateInStringString.substring(4, 8);
                                                    Msel.DateofEntryForCibilRemarksCode__c = Date.newInstance(integer.valueOf(YYYY),integer.valueOf(MM),integer.valueOf(DD));
                                                    //system.debug('##dateInStringString - '+Msel.DateofEntryForCibilRemarksCode__c);
                                                }
                                                
                                            } 
                                        if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                            (parser.getText() == 'cibilRemarkCode')) {
                                                // Get the value.
                                                parser.nextToken();
                                                Msel.CIBILRemarkCode__c = parser.getText();
                                            }
                                        if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                            (parser.getText() == 'dateOfEntryForErrorOrDisputeRemarkscode')) {
                                                // Get the value.
                                                parser.nextToken();
                                                dateInStringString = parser.getText();
                                                if(dateInStringString != Null) { 
                                                    MM = dateInStringString.substring(2, 4); 
                                                    DD = dateInStringString.substring(0, 2);
                                                    YYYY = dateInStringString.substring(4, 8);
                                                    Msel.DateOfEntryForErrorOrDisputeRemarksCode__c = Date.newInstance(integer.valueOf(YYYY),integer.valueOf(MM),integer.valueOf(DD));
                                                    //system.debug('##dateInStringString - '+Msel.DateOfEntryForErrorOrDisputeRemarksCode__c);
                                                }
                                            } 
                                        if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                            (parser.getText() == 'errorOrDisputeRemarksCode1')) {
                                                // Get the value.
                                                parser.nextToken();
                                                Msel.ErrororDisputeRemarksCode1__c = parser.getText();
                                            }
                                        if ((parser.getCurrentToken() == JSONToken.FIELD_NAME) &&
                                            (parser.getText() == 'errorOrDisputeRemarksCode2')) {
                                                // Get the value.
                                                parser.nextToken();
                                                Msel.ErrororDisputeRemarksCode2__c = parser.getText();
                                            }               
                                    }
                                }                        
                                // Start at the array of SecIdlist.
                                if (parser.getCurrentToken() == JSONToken.START_ARRAY && parser.getCurrentName() == 'secidList') {
                                    while (parser.nextToken() != null && parser.getCurrentToken() !=JSONToken.END_ARRAY) {
                                        // Advance to the start object marker to
                                        //  find next secidList statement object.
                                        //system.debug(parser.getCurrentToken());
                                        //system.debug(parser.getCurrentName());
                                        if (parser.getCurrentToken() == JSONToken.START_OBJECT) {        
                                            // Read entire secidList object, including its array of line items.
                                            //idList secilist = (idList)parser.readValueAs(idList.class);
                                           JsonParsingHelper.idList secilist = (JsonParsingHelper.idList)parser.readValueAs(JsonParsingHelper.idList.class);                                            // For debugging purposes, serialize again to verify what was parsed.
                                            MultiBureau_IdList__c Msil = new MultiBureau_IdList__c();
                                            Msil.Id_Type__c = secilist.IdType;
                                            Msil.Id_Value__c = secilist.IdValue;
                                            //system.debug('before panlist');
                                            if(secilist.IdType=='01'){
                                                panlist.add(secilist.IdValue);
                                                //system.debug('PAn list :'+panlist);
                                            }
                                            
                                            dateInStringString = secilist.IssueDate;
                                            if(dateInStringString != Null) {  
                                                MM = dateInStringString.substring(2, 4); 
                                                DD = dateInStringString.substring(0, 2);
                                                YYYY = dateInStringString.substring(4, 8);
                                                Msil.Issue_Date__c = Date.newInstance(integer.valueOf(YYYY),integer.valueOf(MM),integer.valueOf(DD));
                                                //system.debug('##dateInStringString - '+Msil.Issue_Date__c );
                                            }
                                            dateInStringString = secilist.expiryDate;
                                            if(dateInStringString != Null) {
                                                MM = dateInStringString.substring(2, 4); 
                                                DD = dateInStringString.substring(0, 2);
                                                YYYY = dateInStringString.substring(4, 8);
                                                Msil.Expiry_Date__c = Date.newInstance(integer.valueOf(YYYY),integer.valueOf(MM),integer.valueOf(DD));
                                                //system.debug('##dateInStringString - '+Msil.Expiry_Date__c );
                                            }
                                            Msil.EnrichedThroughtEnquiry__c = secilist.EnrichedThroughtEnquiry;   
                                            
                                            MultiBureausecIdList.add(Msil);
                                            String i = JSON.serialize(secilist);
                                            // Skip the child start array and start object markers.
                                            parser.skipChildren();
                                        }
                                    }
                                }
                                // Start at the array of secphonelist.
                                if (parser.getCurrentToken() == JSONToken.START_ARRAY && parser.getCurrentName() == 'secphoneList') {
                                    while (parser.nextToken() != null && parser.getCurrentToken() !=JSONToken.END_ARRAY) {
                                        // Advance to the start object marker to
                                        //  find next SecPhoneList statement object.
                                        //system.debug(parser.getCurrentToken());
                                        //system.debug(parser.getCurrentName());
                                        if (parser.getCurrentToken() == JSONToken.START_OBJECT) {
                                            
                                            // Read entire phoneList object, including its array of line items.
                                            //phoneList secpholist = (phoneList)parser.readValueAs(phoneList.class);
                                           JsonParsingHelper.phoneList secpholist = (JsonParsingHelper.phoneList)parser.readValueAs(JsonParsingHelper.phoneList.class);                                            // For debugging purposes, serialize again to verify what was parsed.
                                            MultiBureau_PhoneList__c Mspl = new MultiBureau_PhoneList__c();
                                            Mspl.Telephone_Number__c = secpholist.TelephoneNumber;
                                            Mspl.Telephone_Extention__c = secpholist.TelephoneExtention;
                                            Mspl.Telephone_Type__c = secpholist.TelephoneType;
                                            Mspl.Enrich_Enquiry_For_Phone__c = secpholist.EnrichEnquiryForPhone;   
                                            
                                            MultiBureausecPhoneList.add(Mspl);
                                            
                                            String p = JSON.serialize(secpholist);
                                            //system.debug('Serialized phoneList: ' + p);
                                            // Skip the child start array and start object markers.
                                            parser.skipChildren();
                                        }
                                    }
                                }
                                if (parser.getCurrentToken() == JSONToken.START_ARRAY && parser.getCurrentName() == 'secaddresslist') {
                                    while (parser.nextToken() != null && parser.getCurrentToken() !=JSONToken.END_ARRAY ) {
                                        // Advance to the start object marker to
                                        //  find next secAddresslist object.
                                        //system.debug(parser.getCurrentToken());
                                        //system.debug(parser.getCurrentName());
                                        if (parser.getCurrentToken() == JSONToken.START_OBJECT) {
                                            
                                            // Read entire secAddresslist object.
                                            // addresslist secAddlist = (addresslist)parser.readValueAs(addresslist.class);  
                                           JsonParsingHelper.addresslist secAddlist = (JsonParsingHelper.addresslist)parser.readValueAs(JsonParsingHelper.addresslist.class);                                                                                MultiBureau_AddressList__c Msal = new MultiBureau_AddressList__c();
                                            Msal.Address_Line_1__c = secAddlist.addressLine1;
                                            Msal.Address_Line_2__c = secAddlist.addressLine2;
                                            Msal.Address_Line_3__c = secAddlist.addressLine3;
                                            Msal.Address_Line_4__c = secAddlist.addressLine4;   
                                            Msal.Address_Line_5__c = secAddlist.addressLine5;   
                                            Msal.State_Code__c = secAddlist.stateCode;  
                                            Msal.Pin_Code__c = secAddlist.pinCode;   
                                            Msal.Address_Category__c = secAddlist.addressCategory;    
                                            Msal.Residence_Code__c = secAddlist.residenceCode;
                                            
                                            dateInStringString = secAddlist.dateReported;
                                            if(dateInStringString != Null) {
                                                MM = dateInStringString.substring(2, 4); 
                                                DD = dateInStringString.substring(0, 2);
                                                YYYY = dateInStringString.substring(4, 8);
                                                Msal.Date_Reported__c  = Date.newInstance(integer.valueOf(YYYY),integer.valueOf(MM),integer.valueOf(DD));
                                                //system.debug('##dateInStringString - '+Msal.Date_Reported__c);
                                            }
                                            
                                            Msal.Member_Short_Name__c = secAddlist.memberShortName;
                                            Msal.Enriched_Throught_Enquiry__c = secAddlist.enrichedThroughtEnquiry;
                                            
                                            MultiBureausecAddressList.add(Msal);
                                            
                                            String a = JSON.serialize(secAddlist);
                                            //system.debug('Serialized secAddresslist: ' + a);
                                            // Skip the child start array and start object markers.
                                            parser.skipChildren();
                                        }
                                    }
                                }
                                
                            }
                            //Update the secondary match data.
                            Msel.Id = Null;
                            If (Returnflag !='Y') insert Msel;
                            MultibureausecondaryMatcheslist.add(Msel);
                            //system.debug('******'+Msel.id);
                            //system.debug('Msel : '+Msel);
                            integer MSize = MultiBureauSecAddressList.size(); 
                            //system.debug('******MSize'+MSize);
                            for (Integer i = 0; i < MSize; i++) {
                                MultiBureauSecAddressList[i].secondaryMatches_ID__c = Msel.id;
                                //system.debug('******I'+i);
                            }
                            If (Returnflag !='Y') insert MultiBureauSecAddressList;
                            MSize = MultiBureauSecPhoneList.size(); 
                            //system.debug('******MSize'+MSize);
                            for (Integer i = 0; i < MSize; i++) {
                                MultiBureauSecPhoneList[i].secondaryMatches_ID__c = Msel.id;
                                //system.debug('******I'+i);
                            }
                            If (Returnflag !='Y') insert MultiBureauSecPhoneList;
                            MSize = MultiBureauSecIdList.size(); 
                            //system.debug('******MSize'+MSize);
                            for (Integer i = 0; i < MSize; i++) {
                                MultiBureauSecIdList[i].secondaryMatches_ID__c = Msel.id;
                                //system.debug('******I'+i);
                            }
                            If (Returnflag !='Y') insert MultiBureauSecIdList;
                        }
                    }
                }
            }
      for(MultiBureau_AccountList__c malexp : MultiBureauAccountList){
                malexp.Date_Proceed__c = DateProceed;
                //system.debug('##malexp.Date_Proceed__c  - '+malexp.Date_Proceed__c  );
            }
            if (jsonStr.length()> 131072){                         
                Ml.Response__c = jsonStr.substring(0,130000);
            }else{
                Ml.Response__c = jsonStr;
            }
            
if(isONDCSoftPull==true)   Ml.Request__c = Bureau_Cls.jsonBody; //for Ondc softpull
            else  Ml.Request__c = Bureau_Cls.tuefStr;            
         // Ml.Response__c = jsonStr;
            
        } else{
            if(mid != null){
                MultiBureauAccountList = [Select Id,Rate_Of_Interest__c,Repayment_Tenure__c,Actual_EMI__c,Acct_Type__c,Ownership_Status__c,High_Credit_or_Sanctioned_Amount__c,Live_CC_trade_line_Flag__c,CC_Utilisation_Rate__c, Account_Type__c, Current_Balance__c, Overdue_Amount__c, Settlement_Amount__c, Written_Off_Amount_Total__c,
                                          Suit_Filed_or_Wilful_Default__c,Date_Reported_And_Certified__c,Date_Closed__c, Written_Off_And_Settled_Status__c, EMI_Amount__c, Payment_History_1__c,Payment_History_2__c,Date_Opened_or_Disbursed__c,Credit_Limit__c,Date_of_Last_Payment__c,Payment_History_Start_Date__c,Payment_History_End_Date__c from MultiBureau_AccountList__c where Multibureau__c = :mid];
                MultiBureauscoreList = [Select Id, Score__c, Score_Card_Name__c,ScoreName__c from MultiBureau_ScoreList__c where Multibureau__c = :mid];
             }
        }
        }catch(Exception ex){
             //system.debug('Exception JsonParsing in ccm class!!');
             Exception_Log__c thisException = new Exception_Log__c(); 
             thisException.Class_Name__c = 'JsonParsing';
             thisException.Method_Name__c = 'parseJSONString';
             thisException.Line_Number__c =  String.ValueOf(ex.getlinenumber());
             thisException.Object__c =  '' ;
             thisException.Record_Id__c =  cid;
             thisException.Description__c = ex.getMessage();
             thisException.Cause__c = ''+ex.getCause();
             thisException.StackTrace__c = ex.getStackTraceString();
             listOfExceptions.add(thisException);
        }
        // Anaytics on the Bureau accounts.
        Ml.Indebtedness_as_per_CIBIL__c = 0;
        Ml.Credit_Cards_Indebtedness__c = 0;
        Ml.Total_Credit_Cards_Accounts__c = 0;
        Ml.CC_Overdue_Balances__c = 0;
        Ml.CC_Overdue_Accounts__c = 0;
        Ml.Total_Accounts_as_per_CIBIL__c = 0;
        Ml.No_of_Suit_Filed__c = 0;
        Ml.Loan_Written_off_Amount__c = 0;
        Ml.Loan_Written_off_Accounts__c = 0;
        Ml.CC_Written_off_Amount__c = 0;
        Ml.CC_Written_off_Accounts__c = 0;
        Ml.Overdue_Balances_as_per_CIBIL__c = 0;
        Ml.Overdue_Accounts_as_per_CIBIL__c = 0;
        Ml.Overdue_Amount__c =0;
        Ml.No_of_Closed_CC__c = 0;
        Ml.No_of_Closed_loan__c = 0;
        Ml.Total_EMI_Amount__c = 0;
        Ml.Total_EMI_Loan_Count__c = 0;
        Ml.CC_HighestOverdue__c = 0;
        Ml.CC_No_of_Write_Offs_in_24M__c = 0;
        Ml.No_of_Write_Offs_in_24M__c = 0;
        Ml.No_of_Write_Offs_in_12M__c = 0;
        Ml.No_of_Write_Offs_in_18M__c = 0;
        Ml.Total_DPD_Count__c = 0;
        Ml.Hightest_DPD__c = 0;
        Ml.Last_3M_DPD_Count__c = 0;
        Ml.Last_3M_Highest__c = 0;
        Ml.Last_6M_Highest__c = 0;
        Ml.Last_9M_Highest__c = 0;
        Ml.Last_12M_Highest__c = 0;
        Ml.Last_18M_Highest__c = 0;
        Ml.Last_24M_Highest__c = 0;
        Ml.Last_36M_Highest__c = 0;
        Ml.Score__c = 0;
        Ml.Bureau__c = Null;
        Ml.Current_Auto_loans__c = 0;
        Ml.Current_Housing_Loans__c = 0;
        Ml.Current_Personal_Secure_Loans__c = 0;
        Ml.current_Personal_Unsecure_Loans__c = 0;
        Ml.Indebtedness_of_current_Auto_loans__c = 0;
        Ml.Indebtedness_of_current_Housing_Loans__c = 0;
        Ml.Indebtedness_of_Curr_PersonalSecureLoans__c = 0;
        Ml.Indebtedness_of_Curr_PersonalUnsecure__c = 0;
        Ml.Current_SME_loans__c = 0;
        Ml.Indebtedness_of_current_SME_loans__c = 0;
        Ml.No_of_Live_CL__c = 0;
        Ml.No_of_Live_PL__c = 0;
        Ml.No_of_Live_BL__c = 0;
        Ml.PL_Availed_in_Last_6Months__c =0;
        Ml.Number_of_PL_availed_in_last_3_M__c = 0;
        Integer MSize = MultiBureauAccountList.size(); 
        //system.debug('******MSize'+MSize);
        Ml.CC_Highest_Loan_Amount__c = 0;
        Ml.PL_Highest_Loan_Amount__c = 0;
        Ml.CL_Highest_Loan_Amount__c = 0;
        Ml.HL_Highest_Loan_Amount__c = 0;
        ML.LAP_Highest_Loan_Amount__c=0;
        Ml.AL_Highest_Loan_Amount__c = 0;
        Ml.Two_Wheeler_Highest_Loan_Amount__c=0;
        Ml.CC_Amt__c= 0;
        Ml.TWL_Amt__c = 0;
        Ml.AL_Amt__c=0;
        Ml.HL_Amt__c=0;
        Ml.LAP_Amt__c=0;
        Ml.PL_Amt__c=0;
        Ml.CL_Amt__c=0;
        Ml.PL_enquiries_in_last_3_months__c = 0;
        Ml.PL_enquiries_in_last_6_months__c = 0;
        Ml.PL_enquiries_in_last_9_months__c = 0;
        Ml.PL_enquiries_in_last_12_months__c = 0;
        Ml.CL_enquiries_in_last_3_months__c = 0;
        Ml.CL_enquiries_in_last_6_months__c = 0;
        Ml.CL_enquiries_in_last_9_months__c = 0;
        Ml.CL_enquiries_in_last_12_months__c = 0;
        Ml.CC_enquiries_in_last_3_months__c = 0;
        Ml.CC_enquiries_in_last_6_months__c = 0;
        Ml.CC_enquiries_in_last_9_months__c = 0;
        Ml.CC_enquiries_in_last_12_months__c = 0;
        Ml.Max_Overdue_amount_in_last_3_months__c=0;
        Ml.Max_Overdue_amount_in_last_6_months__c=0;
        Ml.Max_Overdue_amount_in_last_9_months__c=0;
        Ml.Max_Overdue_amount_in_last_12_months__c=0;
        Ml.Max_Overdue_amount_in_last_15_months__c=0;
        Ml.Max_Overdue_amount_in_last_18_months__c=0;
        Ml.Max_Overdue_amount_in_last_24_months__c=0;
        Ml.Max_Overdue_amount_in_last_36_months__c=0;
        Ml.Repayment_Months__c=0;
        Ml.Write_Off_Status__c='0';
        Ml.No_of_Total_secured_live_loans__c=0;
        Ml.No_of_Total_secured_loans__c=0;
        Ml.No_of_Total_unsecured_live_loans__c=0;
                Ml.No_Of_Total_UnSecured_Live_Loans_MSME__c=0;
        Ml.No_LIVE_USL_SANC_MORE_THAN_20K__c = 0;
        Ml.No_of_Total_unsecured_loans__c=0;
        Ml.Total_No_of_Enq_in_Last_3_Months__c=0;
        Ml.total_Unsecured_enquiries_in_last_1_mths__c = 0;
        Ml.Total_Unsecured_enquiries_in_last_2_mths__c = 0;
        Ml.Total_Unsecured_enquiries_in_last_3_mths__c=0;
        Ml.Total_Unsecured_enq_in_last_3_mths_MSME__c=0;
        Ml.No_of_USL_Enquiries_for_MSME_in_L1M__c = 0;
        Ml.Total_Unsecured_enquiries_in_last_6_mths__c=0;
        Ml.Total_Unsecured_enquiries_in_last_9_mths__c=0;
        Ml.Total_Unsecured_enquiries_in_last_12_mth__c=0;
        Ml.total_secured_enquiries_in_last_1_mths__c = 0;
        Ml.Total_Loans__c=0;
        Ml.BL_enquiries_in_last_3_months__c=0;
        Ml.BL_enquiries_in_last_6_months__c=0;
        Ml.BL_enquiries_in_last_9_months__c=0;
        Ml.BL_enquiries_in_last_12_months__c=0;
        Ml.SMASUBDBTLSS_count__c =0;
        Ml.SMASUBDBTLSS_count24__c= 0;
        Ml.Total_No_of_Enq_in_Last_1_Month__c = 0;
        Ml.Total_No_of_Enq_in_Last_6_Months__c  = 0;
        Ml.Total_new_tradeline_in_last_6_months__c=0;
        Ml.Sum_of_Sanction_amount_of_all_active_acc__c=0;
        Ml.Sum_of_Sanction_amount_of_all_acc__c=0;
        Ml.Last_36_months_Highest_DPD_PL_CC_GRTN50K__c=0;
        Ml.Last_36_months_Highest_DPD_GRTN5K__c=0;
        Ml.No_of_Repayments_in_24_months__c = 0;
        Ml.No_of_Repayments_in_12_Months__c = 0;
        Ml.L36M_Highest_excluding_GL__c =0;
        Ml.L36M_Highest_excluding_GL_CC_CL__c =0;
        Ml.Overdue_Amt_L3M_excl_GL__c =0;
        Ml.Overdue_Amt_L3M_excl_GL_CC__c =0;
        Ml.Max_CC_Limit__c =0;
        Ml.Only_Gold_Loan__c=false;
        Ml.Only_2_Wheeler__c = false;
        Ml.Only_Auto_Loan__c =false;
        Ml.Greater_than_10k_dpd_flag__c = false;
        Ml.Less_than_10k_dpd_flag__c = false;
        Ml.Delinquency_experiment__c = 0; 
        Ml.SMA_SUB_DBT_LSS_Count_in_L36M__c = 0;
        List<String> algoList = new List<String>();
        Map<String,String>algoMap = new Map<String,String>();
        List<Credit_Vision_Detail__c > CValgo_list = new List<Credit_Vision_Detail__c >();
       if(!Test.isRunningTest()){    
           if(bureauCharacteristics != null && bureauCharacteristics != ''){
                //system.debug('Inside Bureau charac'+bureauCharacteristics);
                algoList = bureauCharacteristics.split(',');
                for(String algo:algoList){
                    //system.debug('STring '+algo);
                    String[] cvAlgos = algo.split('\\|');
                    String name,value;
                    if(cvAlgos.size() >0) name = cvAlgos[0];
                    if(cvAlgos.size() >1) value= cvAlgos[1];
                    algoMap.put(name,value);
                  }
                if(algoMap.get('MORAT_FLAG_4M') == '1.00'){
                    Ml.MORAT_FLAG_4M__c = true;
                 }
                if(algoMap.get('MORAT_FLAG_5M') == '1.00'){
                    Ml.MORAT_FLAG_5M__c = true;
                }
                if(algoMap.get('MORAT_FLAG_6M') == '1.00'){
                    Ml.MORAT_FLAG_6M__c = true;
                }
                if(algoMap.get('AT02S') != null)Ml.Number_of_open_trades__c= Decimal.valueof(algoMap.get('AT02S'));
                if(algoMap.get('AT03S') != null)Ml.Number_of_open_trades_currently_satisfac__c= Decimal.valueof(algoMap.get('AT03S'));
                if(algoMap.get('US02S') != null)Ml.Number_of_open_US_trades__c= Decimal.valueof(algoMap.get('US02S'));
                if(algoMap.get('US03S') != null)Ml.Number_of_open_US_trades_currently_satis__c = Decimal.valueof(algoMap.get('US03S'));
                if(algoMap.get('SE02S') != null)Ml.Number_of_open_SE_trades__c=Decimal.valueof(algoMap.get('SE02S'));
                if(algoMap.get('SE03S') != null)Ml.Number_of_open_SE_trades_currently__c= Decimal.valueof(algoMap.get('SE03S'));
                if(algoMap.get('BC02S') != null)Ml.Number_of_open_credit_card_trades__c= Decimal.valueof(algoMap.get('BC02S'));
                if(algoMap.get('BC03S') != null)Ml.Number_of_currently_satisfactory_open_CC__c= Decimal.valueof(algoMap.get('BC03S'));
                for(String paymnt: algoMap.keyset()){
                    if(paymnt.contains('PAYMNT')) {
                      Credit_Vision_Detail__c CValgo = new Credit_Vision_Detail__c();
                      CValgo.name = paymnt;
                      CValgo.Months__c=paymnt.right(2);
                      CValgo.Value__c =algoMap.get(paymnt);
                      CValgo_list.add(CValgo);
                     }
                 }
                 //system.debug('CV ALGO LIST'+CValgo_list);
             }
        }
        date dt = date.today();       
        List<Integer> noofrepay = new List<Integer>();
        MultiBureau_AccountList__c mal = new MultiBureau_AccountList__c();
        jsonParsingHelper.updateMultiBureauEnquiryList(MultiBureauEnquiryList,Ml,todaydate);
        jsonParsingHelper.updateMultibureauAccountList(MultiBureauAccountList, Ml, todaydate);
        /*
        List<String> UnsecuredConditions = System.Label.Cibil_unsecured_Enquiry.split(',');
        List<String> SecuredConditions= System.Label.Cibil_Secured_Enquiry.split(',');
        List<String> CreditCardEnquiry= System.Label.Cibil_Credit_Card.split(',');
        List<String> PLEnq = System.Label.CIBIL_PL.split(',');
        List<String> Blenq = System.label.CIBIL_BL.split(',');

          for(integer e=0;e<MultiBureauEnquiryList.size();e++){
            if(MultiBureauEnquiryList[e].Date_Reported__c>Todaydate.addMonths(-1)) Ml.Total_No_of_Enq_in_Last_1_Month__c = Ml.Total_No_of_Enq_in_Last_1_Month__c +1;
            if(MultiBureauEnquiryList[e].Date_Reported__c>Todaydate.addMonths(-3)) Ml.Total_No_of_Enq_in_Last_3_Months__c = Ml.Total_No_of_Enq_in_Last_3_Months__c +1;
            if(MultiBureauEnquiryList[e].Date_Reported__c>Todaydate.addMonths(-6)) Ml.Total_No_of_Enq_in_Last_6_Months__c = Ml.Total_No_of_Enq_in_Last_6_Months__c +1;
           for(string Str : UnsecuredConditions ){
            if( str == MultiBureauEnquiryList[e].Enquiry_Purpose__c){
                    if(MultiBureauEnquiryList[e].Date_Reported__c>Todaydate.addMonths(-1)) Ml.total_Unsecured_enquiries_in_last_1_mths__c= Ml.total_Unsecured_enquiries_in_last_1_mths__c+1;
                    if(MultiBureauEnquiryList[e].Date_Reported__c>Todaydate.addMonths(-2)) Ml.Total_Unsecured_enquiries_in_last_2_mths__c= Ml.Total_Unsecured_enquiries_in_last_2_mths__c+1;
                    if(MultiBureauEnquiryList[e].Date_Reported__c>Todaydate.addMonths(-3)) Ml.Total_Unsecured_enquiries_in_last_3_mths__c = Ml.Total_Unsecured_enquiries_in_last_3_mths__c +1;
                    if(MultiBureauEnquiryList[e].Date_Reported__c>Todaydate.addMonths(-6)) Ml.Total_Unsecured_enquiries_in_last_6_mths__c = Ml.Total_Unsecured_enquiries_in_last_6_mths__c +1;
                    if(MultiBureauEnquiryList[e].Date_Reported__c>Todaydate.addMonths(-9)) Ml.Total_Unsecured_enquiries_in_last_9_mths__c = Ml.Total_Unsecured_enquiries_in_last_9_mths__c +1;
                    if(MultiBureauEnquiryList[e].Date_Reported__c>Todaydate.addMonths(-12)) Ml.Total_Unsecured_enquiries_in_last_12_mth__c = Ml.Total_Unsecured_enquiries_in_last_12_mth__c +1;
                }}
              for(string Str : SecuredConditions ){
            if( str == MultiBureauEnquiryList[e].Enquiry_Purpose__c){
              if(MultiBureauEnquiryList[e].Date_Reported__c>Todaydate.addMonths(-1)) Ml.total_secured_enquiries_in_last_1_mths__c= Ml.total_secured_enquiries_in_last_1_mths__c+1;
                    if(MultiBureauEnquiryList[e].Date_Reported__c>Todaydate.addMonths(-6)) Ml.Total_secured_enquiries_in_last_6_months__c = Ml.Total_secured_enquiries_in_last_6_months__c +1;
                    }}
          for(string Str : PLEnq ){
            if( str == MultiBureauEnquiryList[e].Enquiry_Purpose__c){
                if(MultiBureauEnquiryList[e].Date_Reported__c>Todaydate.addMonths(-3)) Ml.PL_enquiries_in_last_3_months__c = Ml.PL_enquiries_in_last_3_months__c +1;
                if(MultiBureauEnquiryList[e].Date_Reported__c>Todaydate.addMonths(-6)) Ml.PL_enquiries_in_last_6_months__c = Ml.PL_enquiries_in_last_6_months__c +1;
                if(MultiBureauEnquiryList[e].Date_Reported__c>Todaydate.addMonths(-9)) Ml.PL_enquiries_in_last_9_months__c = Ml.PL_enquiries_in_last_9_months__c +1; 
                if(MultiBureauEnquiryList[e].Date_Reported__c>Todaydate.addMonths(-12)) Ml.PL_enquiries_in_last_12_months__c = Ml.PL_enquiries_in_last_12_months__c +1; 
            }
            }
            if(MultiBureauEnquiryList[e].Enquiry_Purpose__c=='06'){
                if(MultiBureauEnquiryList[e].Date_Reported__c>Todaydate.addMonths(-3)) Ml.CL_enquiries_in_last_3_months__c = Ml.CL_enquiries_in_last_3_months__c +1;
                if(MultiBureauEnquiryList[e].Date_Reported__c>Todaydate.addMonths(-6)) Ml.CL_enquiries_in_last_6_months__c = Ml.CL_enquiries_in_last_6_months__c +1;
                if(MultiBureauEnquiryList[e].Date_Reported__c>Todaydate.addMonths(-9)) Ml.CL_enquiries_in_last_9_months__c = Ml.CL_enquiries_in_last_9_months__c +1; 
                if(MultiBureauEnquiryList[e].Date_Reported__c>Todaydate.addMonths(-12)) Ml.CL_enquiries_in_last_12_months__c = Ml.CL_enquiries_in_last_12_months__c +1; 
            }
            for(string Str : CreditCardEnquiry){
            if( str == MultiBureauEnquiryList[e].Enquiry_Purpose__c){
                if(MultiBureauEnquiryList[e].Date_Reported__c>Todaydate.addMonths(-3)) Ml.CC_enquiries_in_last_3_months__c = Ml.CC_enquiries_in_last_3_months__c +1;
                if(MultiBureauEnquiryList[e].Date_Reported__c>Todaydate.addMonths(-6)) Ml.CC_enquiries_in_last_6_months__c = Ml.CC_enquiries_in_last_6_months__c +1;
                if(MultiBureauEnquiryList[e].Date_Reported__c>Todaydate.addMonths(-9)) Ml.CC_enquiries_in_last_9_months__c = Ml.CC_enquiries_in_last_9_months__c +1; 
                if(MultiBureauEnquiryList[e].Date_Reported__c>Todaydate.addMonths(-12)) Ml.CC_enquiries_in_last_12_months__c = Ml.CC_enquiries_in_last_12_months__c +1; 
            }
            }
               for(string Str : BlEnq){
            if(str == MultiBureauEnquiryList[e].Enquiry_Purpose__c){
                if(MultiBureauEnquiryList[e].Date_Reported__c>Todaydate.addMonths(-3)) Ml.BL_enquiries_in_last_3_months__c = Ml.BL_enquiries_in_last_3_months__c +1;
                if(MultiBureauEnquiryList[e].Date_Reported__c>Todaydate.addMonths(-6)) Ml.BL_enquiries_in_last_6_months__c = Ml.BL_enquiries_in_last_6_months__c +1;
                if(MultiBureauEnquiryList[e].Date_Reported__c>Todaydate.addMonths(-9)) Ml.BL_enquiries_in_last_9_months__c = Ml.BL_enquiries_in_last_9_months__c +1; 
                if(MultiBureauEnquiryList[e].Date_Reported__c>Todaydate.addMonths(-12)) Ml.BL_enquiries_in_last_12_months__c = Ml.BL_enquiries_in_last_12_months__c +1; 
           }
         }
        }*/
        Contact con = [select id,AccountId,Lead__c,Pulled_LeadSource__c,lead__r.Program_Type__c from contact where id=:cid];
        DPD_cls.Returnlist dpdre = new DPD_cls.Returnlist();
        DPD_cls dpd = new DPD_cls();
        Ml.Bureau__c = 'CIBIL';
        if (isONDCSoftPull==true)  Ml.Cibil_Report_Name__c = 'CIBILSOFTPULL';
        dpd.LeasourceContact(con.Pulled_LeadSource__c,con.lead__r.Program_Type__c);
        dpdre = dpd.dpdcal(MultiBureauAccountList,Ml.Bureau__c);
        
        Decimal Temp_ROI_exp = 0 ;
        Decimal Temp_Pl_currentBal = 0 ;
        String Temp_Pl_tradeline ;
        decimal PL_Derog_Repayment_Months=0,HL_Derog_Repayment_Months=0,CC_Derog_Repayment_Months=0,HL_Derog_High_Credit_or_Sanctioned_Amount = 0,CC_Derog_High_Credit_or_Sanctioned_Amount = 0,PL_Derog_High_Credit_or_Sanctioned_Amount = 0,CC_Derog_Credit_Limit = 0,CC_Derog_Current_Balance =0,AL_Derog_High_Credit_or_Sanctioned_Amount = 0,BL_Derog_High_Credit_or_Sanctioned_Amount = 0,TWL_Derog_High_Credit_or_Sanctioned_Amount = 0,ALL_Derog_High_Credit_or_Sanctioned_Amount = 0,PL_Derog_Current_Balance=0;
        date HL_Derog_Date_Closed,CC_Derog_Date_Closed,PL_Derog_Date_Closed,AL_Derog_Date_Closed,BL_Derog_Date_Closed,TWL_Derog_Date_Closed,ALL_Derog_Date_Closed;
        string HL_Derog_Account_Type,CC_Derog_Account_Type,PL_Derog_Account_Type,AL_Derog_Account_Type,BL_Derog_Account_Type,TWL_Derog_Account_Type;
        decimal max1=0,max2=0,netmax=0,temp_sanctionamount=0,temp_creditlimit=0,temp_currentbalance=0;
        decimal vintagecount = 0;
        for (Integer i = 0; i < MSize; i++) {
     
      //system.debug('3m highest :'+dpdre.DPD3M);
            Ml.Highest_DPD_in_last_1_month__c = dpdre.DPD1MWtDt;
            Ml.Last_3M_Highest_without_date__c = dpdre.DPD3MWtDt;
            Ml.Last_6M_Highest_without_date__c = dpdre.DPD6MWtDt;
            Ml.Last_9M_Highest_without_date__c = dpdre.DPD9MWtDt;
            Ml.Last_12M_Highest_without_date__c = dpdre.DPD12MWtDt;
            Ml.Last_18M_Highest_without_date__c = dpdre.DPD18MWtDt;
            Ml.Last_24M_Highest_without_date__c = dpdre.DPD24MWtDt;
            Ml.Last_36M_Highest_without_date__c = dpdre.DPD36MWtDt;
            Ml.Last_3M_DPD_Count_without_date__c = dpdre.DPD3woutdtCount;
            Ml.Last_6M_DPD_Count_without_date__c = dpdre.DPD6woutdtCount;
            Ml.Last_9M_DPD_Count_without_date__c = dpdre.DPD9woutdtCount;
            Ml.Last_12M_DPD_Count_without_date__c = dpdre.DPD12woutdtCount;
            Ml.Last_18M_DPD_Count_without_date__c = dpdre.DPD18woutdtCount;
            Ml.Last_24M_DPD_Count_without_date__c = dpdre.DPD24woutdtCount;
            Ml.Last_36M_DPD_Count_without_date__c = dpdre.DPD36woutdtCount;
            Ml.Last_3M_30DPD_Count_without_date__c = dpdre.DPD3_30CountWtDt;
            Ml.Last_6M_30DPD_Count_without_date__c = dpdre.DPD6_30CountWtDt;
            Ml.Last_9M_30DPD_Count_without_date__c = dpdre.DPD9_30CountWtDt;
            Ml.Last_12M_30DPD_Count_without_date__c = dpdre.DPD12_30CountWtDt;
            Ml.Last_18M_30DPD_Count_without_date__c = dpdre.DPD18_30CountWtDt;
            Ml.Last_24M_30DPD_Count_without_date__c = dpdre.DPD24_30CountWtDt;
            Ml.Last_12M_90DPD_Count_without_date__c = dpdre.DPD12_90CountWtDt;
            Ml.Last_24M_90DPD_Count_without_date__c = dpdre.DPD24_90CountWtDt;
            Ml.Last_36M_90DPD_Count_without_date__c = dpdre.DPD36_90CountWtDt;
            Ml.Payhis_check__c = dpdre.payhis;
            Ml.Overdue_Amt_L3M_excl_GL__c = dpdre.ODBalCIBIL1;
            Ml.Overdue_Amt_L3M_excl_GL_CC__c = dpdre.ODBalCIBIL2;
            Ml.L36M_Highest_excluding_GL__c = dpdre.DPD36_90CountWtDt1;
            Ml.L36M_Highest_excluding_GL_CC_CL__c = dpdre.DPD36_90CountWtDt2;
            Ml.Max_Overdue_Amount_CC__c = dpdre.maxODCC;
            Ml.Unsecured_FOIR__c = dpdre.unsecFOIR;
            Ml.Sum_of_Sanction_Amount_PL__c = dpdre.sumPL;
            Ml.Sum_of_Sanction_Amount_BL__c = dpdre.sumBL;
            Ml.Sum_of_Sanction_Amount_AL__c = dpdre.sumAL;
            Ml.Sum_of_Sanction_Amount_CL__c = dpdre.sumCL;
            Ml.Sum_of_Sanction_Amount_EL__c = dpdre.sumEL;
            Ml.Sum_of_Sanction_Amount_HL__c = dpdre.sumHL;
            Ml.Sum_of_Sanction_Amount_TW__c = dpdre.sumTW;
            Ml.Sum_of_Sanction_Amount_LAP__c = dpdre.sumLAP;
            Ml.Sum_of_Sanction_Amount_GL__c = dpdre.sumGL;
            Ml.Sum_of_Sanction_Amount_CC__c = dpdre.sumCC;
            Ml.Min_MOB_CC__c = dpdre.minCC;
            Ml.Max_MOB_CC__c = dpdre.maxCC;
            Ml.Min_MOB_CL__c = dpdre.minCL;
            Ml.Max_MOB_CL__c = dpdre.maxCL;
            Ml.Min_MOB_PL__c = dpdre.minPL;
            Ml.Max_MOB_PL__c = dpdre.maxPL;
            Ml.Min_MOB_AL__c = dpdre.minAL;
            Ml.Max_MOB_AL__c = dpdre.maxAL;
            Ml.Min_MOB_BL__c = dpdre.minBL;
            Ml.Max_MOB_BL__c = dpdre.maxBL;
            Ml.Min_MOB_HL__c = dpdre.minHL;
            Ml.Max_MOB_HL__c = dpdre.maxHL;
            Ml.Min_MOB_GL__c = dpdre.minGL;
            Ml.Max_MOB_GL__c = dpdre.maxGL;
            Ml.Min_MOB_EL__c = dpdre.minEL;
            Ml.Max_MOB_EL__c = dpdre.maxEL;
            Ml.Min_MOB_TW__c = dpdre.minTW;
            Ml.Max_MOB_TW__c = dpdre.maxTW;
            Ml.Min_MOB_LAP__c = dpdre.minLAP;
            Ml.Max_MOB_LAP__c = dpdre.maxLAP;
            Ml.Credit_Cards_Indebtedness__c = dpdre.ccIndebt;
            Ml.Total_Credit_Cards_Accounts__c = dpdre.totalccAccounts;
            Ml.CC_Amt__c = dpdre.ccamount;
            Ml.CL_Amt__c = dpdre.clamount;
            Ml.PL_Amt__c = dpdre.plamount;
            Ml.AL_Amt__c = dpdre.alamount;
            Ml.HL_Amt__c = dpdre.hlamount;
            Ml.CC_Written_off_Amount__c = dpdre.CCwrtoffAmt;
            Ml.CC_Written_off_Accounts__c = dpdre.CCwrtnoffAcc;
            Ml.No_of_Write_Offs_in_24M__c = dpdre.writeof24m;
            Ml.No_of_Write_Offs_in_18M__c = dpdre.No_of_Write_Offs_in_18M;
            Ml.CC_No_of_Write_Offs_in_24M__c = dpdre.ccwriteof24m;
            Ml.No_of_Write_Offs_in_12M__c = dpdre.No_of_Write_Offs_in_12M;
            Ml.BL_Highest_Loan_Amount__c = dpdre.blhighamount;
            Ml.TWL_Amt__c = dpdre.twamount;
            Ml.Write_Off_Status__c = dpdre.Written_Off_And_Settled_Status;
            Ml.CC_Highest_Loan_Amount__c = dpdre.cchighamt;
            Ml.GL_Highest_Loan_Amount__c = dpdre.glhighamount;
            Ml.Newest_Loan_on_Bureau_in_Months__c = dpdre.newestLoan;
            Ml.Oldest_Loan_on_Bureau_in_Months__c = dpdre.oldestLoan;
            Ml.No_of_unsecured_loans_in_last_1_months__c = dpdre.unsec1M;
            Ml.No_of_unsecured_loans_in_last_3_months__c = dpdre.unsec3M;
            Ml.No_of_unsecured_loans_in_last_6_months__c = dpdre.unsec6M;
            Ml.No_of_unsecured_loans_in_last_9_months__c = dpdre.unsec9M;
            Ml.No_of_unsecured_loans_in_last_12_months__c = dpdre.unsec12M;
           Ml.Total_unsecured_loans_in_last_3M_MSME__c = dpdre.unsec3MMSME;

            Ml.Ratio_of_Unsecure_to_Secure__c = dpdre.ratioUnsec;
            Ml.No_of_Total_unsecured_loans__c = dpdre.totUnsecloans;
            Ml.Ownership_Status_AL__c = dpdre.ALOwnStatus;
            Ml.Ownership_Status_HL__c = dpdre.HLOwnStatus;
            Ml.Ownership_Status_LAP__c = dpdre.LAPOwnStatus;
            Ml.No_of_Live_PL__c = dpdre.noofPL;
            Ml.Sum_Of_Unsecured_Loan_Amt_Opened_In_L12M__c = dpdre.sumunsecLoanAmtin12M;
            Ml.No_Of_Tradelines_in_30DPD_in_L6__c = dpdre.nooftrades6M;
            Ml.No_of_Total_secured_loans__c = dpdre.totSecLoans;
            Re.repaymentMonths = dpdre.repaymentMonths;
            Ml.Repayment_Months__c = dpdre.repaymentMonths;
            Ml.No_of_Total_secured_live_loans__c = dpdre.totSecLiveLoans;
            Ml.No_of_Closed_loan__c = Dpdre.closedLoans;
            Ml.Current_SME_loans__c = Dpdre.SMELoans;
            Ml.Indebtedness_of_current_SME_loans__c = Dpdre.IndebtSME;
            Ml.No_of_Total_unsecured_live_loans__c = Dpdre.totunsecureLoans;
            Ml.No_Of_Total_UnSecured_Live_Loans_MSME__c = Dpdre.totunsecureLoansMSME;
            Ml.No_LIVE_USL_SANC_MORE_THAN_20K__c = Dpdre.No_LIVE_USL_SANC_MORE_THAN_20K;
            Ml.No_of_Live_BL__c = Dpdre.noofBL;
            Ml.Indebtedness_as_per_CIBIL__c = Dpdre.IndebtCIBIL;
            Ml.Total_Accounts_as_per_CIBIL__c = Dpdre.totalAccounts;
            Ml.No_of_Suit_Filed__c = Dpdre.suitField;
            Ml.Total_EMI_Amount__c = Dpdre.EMIAmt;
            Ml.Total_EMI_Loan_Count__c = Dpdre.EMILoanCount;
            Ml.Overdue_Balances_as_per_CIBIL__c = dpdre.ODBalCIBIL;
            Ml.Loan_Written_off_Accounts__c = dpdre.loanwrtnAccounts;
            Ml.Loan_Written_off_Amount__c = dpdre.loanwrtnamount;
            Ml.Total_no_of_live_loans__c = dpdre.TotalLiveLoans;
            //Added by Nadeem 04-02-2019
            Ml.Max_Overdue_amount_in_last_12_months__c = dpdre.MAX12OD;
            Ml.Max_Overdue_amount_in_last_24_months__c = dpdre.MAX24OD;
            Ml.CC_Overdue_Balances__c = dpdre.CCODBal;
            Ml.CC_Overdue_Accounts__c = dpdre.CCODAcc;
            Ml.No_of_Closed_CC__c = dpdre.ccClosed;
            Ml.CC_HighestOverdue__c = dpdre.cchighOD;
            Ml.CC_Overdue_Balances__c = dpdre.CCODBal;
            Ml.CC_Overdue_Accounts__c = dpdre.CCODAcc;
            Ml.No_of_Closed_CC__c = dpdre.ccClosed;
            Ml.BL_Amt__c = dpdre.blamount;
            Ml.No_of_Live_CL__c = dpdre.noofCL;
            Ml.PL_Highest_Loan_Amount__c = dpdre.plhighamt;
            Ml.CL_Highest_Loan_Amount__c = dpdre.clhighamt;
            Ml.HL_Highest_Loan_Amount__c = dpdre.hlhighamt;
            ML.LAP_Highest_Loan_Amount__c = dpdre.laphighamt;
            Ml.AL_Highest_Loan_Amount__c = dpdre.alhighamt;
            Ml.Two_Wheeler_Highest_Loan_Amount__c = dpdre.twhighamt;
            Ml.PL_Highest_Loan_Amount__c = dpdre.plhighamt;
            Ml.CL_Highest_Loan_Amount__c = dpdre.clhighamt;
            Ml.HL_Highest_Loan_Amount__c = dpdre.hlhighamt;
            ML.LAP_Highest_Loan_Amount__c = dpdre.laphighamt;
            Ml.AL_Highest_Loan_Amount__c = dpdre.alhighamt;
            Ml.SMASUBDBTLSS_count__c = dpdre.SMASUBDBTLSS;
            Ml.SMASUBDBTLSS_count24__c = dpdre.SMASUBDBTLSS24;
           Ml.SMASUBDBTLSS_count18__c = dpdre.SMASUBDBTLSS18;
            Ml.Repayment_Months__c = dpdre.repaymentMonths;
            Ml.Two_Wheeler_Highest_Loan_Amount__c = dpdre.twhighamt;
            Ml.Unsecured_Live_Loans_Availed_3Months__c = dpdre.unsecliveloans3;
            Ml.Unsecured_Live_Loans_Availed_12Months__c = dpdre.unsecliveloans12;
            Ml.Unsecured_Live_Loans_Availed_6Months__c = dpdre.unsecliveloans6;
            Ml.Credit_Card_Utilization__c = dpdre.MAX_CC_UTILIZATION;
            Ml.Last_3_months_Highest_DPD_PL__c = dpdre.DPD3PL;
            Ml.Last_6_months_Highest_DPD_PL__c = dpdre.DPD6PL;
            Ml.Last_12_months_Highest_DPD_PL__c = dpdre.DPD12PL;
            Ml.Last_24_months_Highest_DPD_PL__c =  dpdre.DPD24PL;
            Ml.Last_36_months_Highest_DPD_PL_CC_GRTN50K__c = dpdre.DPD36PLCC;
            Ml.Last_36_months_Highest_DPD_GRTN5K__c = dpdre.DPD36All;
            Ml.No_of_Repayments_in_24_months__c = dpdre.totalRePayments24;
            Ml.No_of_Repayments_in_12_months__c = dpdre.totalRePayments12;
            Ml.Last_3_months_Highest_DPD_Live_PL__c= dpdre.DPD3PLlive;
            Ml.Last_6_months_Highest_DPD_Live_PL__c=  dpdre.DPD6PLlive;
            Ml.Last_12_months_Highest_DPD_Live_PL__c= dpdre.DPD12PLlive;
            Ml.Last_24_months_Highest_DPD_Live_PL__c=  dpdre.DPD24PLlive;
            Ml.Last_3_months_Highest_DPD_Live_Tradeline__c= dpdre.highest3DPDtradeline ;
            Ml.Last_6_months_Highest_DPD_Live_Tradeline__c=  dpdre.highest6DPDtradeline ;
            Ml.Last_12months_Highest_DPD_Live_Tradeline__c= dpdre.highest12DPDtradeline ;
            Ml.Last_24months_Highest_DPD_Live_Tradeline__c=  dpdre.highest24DPDtradeline ;
            Ml.Last_3_months_Highest_DPD_Live_Loans__c= dpdre.highest3DPDloan ;
            Ml.Last_6_months_Highest_DPD_Live_Loans__c=  dpdre.highest6DPDloan ;
            Ml.Last_12_months_Highest_DPD_Live_Loans__c= dpdre.highest12DPDloan ;
            Ml.Last_24_months_Highest_DPD_Live_Loans__c=  dpdre.highest24DPDloan ;
            Ml.Overdue_Amount__c = dpdre.Overdue_Amount;
            Ml.Total_new_tradeline_in_last_6_months__c = dpdre.newTradelinesLast6Months;
            Ml.Sum_of_Sanction_amount_of_all_active_acc__c = dpdre.sum_of_sanctioned_amt;
            Ml.Sum_of_Sanction_amount_of_all_acc__c = dpdre.sum_of_total_sanctioned_amt;
            //system.debug('Sum_of_Sanction_amount_of_all_active_acc__c: '+Ml.Sum_of_Sanction_amount_of_all_active_acc__c);
            //system.debug('Total_new_tradeline_in_last_6_months__c: '+Ml.Total_new_tradeline_in_last_6_months__c);
            Re.minrepaymentMonths = dpdre.minrepaymentMonths ;
            Ml.Two_Wheeler_Highest_Loan_Amount__c = dpdre.twhighamt;
      Ml.Current_balance_last_12M_90_DPD__c = dpdre.currentBalance90DPD12M;
            Ml.Number_of_Gold_loan_availed_in_last_12_M__c=dpdre.glLast12M;
            Ml.Number_of_Gold_loan_availed_in_last_3_M__c=dpdre.glLast3M ;
            Ml.Number_of_Gold_loan_availed_in_last_6_M__c= dpdre.glLast6M;
            Ml.Number_of_SMA_LSS_account_in_last_24_M__c=dpdre.Number_of_SMA_LSS_account_in_last_24_M;
            Ml.Number_of_SUB_DBT_account_in_last_6_M__c=dpdre.Number_of_SUB_DBT_account_in_last_6_M ;
            Ml.Number_of_PL_availed_in_last_12_M__c=dpdre.countPl12M;
            Ml.Number_of_PL_availed_in_last_3_M__c=dpdre.countPl3M;
            Ml.Number_of_PL_availed_in_last_6_M__c= dpdre.countPl6M;
            Ml.No_of_tradeline_in_1_30_dpd_in_last_6_M__c= dpdre.count1_30DPD6M; 
            Ml.No_of_tradeline_in_1_30_dpd_in_last_3_M__c = dpdre.count1_30DPD3M; 
            Ml.No_of_tradeline_in_1_30_dpd_in_last_12_M__c = dpdre.count1_30DPD12M; 
            Ml.No_of_tradeline_in_1_30_dpd_in_last_24_M__c = dpdre.count1_30DPD24M;
            Ml.Max_ovrdue_amt_of_loan_exclude_CC_L12M__c =dpdre.max_overdueWithoutCC;
            Ml.Highest_DPD_in_unsec_loan_in_L3M_WoutDt__c= dpdre.HighestUnsec3M;
            Ml.Highest_DPD_in_unsec_loan_in_L6M_WoutDt__c=  dpdre.HighestUnsec6M ;
            Ml.Highest_DPD_in_unsec_loan_in_L12M_WoutDt__c = dpdre.HighestUnsec12M;
            Ml.Highest_DPD_in_unsec_loan_in_L24M_WoutDt__c = dpdre.HighestUnsec24M;
            Ml.Max_CC_Limit__c = dpdre.MaxCCLimit;
  Ml.Sum_of_Sanc_Amt_of_other_unsecured_tradl__c=dpdre.Sum_of_Sanc_Amt_of_other_unsecured_tradl;
  Ml.No_of_other_unsecured_tradelines_act__c=dpdre.No_of_other_unsecured_tradelines_act;
  Ml.Sum_of_Curr_bal_for_all_other_unsecured__c=dpdre.Sum_of_Curr_bal_for_all_other_unsecured;
  Ml.Sum_of_Sanction_Amt_of_all_Act_Mortg_HL__c=dpdre.Sum_of_Sanction_Amt_of_all_Act_Mortg_HL;
  Ml.Sum_of_CurBal_for_all_Act_Mortg_HL__c=dpdre.Sum_of_CurBal_for_all_Act_Mortg_HL;
  Ml.No_of_Active_Mortgages_HL__c=dpdre.No_of_Active_Mortgages_HL;
  Ml.Sum_of_high_Sanction_Amount_credit_limi__c=dpdre.Sum_of_high_Sanction_Amount_credit_limi;
  Ml.Sum_of_Current_balance_for_all_Active_CC__c=dpdre.Sum_of_Current_balance_for_all_Active_CC;
  Ml.No_of_Active_CC__c=dpdre.No_of_Active_CC;
  Ml.Sum_of_Sanction_Amount_of_all_Active_PL__c=dpdre.Sum_of_Sanction_Amount_of_all_Active_PL;
  Ml.No_of_Active_PL__c=dpdre.No_of_Active_PL;
  Ml.Sum_of_Sanction_Amount_of_all_Acti_CL_CD__c=dpdre.Sum_of_Sanction_Amount_of_all_Acti_CL_CD;
  Ml.Sum_of_Current_balance_for_all_Active_PL__c=dpdre.Sum_of_Current_balance_for_all_Active_PL;
  Ml.Sum_of_Current_balance_for_all_Active_CL__c=dpdre.Sum_of_Current_balance_for_all_Active_CL;
  Ml.No_of_Active_CL__c=dpdre.No_of_Active_CL;
   Ml.MAX_CC_OD_UTILIZATION__c = dpdre.MAX_CC_OD_UTILIZATION;
   Ml.Only_Gold_Loan__c = dpdre.onlyGoldLoan;
   Ml.Greater_than_10k_dpd_flag__c = dpdre.greaterflag;
   Ml.Less_than_10k_dpd_flag__c = dpdre.lessthanflag;
   Ml.Delinquency_experiment__c = dpdre.delinexp; 
            Ml.Only_2_Wheeler__c = dpdre.onlyTWLoan;
            Ml.Only_Auto_Loan__c = dpdre.onlyAutoLoan;
            Ml.Atleast_One_CC__c = dpdre.atleast1CC;
            Ml.Atleast_One_CL__c = dpdre.atleast1CL;
            Ml.Atleast_One_PL__c = dpdre.atleast1PL;
            Ml.Atleast_One_HL__c = dpdre.atleast1HL;
            Ml.High_DPD_L1M_excl_overdue_CC_5K__c = dpdre.highdpdexcc;
            Ml.KCC_Overdue_Balance__c = dpdre.kccoverduebal;
            ML.OD_Overdue_balance__c = dpdre.odoverduebal;
            Ml.Overdue_amount_exclu_OD_CC_KCC__c = dpdre.kccodccoverdue;
            Ml.BL_enquiries_in_last_1_month__c = dpdre.blonemonenq;
            Ml.PL_enquiries_in_last_1_month__c = dpdre.plonemonenq;
            Ml.No_of_PL_A50K_BL_OD_availed_L3M__c = dpdre.nopla50m3;
            Ml.No_of_PL_A50K_BL_OD_availed_L6M__c = dpdre.nopla50m6;
            Ml.SMA_SUB_DBT_LSS_Count_in_L36M__c = dpdre.SMA_SUB_DBT_LSS_Count_in_L36M;
            //system.debug('high amount :'+MultiBureauAccountList[i].High_Credit_or_Sanctioned_Amount__c);
            if(MultiBureauAccountList[i].High_Credit_or_Sanctioned_Amount__c==Ml.CC_Amt__c){
                MultiBureauAccountList[i].Live_CC_trade_line_Flag__c='Yes';
                if(MultiBureauAccountList[i].High_Credit_or_Sanctioned_Amount__c>0)
                MultiBureauAccountList[i].CC_Utilisation_Rate__c = (MultiBureauAccountList[i].Current_Balance__c/MultiBureauAccountList[i].High_Credit_or_Sanctioned_Amount__c)*100;
                MultiBureauAccountList[i].Last_12M_Repayment_Count_CC__c = dpd.repayCount(MultiBureauAccountList[i].Payment_History_1__c,MultiBureauAccountList[i].Payment_History_2__c,MultiBureauAccountList[i].Date_Reported_And_Certified__c,'CIBIL');
            }
            MultiBureauAccountList[i].ROI_Experiment__c=0   ; 
            If(MultiBureauAccountList[i].Rate_Of_Interest__c >=4 && MultiBureauAccountList[i].Rate_Of_Interest__c <=46) MultiBureauAccountList[i].ROI_Experiment__c= MultiBureauAccountList[i].Rate_Of_Interest__c;

       //system.debug('ROIEXperiment'+MultiBureauAccountList[i].ROI_Experiment__c);
  If(MultiBureauAccountList[i].Rate_Of_Interest__c >= 0.04 && MultiBureauAccountList[i].Rate_Of_Interest__c <=0.46)MultiBureauAccountList[i].ROI_Experiment__c=MultiBureauAccountList[i].Rate_Of_Interest__c*100;

       //system.debug('ROIEXperiment'+MultiBureauAccountList[i].ROI_Experiment__c);
  If((MultiBureauAccountList[i].Repayment_Tenure__c !=null && MultiBureauAccountList[i].High_Credit_or_Sanctioned_Amount__c!=null && MultiBureauAccountList[i].EMI_Amount__c!=null && MultiBureauAccountList[i].ROI_Experiment__c==0))
  {
     MultiBureauAccountList[i].ROI_Experiment__c=2*1200*( MultiBureauAccountList[i].EMI_Amount__c  *MultiBureauAccountList[i].Repayment_Tenure__c  -  MultiBureauAccountList[i].High_Credit_or_Sanctioned_Amount__c)/( MultiBureauAccountList[i].EMI_Amount__c *MultiBureauAccountList[i].Repayment_Tenure__c*(1+ MultiBureauAccountList[i].Repayment_Tenure__c ));
  }
       
       //system.debug('ROIEXperiment'+MultiBureauAccountList[i].ROI_Experiment__c);
         //Jira CI-2295   
            IF(ml.Date_Proceed__c != null && MultiBureauAccountList[i].Date_Opened_or_Disbursed__c != null)
            {
                MultiBureauAccountList[i].Months_Since_PL_Opened__c =MultiBureauAccountList[i].Date_Opened_or_Disbursed__c.monthsBetween(ml.Date_Proceed__c);
                
            }
           //
                //Calculating min ROI  
            If((MultiBureauAccountList[i].Account_Type__c == '05' || MultiBureauAccountList[i].Account_Type__c == '5') && MultiBureauAccountList[i].Months_Since_PL_Opened__c <=36 && MultiBureauAccountList[i].ROI_Experiment__c >=10 && MultiBureauAccountList[i].ROI_Experiment__c<=46)
            {
   If(Temp_ROI_exp == 0 && Temp_Pl_currentBal == 0)
   {
      //system.debug('First Insert');
      //system.debug('@@CloseDate'+MultiBureauAccountList[i].Date_Closed__c);
      Temp_ROI_exp = MultiBureauAccountList[i].ROI_Experiment__c ;
      Temp_Pl_tradeline = String.valueof(MultiBureauAccountList[i].Date_Closed__c) ;
      Temp_Pl_currentBal = MultiBureauAccountList[i].Current_Balance__c ;
   }
      if(Temp_ROI_exp > 0)
            {
                if(Temp_ROI_exp > MultiBureauAccountList[i].ROI_Experiment__c)
                {
                    //system.debug('Second Insert');
                    Temp_ROI_exp = MultiBureauAccountList[i].ROI_Experiment__c ;
                    Temp_Pl_tradeline = String.valueof(MultiBureauAccountList[i].Date_Closed__c);
                    Temp_Pl_currentBal = MultiBureauAccountList[i].Current_Balance__c ;
                    
                }
                
            }
            }
            
  //End
 
          if(MultiBureauAccountList[i].High_Credit_or_Sanctioned_Amount__c==Ml.CL_Amt__c){
                MultiBureauAccountList[i].Live_CL_trade_line_Flag__c='Yes';
                MultiBureauAccountList[i].Last_12M_Repayment_Count_CL__c = dpd.repayCount(MultiBureauAccountList[i].Payment_History_1__c,MultiBureauAccountList[i].Payment_History_2__c,MultiBureauAccountList[i].Date_Reported_And_Certified__c,'CIBIL');
            }
            if(MultiBureauAccountList[i].High_Credit_or_Sanctioned_Amount__c==Ml.PL_Amt__c){
                MultiBureauAccountList[i].Live_PL_trade_line_Flag__c='Yes';  
                MultiBureauAccountList[i].Last_12M_Repayment_Count_PL__c = dpd.repayCount(MultiBureauAccountList[i].Payment_History_1__c,MultiBureauAccountList[i].Payment_History_2__c,MultiBureauAccountList[i].Date_Reported_And_Certified__c,'CIBIL');
            }
            if(MultiBureauAccountList[i].High_Credit_or_Sanctioned_Amount__c==Ml.HL_Amt__c){
                MultiBureauAccountList[i].Live_HL_trade_line_Flag__c='Yes';
                MultiBureauAccountList[i].Last_12M_Repayment_Count_HL__c = dpd.repayCount(MultiBureauAccountList[i].Payment_History_1__c,MultiBureauAccountList[i].Payment_History_2__c,MultiBureauAccountList[i].Date_Reported_And_Certified__c,'CIBIL');
            }
            if(MultiBureauAccountList[i].High_Credit_or_Sanctioned_Amount__c==Ml.BL_Highest_Loan_Amount__c){
                MultiBureauAccountList[i].Live_BL_trade_line_Flag__c='Yes';
                MultiBureauAccountList[i].Last_12M_Repayment_Count_BL__c = dpd.repayCount(MultiBureauAccountList[i].Payment_History_1__c,MultiBureauAccountList[i].Payment_History_2__c,MultiBureauAccountList[i].Date_Reported_And_Certified__c,'CIBIL');
            }
            if(MultiBureauAccountList[i].High_Credit_or_Sanctioned_Amount__c==Ml.GL_Highest_Loan_Amount__c){
                MultiBureauAccountList[i].Live_GL_trade_line_Flag__c='Yes';
                MultiBureauAccountList[i].Last_12M_Repayment_Count_GL__c = dpd.repayCount(MultiBureauAccountList[i].Payment_History_1__c,MultiBureauAccountList[i].Payment_History_2__c,MultiBureauAccountList[i].Date_Reported_And_Certified__c,'CIBIL');
            }
            String paymenthistory = MultiBureauAccountList[i].Payment_History_1__c;
            if(MultiBureauAccountList[i].Payment_History_2__c!=null) paymenthistory = MultiBureauAccountList[i].Payment_History_1__c + MultiBureauAccountList[i].Payment_History_2__c;
            if(MultiBureauAccountList[i].Date_Reported_And_Certified__c>dt.addmonths(-12)){
                tempnoofrepay = (paymenthistory.length())/3;
                noofrepay.add(tempnoofrepay);
            }
            
         Integer cal=0;
         Decimal Repayment_Months=0;
            Decimal length1=0,length2=0;
            if(MultiBureauAccountList[i].Payment_History_1__c!=null)
                length1=(MultiBureauAccountList[i].Payment_History_1__c).length();
            if(MultiBureauAccountList[i].Payment_History_2__c!=null)
                length2=(MultiBureauAccountList[i].Payment_History_2__c).length();
            Repayment_Months=(length1+length2)/3;
            //system.debug('###RepaymentMonths '+ Repayment_Months);
            if(MultiBureauAccountList[i].Date_Closed__c != null)cal = (((system.today().year() - MultiBureauAccountList[i].Date_Closed__c.year())*12) + (Date.today().month() - MultiBureauAccountList[i].Date_Closed__c.month()));
              if(MultiBureauAccountList[i].Account_Type__c == '2' ||MultiBureauAccountList[i].Account_Type__c == '02'|| MultiBureauAccountList[i].Account_Type__c == '3' ||MultiBureauAccountList[i].Account_Type__c == '03')
              {
                    if((MultiBureauAccountList[i].Date_Closed__c != null && cal <=36)||MultiBureauAccountList[i].Date_Closed__c == null)
                    {
                        if(MultiBureauAccountList[i].High_Credit_or_Sanctioned_Amount__c> HL_Derog_High_Credit_or_Sanctioned_Amount)
                        {
                        HL_Derog_High_Credit_or_Sanctioned_Amount = MultiBureauAccountList[i].High_Credit_or_Sanctioned_Amount__c;                                                                     
                        HL_Derog_Date_Closed = MultiBureauAccountList[i].Date_Closed__c;
                        HL_Derog_Account_Type = MultiBureauAccountList[i].Account_Type__c;
                        HL_Derog_Repayment_Months = Repayment_Months;
                        }
                    }
                  
                }
           if(MultiBureauAccountList[i].Account_Type__c == '05' ||MultiBureauAccountList[i].Account_Type__c == '5')
            {
                if((MultiBureauAccountList[i].Date_Closed__c != null && cal <= 36) ||MultiBureauAccountList[i].Date_Closed__c == null) 
                    {
                        if(MultiBureauAccountList[i].High_Credit_or_Sanctioned_Amount__c> PL_Derog_High_Credit_or_Sanctioned_Amount)
                        {
                        PL_Derog_High_Credit_or_Sanctioned_Amount = MultiBureauAccountList[i].High_Credit_or_Sanctioned_Amount__c;                                                                    
                        PL_Derog_Date_Closed = MultiBureauAccountList[i].Date_Closed__c;
                        PL_Derog_Account_Type = MultiBureauAccountList[i].Account_Type__c;
                        PL_Derog_Current_Balance = MultiBureauAccountList[i].Current_balance__c;
                        PL_Derog_Repayment_Months = Repayment_Months;
                        }
                    }
                      
            }
              if(MultiBureauAccountList[i].Account_Type__c == '01') // Auto Loan 
              {
                    if((MultiBureauAccountList[i].Date_Closed__c != null && cal <=36)||MultiBureauAccountList[i].Date_Closed__c == null)
                    {
                        if(MultiBureauAccountList[i].High_Credit_or_Sanctioned_Amount__c> AL_Derog_High_Credit_or_Sanctioned_Amount)
                        {
                        AL_Derog_High_Credit_or_Sanctioned_Amount = MultiBureauAccountList[i].High_Credit_or_Sanctioned_Amount__c;                                                                     
                        AL_Derog_Date_Closed = MultiBureauAccountList[i].Date_Closed__c;
                        AL_Derog_Account_Type = MultiBureauAccountList[i].Account_Type__c;
                        }
                    }
                  
                }
                if(MultiBureauAccountList[i].Account_Type__c == '50' ||MultiBureauAccountList[i].Account_Type__c == '51'|| MultiBureauAccountList[i].Account_Type__c == '52' ||MultiBureauAccountList[i].Account_Type__c == '55'||MultiBureauAccountList[i].Account_Type__c == '59'||MultiBureauAccountList[i].Account_Type__c == '61'||MultiBureauAccountList[i].Account_Type__c == '12') // Business Loan
              {
                    if((MultiBureauAccountList[i].Date_Closed__c != null && cal <=36)||MultiBureauAccountList[i].Date_Closed__c == null)
                    {
                        if(MultiBureauAccountList[i].High_Credit_or_Sanctioned_Amount__c> BL_Derog_High_Credit_or_Sanctioned_Amount)
                        {
                        BL_Derog_High_Credit_or_Sanctioned_Amount = MultiBureauAccountList[i].High_Credit_or_Sanctioned_Amount__c;                                                                     
                        BL_Derog_Date_Closed = MultiBureauAccountList[i].Date_Closed__c;
                        BL_Derog_Account_Type = MultiBureauAccountList[i].Account_Type__c;
                        }
                    }
                  
                }
                 if(MultiBureauAccountList[i].Account_Type__c == '13') // Two Wheeler Loan 
              {
                    if((MultiBureauAccountList[i].Date_Closed__c != null && cal <=36)||MultiBureauAccountList[i].Date_Closed__c == null)
                    {
                        if(MultiBureauAccountList[i].High_Credit_or_Sanctioned_Amount__c> TWL_Derog_High_Credit_or_Sanctioned_Amount)
                        {
                        TWL_Derog_High_Credit_or_Sanctioned_Amount = MultiBureauAccountList[i].High_Credit_or_Sanctioned_Amount__c;                                                                     
                        TWL_Derog_Date_Closed = MultiBureauAccountList[i].Date_Closed__c;
                        TWL_Derog_Account_Type = MultiBureauAccountList[i].Account_Type__c;
                        }
                    }
                  
                }
                if(MultiBureauAccountList[i].Account_Type__c != null) //All tradelines
              {
                    if((MultiBureauAccountList[i].Date_Closed__c != null && cal <=36)||MultiBureauAccountList[i].Date_Closed__c == null)
                    {
                        if(MultiBureauAccountList[i].High_Credit_or_Sanctioned_Amount__c> ALL_Derog_High_Credit_or_Sanctioned_Amount)
                        {
                        ALL_Derog_High_Credit_or_Sanctioned_Amount= MultiBureauAccountList[i].High_Credit_or_Sanctioned_Amount__c;                                                                     
                        ALL_Derog_Date_Closed = MultiBureauAccountList[i].Date_Closed__c;
                        }
                    }
                  
                }   
            
                   
               if((MultiBureauAccountList[i].Account_Type__c == '10' ||MultiBureauAccountList[i].Account_Type__c == '31'||MultiBureauAccountList[i].Account_Type__c == '36')&& MultiBureauAccountList[i].Date_closed__c == null)
            {    
               if(MultiBureauAccountList[i].High_Credit_or_Sanctioned_Amount__c != null)temp_sanctionamount = MultiBureauAccountList[i].High_Credit_or_Sanctioned_Amount__c;
               if(MultiBureauAccountList[i].Credit_Limit__c != null)temp_creditlimit = MultiBureauAccountList[i].Credit_Limit__c;
               if(MultiBureauAccountList[i].Current_balance__c != null)temp_currentbalance =MultiBureauAccountList[i].Current_balance__c;       
                max1 = math.max(temp_sanctionamount,temp_creditlimit);
                max2 = math.max(max1,temp_currentbalance);                                                
                if(max2>netmax)                                                                                                  
                {
                netmax = max2; 
                CC_Derog_Date_Closed = MultiBureauAccountList[i].Date_Closed__c;               
                CC_Derog_Account_Type = MultiBureauAccountList[i].Account_Type__c;
                CC_Derog_High_Credit_or_Sanctioned_Amount = MultiBureauAccountList[i].High_Credit_or_Sanctioned_Amount__c;
                CC_Derog_Credit_Limit = MultiBureauAccountList[i].Credit_Limit__c;
                CC_Derog_Current_Balance = MultiBureauAccountList[i].Current_balance__c;
                CC_Derog_Repayment_Months = Repayment_Months;
                }              
            }                
          if(MultiBureauAccountList[i].Account_Type__c == '2' || MultiBureauAccountList[i].Account_Type__c == '02'||MultiBureauAccountList[i].Account_Type__c == '01'||MultiBureauAccountList[i].Account_Type__c == '1'||MultiBureauAccountList[i].Account_Type__c == '32'||MultiBureauAccountList[i].Account_Type__c == '10'||MultiBureauAccountList[i].Account_Type__c == '31'||MultiBureauAccountList[i].Account_Type__c == '36'||MultiBureauAccountList[i].Account_Type__c == '05'||MultiBureauAccountList[i].Account_Type__c == '5'||MultiBureauAccountList[i].Account_Type__c == '17'||MultiBureauAccountList[i].Account_Type__c == '39'||MultiBureauAccountList[i].Account_Type__c == '61'||MultiBureauAccountList[i].Account_Type__c == '12'||MultiBureauAccountList[i].Account_Type__c == '53'||MultiBureauAccountList[i].Account_Type__c == '57'||MultiBureauAccountList[i].Account_Type__c == '52'||MultiBureauAccountList[i].Account_Type__c == '54')
              {
              if(Ml.Oldest_Loan_on_Bureau_in_Months__c > 18 && Ml.Oldest_Loan_on_Bureau_in_Months__c < 36)
              vintagecount = vintagecount + 1;
              }  
        }
     
        Ml.Unsecured_FOIR__c = dpd.UnsecFOIR(MultiBureauAccountList, cid);      
        Ml.Rating_Score__c = calculateScore(Ml.CL_Amt__c,Ml.AL_Amt__c,Ml.PL_Amt__c,Ml.HL_Amt__c,Ml.LAP_Amt__c);
        //system.debug('rating 1605'+Ml.Rating_Score__c);
        //system.debug('Ml.Total_Accounts_as_per_CIBIL__c-Ml.No_of_Closed_loan__c'+(Ml.Total_Accounts_as_per_CIBIL__c-Ml.No_of_Closed_loan__c));
        //system.debug('Re.DPD6Count :'+Re.DPD6Count);
        
        MSize = MultiBureauScoreList.size(); 
        //system.debug('******MSize'+MSize);
        //system.debug('****Score:' +Ml.Score__c +Ml.Bureau__c);
        for (Integer i = 0; i < MSize; i++) {
            //system.debug('Scorelist:' +MultiBureauScoreList[i].Score__c);
             if(!Test.isRunningTest()){
                if(MultiBureauScoreList[i].ScoreName__c.contains('CIBIL')){
                    String scorestring = MultiBureauScoreList[i].Score__c;
                    //system.debug('##scorestring'+scorestring);
                    if (scorestring !=Null){
                        String First = scorestring.substring(0, 3); 
                        //system.debug('##First - '+First);
                        string finalscore;        
                        if (Integer.valueof(First) == 0) {
                            String Second = Scorestring.substring(3, 5);
                            //system.debug('##Second - '+Second);
                            Finalscore = Second;
                        } else {
                            Finalscore = scorestring;
                        }
                        Ml.Score__c = Integer.Valueof(Finalscore);
                    } else {
                        Ml.Score__c = 0;
                    }
                  //  Ml.Bureau__c = MultiBureauScoreList[i].ScoreName__c;
                    Ml.CIBIL_Version__c = MultiBureauScoreList[0].ScoreName__c;
                    //system.debug('******I'+i);
                    //system.debug('****Score:' +Ml.Score__c +Ml.Bureau__c);
                }
            }
        }
        //Ml.Customer_Profile__c = getCustomerProfile(Ml.Total_no_of_live_loans__c, Ml.Sum_of_Sanction_amount_of_all_active_acc__c,Re.repaymentMonths,Ml.Score__c);
        if(Ml.Score__c<300)
            Ml.Customer_Profile__c='Bureau NTC';
        else
            Ml.Customer_Profile__c = getCustomerProfile(MultiBureauAccountList);
        //system.debug('## customerProfile '+Ml.Customer_Profile__c);
        Re.customerProfile= Ml.Customer_Profile__c;
        Ml.HL_Derog_Repayment_Months__c=Integer.valueOf(HL_Derog_Repayment_Months);
        Ml.PL_Derog_Repayment_Months__c=Integer.valueOf(PL_Derog_Repayment_Months);
        Ml.CC_Derog_Repayment_Months__c=Integer.valueOf(CC_Derog_Repayment_Months);
        Ml.cust_segment__c =  Bureau_cls.cust_segment;
        Ml.cust_segment_ver__c = Bureau_cls.cust_segment_ver;
        if(Bureau_cls.uniqueID != null){
            Ml.CasesafeId__c = Bureau_cls.uniqueID.remove('TUEF12');
        }
        if(Bureau_cls.riskBand != null && Bureau_cls.riskBand != ''){
            Ml.NTC_Risk_Band__c = Integer.valueof(Bureau_cls.riskBand);
        }
        if(Bureau_cls.Max_Monthly_Obligation_L48M != null && Bureau_cls.Max_Monthly_Obligation_L48M != ''){
            Ml.Max_Monthly_Obligation_L48M__c = Decimal.valueof(Bureau_cls.Max_Monthly_Obligation_L48M);
        }
        if(Bureau_cls.Payday_Loans_flag != null && Bureau_cls.Payday_Loans_flag != ''){
            Ml.Payday_Loans_flag__c = Integer.valueof(Bureau_cls.Payday_Loans_flag);
        }
        if(Bureau_cls.Velocity_enquiry != null && Bureau_cls.Velocity_enquiry != ''){
            Ml.Velocity_enquiry__c = Integer.valueof(Bureau_cls.Velocity_enquiry);
        }
        if(Bureau_cls.Velocity_tradelines   != null && Bureau_cls.Velocity_tradelines != ''){
            Ml.Velocity_tradelines__c = Integer.valueof(Bureau_cls.Velocity_tradelines);
        }
        Ml.Contact__c = cid;
        Ml.summary_flag__c = True;
        If (Jsonstr !=Null){
            Ml.Id = Null;
            Customer_Category_cls ccc = new Customer_Category_cls();
            Map<String,String> catmap = ccc.getCategory(Ml.HL_Highest_Loan_Amount__c, Ml.AL_Highest_Loan_Amount__c, Ml.PL_Highest_Loan_Amount__c, Ml.Two_Wheeler_Highest_Loan_Amount__c, Ml.CC_Highest_Loan_Amount__c,Integer.valueof(Ml.Total_Loans__c),Integer.valueof(Ml.No_of_Closed_loan__c));
            
            
            Lead l;
           // Contact con = [select id,AccountId,Lead__c,Pulled_LeadSource__c from contact where id=:cid];
            Lead_Source1__c IL = Lead_Source1__c.getValues('IndiaLends');
            if(!Test.isRunningTest()){
                IndiaLends = IL.Lead_Source_Name__c;
            }
            if(con.AccountId==null){
                l = [select id,LeadSource_S__c,Net_Salary_Monthly__c from Lead where id=:con.Lead__c];
                if(l.LeadSource_S__c==IndiaLends){
                    noofrepay.sort();
                    Integer count1;
                    Integer count2;
                    if(noofrepay.size()>=1){
                        count1 = noofrepay[noofrepay.size()-1];
                    }
                    //system.debug('score :'+Ml.Score__c);
                    //system.debug('cat :'+catmap.get('Customer Category'));
                    //system.debug('salary :'+l.Net_Salary_Monthly__c);
                    //system.debug('dpd :'+Ml.Last_6M_Highest__c);
                    //system.debug('write off:'+Ml.No_of_Write_Offs_in_24M__c);
                    //system.debug('over :'+Ml.Overdue_Amount__c);
                    //system.debug('noofrepay :'+noofrepay);
                    //system.debug('count1 :'+count1);
                    //system.debug('count2 :'+count2);
                    if(Ml.Score__c>=700 && (((catmap.get('Customer Category')=='Category A'||catmap.get('Customer Category')=='Category B') && l.Net_Salary_Monthly__c>=30000)||(catmap.get('Customer Category')=='Category C' && l.Net_Salary_Monthly__c>=20000)) && Ml.Last_6M_Highest__c<=0 && Ml.No_of_Write_Offs_in_24M__c<=0 && Ml.Overdue_Amount__c<=5000 && count1>=6){
                        Ml.Rating_Score__c= Ml.Rating_Score__c;
                    }else{
                        Ml.Rating_Score__c=0; //&& (Ml.Total_Accounts_as_per_CIBIL__c-Ml.No_of_Closed_loan__c)<=2    
                    } 
                } 
            }
            
            if((Ml.Total_Loans__c-Ml.No_of_Closed_loan__c)>=2 && Re.DPD6M<0 && Ml.Score__c>=675) Ml.Rating_Score__c=0;
            
            //system.debug('rating 1750 :'+Ml.Rating_Score__c);
            mbd.add(Ml);
             //system.debug('Multibureau Data :'+mbd);
            If (Returnflag !='Y') {
                if(Ml.Date_Reported__c==null) Ml.Date_Reported__c =system.today().addDays(-4);
                insert Ml;
                /*Change01*/}
            else {
            if(Ml.Sum_of_Sanction_Amount_BL__c==null)Ml.Sum_of_Sanction_Amount_BL__c = 0;
            if(Ml.Sum_of_Sanction_Amount_CL__c==null)Ml.Sum_of_Sanction_Amount_CL__c = 0;
            if(Ml.Sum_of_Sanction_Amount_EL__c==null)Ml.Sum_of_Sanction_Amount_EL__c = 0;
            if(Ml.Sum_of_Sanction_Amount_PL__c==null)Ml.Sum_of_Sanction_Amount_PL__c = 0;
            if(Ml.Sum_of_Sanction_Amount_TW__c==null)Ml.Sum_of_Sanction_Amount_TW__c = 0;
                    /*Change01*/    Re.Last_3M_DPD_Count = Ml.Last_3M_DPD_Count__c; 
                    /*Change01*/    Re.CC_HighestOverdue = Ml.CC_HighestOverdue__c;
                    /*Change01*/    Re.CC_No_of_Write_Offs_in_24M = Ml.CC_No_of_Write_Offs_in_24M__c;
                    /*Change01*/    Re.No_of_Write_Offs_in_24M = Ml.No_of_Write_Offs_in_24M__c;
                    Re.No_of_Write_Offs_in_12M = Ml.No_of_Write_Offs_in_12M__c;
                    Re.No_of_Write_Offs_in_18M = Ml.No_of_Write_Offs_in_18M__c; 
                    /*Change02*/    Re.SecondaryCount = MultibureausecondaryMatcheslist.size();
                    Re.Date_Closed= Ml.Date_Closed__c;
                    //system.debug('cc 1551:'+Ml.Credit_Cards_Indebtedness__c);
                    Re.ccIndebtedness = Ml.Credit_Cards_Indebtedness__c;
                    Re.Written_Off_And_Settled_Status =Ml.Write_Off_Status__c;
                    Re.Overdue_Amount = Ml.Overdue_Amount__c;
                    Re.panlist = panlist;
                    Re.plAmount = Ml.PL_Highest_Loan_Amount__c;
                    Re.alAmount = Ml.AL_Highest_Loan_Amount__c;
                    Re.ccAmount = Ml.CC_Highest_Loan_Amount__c;
                    Re.hlAmount = Ml.HL_Highest_Loan_Amount__c;
                    Re.twamount = Ml.Two_Wheeler_Highest_Loan_Amount__c;
                    Re.lapAmount = Ml.LAP_Highest_Loan_Amount__c;
                    Re.clAmount = Ml.CL_Highest_Loan_Amount__c;
                    Re.blAmount = Ml.BL_Highest_Loan_Amount__c;
                    Re.maxOD24mnths = Ml.Max_Overdue_amount_in_last_24_months__c;
                    Re.maxOD12mnths = Ml.Max_Overdue_amount_in_last_12_months__c;
                    //system.debug('Re.maxOD24mnths :'+Re.maxOD24mnths);
                    Re.rating = Ml.Rating_Score__c;
                    Re.custCategory = catmap.get('Customer Category');
                    Re.subCategory = catmap.get('Sub Category');
                    //Re.liveloans = Integer.valueof(catmap.get('liveloans'));
                    Re.liveloans = Ml.Total_no_of_live_loans__c;
                    Re.DPD3M = Ml.Last_3M_Highest__c;
                    Re.DPD6M =Ml.Last_6M_Highest__c;
                    Re.DPD9M = Ml.Last_9M_Highest__c;
                    Re.DPD12M = Ml.Last_12M_Highest__c;
                    Re.DPD18M = Ml.Last_18M_Highest__c;
                    Re.DPD24M = Ml.Last_24M_Highest__c;
                    Re.DPD36M = Ml.Last_36M_Highest__c;
                    Re.DPD3Count = Ml.Last_3M_DPD_Count__c;
                    Re.DPD6Count = Ml.Last_6M_DPD_Count__c;
                    Re.DPD9Count = Ml.Last_9M_DPD_Count__c;
                    Re.DPD12Count = Ml.Last_12M_DPD_Count__c;
                    Re.DPD18Count = Ml.Last_18M_DPD_Count__c;
                    Re.DPD24Count = Ml.Last_24M_DPD_Count__c;
                    Re.DPD36Count = Ml.Last_36M_DPD_Count__c;
                    Re.DPD12woutdtCount = Ml.Last_12M_DPD_Count_without_date__c;
                    Re.DPD3woutdtCount = Ml.Last_3M_DPD_Count_without_date__c;
                    Re.DPD6woutdtCount = Ml.Last_6M_DPD_Count_without_date__c;
                    Re.DPD9woutdtCount = Ml.Last_9M_DPD_Count_without_date__c;
                    Re.DPD18woutdtCount = Ml.Last_18M_DPD_Count_without_date__c; 
                    Re.DPD24woutdtCount = Ml.Last_24M_DPD_Count_without_date__c; 
                    Re.DPD36woutdtCount = Ml.Last_36M_DPD_Count_without_date__c;
                    Re.ODBalCIBIL1 = Ml.Overdue_Amt_L3M_excl_GL__c; 
                    Re.ODBalCIBIL2 = Ml.Overdue_Amt_L3M_excl_GL_CC__c; 
                    Re.DPD36_90CountWtDt1 = Ml.L36M_Highest_excluding_GL__c; 
                    Re.DPD36_90CountWtDt2 = Ml.L36M_Highest_excluding_GL_CC_CL__c; 
                    Re.highest3DPDtradeline = Ml.Last_3_months_Highest_DPD_Live_Tradeline__c;
                    Re.highest12DPDtradeline = Ml.Last_12months_Highest_DPD_Live_Tradeline__c;
                    Re.DPD3MWtDt = Ml.Last_3M_Highest_without_date__c;
                    Re.DPD6MWtDt = Ml.Last_6M_Highest_without_date__c;
                    Re.DPD9MWtDt = Ml.Last_9M_Highest_without_date__c;
                    Re.DPD12MWtDt = Ml.Last_12M_Highest_without_date__c; 
                    Re.DPD18MWtDt = Ml.Last_18M_Highest_without_date__c; 
                    Re.DPD24MWtDt = Ml.Last_24M_Highest_without_date__c; 
                    Re.DPD36MWtDt = Ml.Last_36M_Highest_without_date__c; 
                    Re.DPD3_30CountWtDt = Ml.Last_3M_30DPD_Count_without_date__c; 
                    Re.DPD6_30CountWtDt = Ml.Last_6M_30DPD_Count_without_date__c;
                    Re.DPD9_30CountWtDt = Ml.Last_9M_30DPD_Count_without_date__c;
                    Re.DPD12_30CountWtDt = Ml.Last_12M_30DPD_Count_without_date__c;
                    Re.DPD18_30CountWtDt = Ml.Last_18M_30DPD_Count_without_date__c;
                    Re.DPD24_30CountWtDt = Ml.Last_24M_30DPD_Count_without_date__c;
                    Re.liveCL = Ml.No_of_Live_CL__c;
                    Re.livePL = Ml.No_of_Live_PL__c;
                    Re.liveBL = Ml.No_of_Live_BL__c;
                    Re.plenquiries = Ml.PL_enquiries_in_last_6_months__c;
                    Re.plavailed = Ml.PL_Availed_in_Last_6Months__c;
          Re.Total_Accounts_as_per_CIBIL = Ml.Total_Accounts_as_per_CIBIL__c ;
                    Re.payhis = Ml.Payhis_check__c;
                    Re.totunsecureLoans = Ml.No_of_Total_unsecured_live_loans__c;
                                    Re.totunsecureLoansMSME = Ml.No_Of_Total_UnSecured_Live_Loans_MSME__c;
                    Re.countPl3M = Ml.Number_of_PL_availed_in_last_3_M__c;
                    Re.SMA_SUB_DBT_LSS_Count_in_L36M = Ml.SMA_SUB_DBT_LSS_Count_in_L36M__c;
                    Re.maxODCC = Ml.Max_Overdue_Amount_CC__c;
                    Re.unsecFOIR = Ml.Unsecured_FOIR__c;
                    Re.sumPL = Ml.Sum_of_Sanction_Amount_PL__c;
                    Re.sumBL = Ml.Sum_of_Sanction_Amount_BL__c;
                    Re.sumAL = Ml.Sum_of_Sanction_Amount_AL__c;
                    Re.sumCL = Ml.Sum_of_Sanction_Amount_CL__c;
                    Re.sumEL = Ml.Sum_of_Sanction_Amount_EL__c;
                    Re.sumHL = Ml.Sum_of_Sanction_Amount_HL__c;
                    Re.sumTW = Ml.Sum_of_Sanction_Amount_TW__c;
                    Re.sumLAP = Ml.Sum_of_Sanction_Amount_LAP__c;
                    Re.sumGL = Ml.Sum_of_Sanction_Amount_GL__c;
                    Re.sumCC = Ml.Sum_of_Sanction_Amount_CC__c;
                    Re.minCC = Ml.Min_MOB_CC__c;
                    Re.maxCC = Ml.Max_MOB_CC__c;
                    Re.minCL = Ml.Min_MOB_CL__c;
                    Re.maxCL = Ml.Max_MOB_CL__c;
                    Re.minPL = Ml.Min_MOB_PL__c;
                    Re.maxPL = Ml.Max_MOB_PL__c;
                    Re.minAL = Ml.Min_MOB_AL__c;
                    Re.maxAL = Ml.Max_MOB_AL__c;
                    Re.minBL = Ml.Min_MOB_BL__c;
                    Re.maxBL = Ml.Max_MOB_BL__c;
                    Re.minHL = Ml.Min_MOB_HL__c;
                    Re.maxHL = Ml.Max_MOB_HL__c;
                    Re.minGL = Ml.Min_MOB_GL__c;
                    Re.maxGL = Ml.Max_MOB_GL__c;
                    Re.minEL = Ml.Min_MOB_EL__c;
                    Re.maxEL = Ml.Max_MOB_EL__c;
                    Re.minTW = Ml.Min_MOB_TW__c;
                    Re.maxTW = Ml.Max_MOB_TW__c;
                    Re.minLAP = Ml.Min_MOB_LAP__c;
                    Re.maxLAP = Ml.Max_MOB_LAP__c;
                    Re.unsec1M = Ml.No_of_unsecured_loans_in_last_1_months__c;
                    Re.unsec2M = Ml.No_of_unsecured_loans_in_last_2_months__c;
                    Re.unsec3M = Ml.No_of_unsecured_loans_in_last_3_months__c;
                    Re.unsec6M = Ml.No_of_unsecured_loans_in_last_6_months__c;
                    Re.unsec9M = Ml.No_of_unsecured_loans_in_last_9_months__c;
                    Re.unsec12M = Ml.No_of_unsecured_loans_in_last_12_months__c;
                    Re.unsec3MMSME = Ml.Total_unsecured_loans_in_last_3M_MSME__c;
                	Re.unsec6MMSME = Dpdre.unsec6MMSME;
                	Re.SecAccTypeBureauMSME = Dpdre.SecAccTypeBureauMSME;
                	Re.closed_unsec_gt_20KMSME = JsonParsingHelper.closed_unsec_gt_20KMSME;
                	Re.sumOfSnctnAmtClosedLoans = JsonParsingHelper.sumOfSnctnAmtClosedLoans;
                	Re.maxSnctnAmtClosedLoans = JsonParsingHelper.maxSnctnAmtClosedLoans;
                	Re.diffSnctnCurrBalLiveLoans = JsonParsingHelper.diffSnctnCurrBalLiveLoans;
                	Re.maxMSMEBLVintage = JsonParsingHelper.maxMSMEBLVintage;


                    Re.ratioUnsec = Ml.Ratio_of_Unsecure_to_Secure__c;
                    Re.CC_enquiries_in_last_3_months = Ml.CC_enquiries_in_last_3_months__c;
                    Re.ALOwnStatus = Ml.Ownership_Status_AL__c;
                    Re.HLOwnStatus = Ml.Ownership_Status_HL__c;
                    Re.LAPOwnStatus = Ml.Ownership_Status_LAP__c;
                    Re.sumunsecLoanAmtin12M = Ml.Sum_Of_Unsecured_Loan_Amt_Opened_In_L12M__c;
                    Re.nooftrades6M = Ml.No_Of_Tradelines_in_30DPD_in_L6__c;
                    Re.totenqLast3M = Ml.Total_No_of_Enq_in_Last_3_Months__c;
                    Re.totenqLast6M = Ml.Total_No_of_Enq_in_Last_6_Months__c;
                    Re.oldestLoan = Ml.Oldest_Loan_on_Bureau_in_Months__c ;
                    Re.clenquiries = Ml.CL_enquiries_in_last_6_months__c ;
                    Re.clenquiries3 = Ml.CL_enquiries_in_last_3_months__c ;
                    Re.SMA = Ml.SMA_Count__c;
                    Re.STD = Ml.STD_Count__c;
                    Re.SUB = Ml.SUB_Count__c;
                    Re.DBT = Ml.DBT_Count__c;
                    Re.LSS = Ml.LSS_Count__c;
                    Re.XXX = Ml.XXX_Count__c;
                    Re.NegCIBILStatusCount = Ml.Neg_CIBIL_Status_Count__c;
                    Re.totSecLoans = Ml.No_of_Total_secured_loans__c;
                    Re.totalNoofSecEnqinLast6M = Ml.Total_secured_enquiries_in_last_6_months__c;
                    Re.totalNoofUnsecEnqinLast6M = Ml.Total_Unsecured_enquiries_in_last_6_mths__c;
                    Re.totalNoofUnsecEnqinLast12M = Ml.Total_Unsecured_enquiries_in_last_12_mth__c;
                    Re.noOfUnsecuredLoanInLast3M = Ml.No_of_unsecured_loans_in_last_3_months__c;
                    Re.totalNoofUnsecEnqinLast3Months = Ml.Total_Unsecured_enquiries_in_last_3_mths__c;
                    Re.totalNoofUnsecEnqinLast3MonthsMSME = Ml.Total_Unsecured_enq_in_last_3_mths_MSME__c;
                	Re.No_of_USL_Enquiries_for_MSME_in_L1M = Ml.No_of_USL_Enquiries_for_MSME_in_L1M__c;
                	Re.No_LIVE_USL_SANC_MORE_THAN_20K = Ml.No_LIVE_USL_SANC_MORE_THAN_20K__c;
                    Re.noOfUnsecuredLoanInLast3MMSME = Ml.Total_unsecured_loans_in_last_3M_MSME__c;

                    Re.mbal = MultiBureauAccountList;
                    Re.mPhonelist =MultiBureauPhoneList;
                    Re.mscrlist = MultiBureauscoreList;
                     //system.debug('Multibureau Data**'+ mbd);
                    Re.multibureau =mbd;
                     //system.debug('Multibureau Account List'+Re.mbal);
                    //system.debug('Multibureau Score List'+ Re.mscrlist);
                    Re.newestLoan = Ml.Newest_Loan_on_Bureau_in_Months__c;
                    //added for income model
                     Re.mbEnqlist = MultiBureauEnquiryList;
                     Re.Total_EMI_Amount=Ml.Total_EMI_Amount__c;
                     Re.Total_EMI_Loan_Count=Ml.Total_EMI_Loan_Count__c;
                     Re.Total_Credit_Cards_Accounts=Ml.Total_Credit_Cards_Accounts__c;
                     Re.Indebtedness_as_per_CIBIL=Ml.Indebtedness_as_per_CIBIL__c;
                     Re.Indebtedness_of_Curr_PersonalUnsecure= Ml.Indebtedness_of_Curr_PersonalUnsecure__c;
                     Re.Indebtedness_as_per_Bureau = Ml.Indebtedness_as_per_CIBIL__c;
                     Re.totUnsecloans = Ml.No_of_Total_unsecured_loans__c;
                     Re.SMASUBDBTLSS = Ml.SMASUBDBTLSS_count__c ;
                     Re.plenquiries12 = Ml.PL_enquiries_in_last_12_months__c;
                     Re.TotalLiveLoans = Ml.Total_no_of_live_loans__c;
                     Re.midlist = MultiBureauIdList;
                     //system.debug('Multibureau ID List'+ Re.midlist );
                     Re.mAddresslist = MultiBureauAddressList ;
                     //system.debug('Multibureau Address List'+ Re.mAddresslist );
                     Re.max_cc_utilization = Ml.Credit_Card_Utilization__c;
                     Re.closedLoans = Ml.No_of_Closed_loan__c;
                     Re.sum_BL_CL_EL_PL_TW = Ml.Sum_of_Sanction_Amount_BL__c+Ml.Sum_of_Sanction_Amount_CL__c+Ml.Sum_of_Sanction_Amount_EL__c+Ml.Sum_of_Sanction_Amount_PL__c+Ml.Sum_of_Sanction_Amount_TW__c;
                     Re.unsecuredLiveLoansAvailed3M = Ml.Unsecured_Live_Loans_Availed_3Months__c;
                     Re.unsecuredLiveLoansAvailed6M = Ml.Unsecured_Live_Loans_Availed_6Months__c;
                     Re.unsecuredLiveLoansAvailed12M = Ml.Unsecured_Live_Loans_Availed_12Months__c;
                     Re.no_of_suit_filed = Ml.No_of_Suit_Filed__c;
                     Re.no_of_Closed_CC = Ml.no_of_Closed_CC__c;
                     Re.mbacbl = newlstAccType;
                     Re.CIBIL_version = Ml.CIBIL_Version__c;
                     Re.DPD1MWtDt = Ml.Highest_DPD_in_last_1_month__c;
                     Re.minrepaymentMonths = dpdre.minrepaymentMonths;
                     Re.totalNoofUnsecEnqinLast1Months = Ml.Total_Unsecured_enquiries_in_last_1_mths__c;
                     Re.totalNoofUnsecEnqinLast2Monthss = Ml.Total_Unsecured_enquiries_in_last_2_mths__c;
                     Re.newTradelinesLast6Months = Ml.Total_new_tradeline_in_last_6_months__c;
                     Re.sum_of_sanctioned_amt = Ml.Sum_of_Sanction_amount_of_all_active_acc__c;
                     Re.sum_of_total_sanctioned_amt = Ml.Sum_of_Sanction_amount_of_all_acc__c;
                     Re.DPD36PLCC = Ml.Last_36_months_Highest_DPD_PL_CC_GRTN50K__c;
                     Re.DPD36All = Ml.Last_36_months_Highest_DPD_GRTN5K__c;
                     Re.totalRePayments24 = Ml.No_of_Repayments_in_24_months__c;
                     Re.totalRePayments12 = Ml.No_of_Repayments_in_12_Months__c;
                     Re.sma_lss_L24M = Ml.Number_of_SMA_LSS_account_in_last_24_M__c;
                     Re.sub_dbt_L6M = Ml.Number_of_SUB_DBT_account_in_last_6_M__c;
                     Re.SMA24 = Ml.SMASUBDBTLSS_count24__c;
                     Re.currentBalance90DPD12M = Ml.Current_balance_last_12M_90_DPD__c;
                     Re.SMA18 = Ml.SMASUBDBTLSS_count18__c;
                     Re.Overdue_Balances_as_per_CIBIL = Ml.Overdue_Balances_as_per_CIBIL__c;
                     Re.WrittenOffAmount = Ml.Loan_Written_off_Amount__c;
                     Re.WrittenOffAmountCC=ml.CC_Written_off_Amount__c ;
     Re.Sum_of_Sanc_Amt_of_other_unsecured_tradl = Ml.Sum_of_Sanc_Amt_of_other_unsecured_tradl__c;
     Re.No_of_other_unsecured_tradelines_act = Ml.No_of_other_unsecured_tradelines_act__c;
     Re.Sum_of_Curr_bal_for_all_other_unsecured = Ml.Sum_of_Curr_bal_for_all_other_unsecured__c;
     Re.Sum_of_Sanction_Amt_of_all_Act_Mortg_HL = Ml.Sum_of_Sanction_Amt_of_all_Act_Mortg_HL__c;
     Re.Sum_of_CurBal_for_all_Act_Mortg_HL = Ml.Sum_of_CurBal_for_all_Act_Mortg_HL__c;
     Re.No_of_Active_Mortgages_HL = Ml.No_of_Active_Mortgages_HL__c;
     Re.Sum_of_high_Sanction_Amount_credit_limi = Ml.Sum_of_high_Sanction_Amount_credit_limi__c;
     Re.Sum_of_Current_balance_for_all_Active_CC = Ml.Sum_of_Current_balance_for_all_Active_CC__c;
     Re.No_of_Active_CC = Ml.No_of_Active_CC__c;
     Re.Sum_of_Sanction_Amount_of_all_Active_PL = Ml.Sum_of_Sanction_Amount_of_all_Active_PL__c;
     Re.No_of_Active_PL= Ml.No_of_Active_PL__c;
     Re.Sum_of_Sanction_Amount_of_all_Acti_CL_CD = Ml.Sum_of_Sanction_Amount_of_all_Acti_CL_CD__c;
     Re.Sum_of_Current_balance_for_all_Active_PL = Ml.Sum_of_Current_balance_for_all_Active_PL__c;
     Re.Sum_of_Current_balance_for_all_Active_CL = Ml.Sum_of_Current_balance_for_all_Active_CL__c;
     Re.No_of_Active_CL= Ml.No_of_Active_CL__c;
      			Re.DPD12_90CountWtDt=ml.Last_12M_90DPD_Count_without_date__c;
                Re.MAX_CC_OD_UTILIZATION = Ml.MAX_CC_OD_UTILIZATION__c;
                Re.Overdue_CC_KCC_GL = Ml.Overdue_CC_KCC_GL__c;
                Re.unsecuredLoansLS20KExclCCKCCGL_L3MCount = JsonParsingHelper.unsecuredLoansLS20KExclCCKCCGL_L3MCount;
				Re.DPD_L1M_EX_GL_CC_KCC_OVERDUE = Ml.DPD_L1M_EX_GL_CC_KCC_OVERDUE__c;
				Re.DPD30Plus_L12M_EX_GL_CC_KCC = Ml.DPD30Plus_L12M_EX_GL_CC_KCC__c;
				Re.DPD60Plus_L18M_EX_GL_CC_KCC = Ml.DPD60Plus_L18M_EX_GL_CC_KCC__c;
				Re.Total_Obligation = Ml.Total_Obligation__c;
                Re.No_of_suit_filed_Write_Off_36M = Ml.No_of_suit_filed_Write_Off_36M__c;
                Re.Only_Gold_Loan=ml.Only_Gold_Loan__c ;
                Re.Only_2_Wheeler=ml.Only_2_Wheeler__c ;
                Re.Only_Auto_Loan=ml.Only_Auto_Loan__c ;
                Re.Atleast_One_CC=ml.Atleast_One_CC__c ;
                Re.Atleast_One_CL=ml.Atleast_One_CL__c ;
                Re.Atleast_One_HL=ml.Atleast_One_HL__c ;
                Re.Atleast_One_PL=ml.Atleast_One_PL__c ;
                
                 //mapping  
                Re.delinquentexp = Ml.Delinquency_experiment__c;
                Re.greater10kflag = Ml.Greater_than_10k_dpd_flag__c;
                Re.less10kflag = Ml.Less_than_10k_dpd_flag__c;
             //ROI changes
                //system.debug('Temp_ROI_exp'+Temp_ROI_exp);
                //system.debug('Temp_Pl_currentBal'+Temp_Pl_currentBal);
                //system.debug('Temp_Pl_tradeline'+Decimal.valueOf(Temp_Pl_tradeline.replaceAll('-','')));
                Re.ROI_exp= Temp_ROI_exp;
                Re.Pl_currentBal= Temp_Pl_currentBal;
                if(Temp_Pl_tradeline == null) Temp_Pl_tradeline= '1990-01-01';
                Re.Pl_tradeline=Decimal.valueOf(Temp_Pl_tradeline.replaceAll('-',''));
                //system.debug('CloseDate'+ Re.Pl_tradeline);
               //ROI changes end
                //Re.DateProceed=Ml.Date_Proceed__c;
               Re.hl_sanction_max = HL_Derog_High_Credit_or_Sanctioned_Amount;
                Re.hl_date_close = HL_Derog_Date_Closed;
                Re.hl_acct_type = HL_Derog_Account_Type;
                Re.cc_sanction_max = CC_Derog_High_Credit_or_Sanctioned_Amount;
                Re.cc_credit_max = CC_Derog_Credit_Limit;
                Re.cc_Currbal_max = CC_Derog_Current_Balance;
                Re.pl_Currbal_max = PL_Derog_Current_Balance;
                Re.cc_acct_type = CC_Derog_Account_Type;
                Re.cc_date_close = CC_Derog_Date_Closed;
                Re.pl_date_close = PL_Derog_Date_Closed;
                Re.pl_sanction_max = PL_Derog_High_Credit_or_Sanctioned_Amount;
                Re.pl_acct_type = PL_Derog_Account_Type;
                Re.al_sanction_max = AL_Derog_High_Credit_or_Sanctioned_Amount;
                Re.bl_sanction_max = BL_Derog_High_Credit_or_Sanctioned_Amount;
                Re.twl_sanction_max = TWL_Derog_High_Credit_or_Sanctioned_Amount;
                Re.all_sanction_max = ALL_Derog_High_Credit_or_Sanctioned_Amount;
                Re.al_date_close = AL_Derog_Date_Closed;
                Re.bl_date_close = BL_Derog_Date_Closed;
                Re.twl_date_close = TWL_Derog_Date_Closed;
                Re.all_date_close = ALL_Derog_Date_Closed;
                Re.al_acct_type = AL_Derog_Account_Type;
                Re.bl_acct_type = BL_Derog_Account_Type;
                Re.twl_acct_type = TWL_Derog_Account_Type;
                Re.highdpdexcc= dpdre.highdpdexcc; 
                Re.kccoverduebal= dpdre.kccoverduebal;
                Re.odoverduebal= dpdre.odoverduebal;
                Re.kccodccoverdue= dpdre.kccodccoverdue;
                Re.blonemonenq= dpdre.blonemonenq;
                Re.plonemonenq= dpdre.plonemonenq;
                Re.nopla50m3= dpdre.nopla50m3;
                Re.nopla50m6= dpdre.nopla50m6;
                Re.Countofloans_vinatage18to36 = vintagecount;
                Re.ccoverdue = dpdre.ccoverdue;
                Re.hl_repayment_max=HL_Derog_Repayment_Months;
                Re.pl_repayment_max=PL_Derog_Repayment_Months;
                Re.cc_repayment_max=CC_Derog_Repayment_Months;
                   
                    /*Change01*/    Return Re;
                    /*Change01*/  }
            //system.debug('mal flag :'+mal.Live_CC_trade_line_Flag__c);
           // MultiBureauAccountList.add(mal);
            //system.debug('******'+Ml.id);
            //system.debug('*****Version :' +Ml.Version__c);
            //system.debug('mid : '+Ml);
            //system.debug('*****MultiBureauAccountList :' +MultiBureauAccountList);
            MSize = MultiBureauAccountList.size(); 
            //system.debug('******MSize'+MSize);
            for (Integer i = 0; i < MSize; i++) {
                MultiBureauAccountList[i].Multibureau__c = Ml.id;
                //system.debug('******I'+i);
            }
            MSize = MultiBureauAddressList.size(); 
            //system.debug('******MSize'+MSize);
            for (Integer i = 0; i < MSize; i++) {
                MultiBureauAddressList[i].Multibureau__c = Ml.id;
                //system.debug('******I'+i);
            }
            MSize = MultiBureauPhoneList.size(); 
            //system.debug('******MSize'+MSize);
            for (Integer i = 0; i < MSize; i++) {
                MultiBureauPhoneList[i].Multibureau__c = Ml.id;
                //system.debug('******I'+i);
            }
            MSize = MultiBureauEmploylist.size(); 
           // system.debug('******MSize'+MSize);
            for (Integer i = 0; i < MSize; i++) {
                MultiBureauEmploylist[i].Multibureau__c = Ml.id;
               // system.debug('******I'+i);
            }
            MSize = MultiBureauIdList.size(); 
            //system.debug('******MSize'+MSize);
            for (Integer i = 0; i < MSize; i++) {
                MultiBureauIdList[i].Multibureau__c = Ml.id;
                //system.debug('******I'+i);
            }
            MSize = MultiBureauEnqActNoList.size(); 
            //system.debug('******MSize'+MSize);
            for (Integer i = 0; i < MSize; i++) {
                MultiBureauEnqActNoList[i].Multibureau__c = Ml.id;
                //system.debug('******I'+i);
            }
            MSize = MultiBureauScoreList.size(); 
            //system.debug('******MSize'+MSize);
            for (Integer i = 0; i < MSize; i++) {
                MultiBureauScoreList[i].Multibureau__c = Ml.id;
                //system.debug('******I'+i);
            }
            MSize = MultiBureauEnquiryList.size(); 
            //system.debug('******MSize'+MSize);
            for (Integer i = 0; i < MSize; i++) {
                MultiBureauEnquiryList[i].Multibureau__c = Ml.id;
                //system.debug('******I'+i);
            }
            MSize = MultibureausecondaryMatcheslist.size(); 
            //system.debug('multi matches--'+MultibureausecondaryMatcheslist.size());
            //  Re.SecondaryCount = MSize;
            //system.debug('******MSize'+MSize);
            for (Integer i = 0; i < MSize; i++) {
                MultibureausecondaryMatcheslist[i].Multibureau__c = Ml.id;
                //system.debug('******I'+i);
            }
            MSize = CValgo_list.size(); 
            //system.debug('CV ALGOS '+CValgo_list);
            for (Integer i = 0; i < MSize; i++) {
                CValgo_list[i].Multibureau__c = Ml.id;
             
            }
            //system.debug('*****MultiBureauAccountList :' +MultiBureauAccountList);
            If (Returnflag !='Y') insert MultiBureauAccountList;
            //system.debug('*****MultiBureauPhoneList :' +MultiBureauPhoneList); 
            If (Returnflag !='Y') insert MultiBureauPhoneList;
            //system.debug('*****MultiBureauIdList :' +MultiBureauIdList); 
             If (Returnflag !='Y') insert MultiBureauEmploylist;
            If (Returnflag !='Y') insert MultiBureauIdList;
            //system.debug('*****MultiBureauEnqActNoList :' +MultiBureauEnqActNoList); 
            If (Returnflag !='Y') insert MultiBureauEnqActNoList;
            //system.debug('*****MultiBureauScoreList :' +MultiBureauScoreList); 
            If (Returnflag !='Y') insert MultiBureauScoreList;
            //system.debug('*****MultiBureauAddressList :' +MultiBureauAddressList); 
            If (Returnflag !='Y') insert MultiBureauAddressList;
            //system.debug('*****MultiBureauEnquiryList :' +MultiBureauEnquiryList); 
            If (Returnflag !='Y') insert MultiBureauEnquiryList;
            If (Returnflag !='Y') insert CValgo_list;
            //system.debug('*****MultibureausecondaryMatcheslist :' +MultibureausecondaryMatcheslist); 
            If (Returnflag !='Y') update MultibureausecondaryMatcheslist;
            
             if(DPD_cls.dpdcounts.size()>0 && Returnflag !='Y'){  
        for(String key: DPD_cls.dpdcounts.keyset())
         {
             Aggregatory_Object__c ag = new Aggregatory_Object__c();
             string s = key.left(3);
             ag.Type__c = s;
             ag.COUNT__c = DPD_cls.dpdcounts.get(key);
             ag.Number_of_Months__c = String.valueof(key.right(2)); // string
             ag.Multibureau__c = Ml.id;
             agglst.add(ag);
         }
         if(agglst != null && agglst.size()>0) insert agglst; 
    }
          
            
        } Else {
            
                
            If (Returnflag !='Y')   
            {   
            if(Ml!=null && Ml.id!=null){    
            update Ml;} 
                
            }
        }
        Return Re;
        //  Return FinalIScore;
    }
    
    // Inner classes used for serialization by readValuesAs() for idlist.
 /*   public class idList {
        public String idType;
        public String idValue;
        public String issueDate;
        public String expiryDate;
        public String enrichedThroughtEnquiry;
    } */
    
    // Inner classes used for serialization by readValuesAs() for phone list.
  /*  public class phonelist {
        public String telephoneNumber;
        public String telephoneExtention;
        public String telephoneType;
        public String enrichEnquiryForPhone;
    }*/
    
    // Inner classes used for serialization by readValuesAs() for enqActNoList.
    public class enqActNoList {
        public String accountNumber;
    } 
    // Inner classes used for serialization by readValuesAs() for scoreList.
   /* public class scoreList {
        public String scoreName;
        public Integer scoreCardName;
        public Integer scoreCardVersion;
        public String scoreDate;
        public String Score;
        public string exclusionCode1;
        public string exclusionCode2;
        public string exclusionCode3;
        public string exclusionCode4;
        public string exclusionCode5;
        public string exclusionCode6;
        public string exclusionCode7;
        public string exclusionCode8;
        public string exclusionCode9;
        public string exclusionCode10;
        public string reasonCode1;
        public string reasonCode2;
        public string reasonCode3;
        public string reasonCode4;
        public string reasonCode5;
        public Integer scoreErrorCode;
        Public String bureauCharacteristics1;
        Public String bureauCharacteristics2;
        Public String bureauCharacteristics3;
        Public String bureauCharacteristics4;
        Public String bureauCharacteristics5;
        Public String bureauCharacteristics6;
        
    } */
    // Inner classes used for serialization by readValuesAs() for address list.
   /* Public class addresslist {
        public String addressLine1;
        public String addressLine2;
        public String addressLine3;
        public String addressLine4;
        public String addressLine5;
        public Integer stateCode;
        public String pinCode;
        public String addressCategory; 
        public Integer residenceCode;
        public String dateReported;
        public String memberShortName;
        public String enrichedThroughtEnquiry;
    } */
    
    
    // Inner classes used for serialization by readValuesAs() for accountList.
  /*  public class accountList {
        public String reportingMemberShortName;
        public String accountNumber;
        public String accountType;
        public String ownershipIndicator;
        public String dateOpenedOrDisbursed;
        public String dateOfLastPayment;
        public String dateClosed; 
        public String dateReportedAndCertified;
        public integer highCreditOrSanctionedAmount; 
        public integer currentBalance; 
        public integer overdueAmount;
        public string paymentHistory1;
        public string paymentHistory2;
        public String paymentHistoryStartDate;
        public String paymentHistoryEndDate;
        public integer suitFiledOrWilfulDefault;
        public integer writtenOffAndSettledStatus;
        public integer valueOfCollateral;
        public string typeOfCollateral;
        public integer creditLimit; 
        public integer cashLimit;
        public double rateOfInterest;
        public integer repaymentTenure;
        public integer emiAmount;
        public integer writtenOffAmountTotal;
        public integer writtenOffAmountPrincipal;
        //    public integer writtenOffAmountPrincipal;
        public integer settlementAmount;
        public integer paymentFrequence;
        public integer actualPaymentAmount;
        public String dateOfEntryForErrorCode;
        public integer errorCode;
        public String dateOfEntryForCibilRemarksCode;
        public string cibilRemarkCode;
        public String dateOfEntryForErrorOrDisputeRemarksCode;
        public string errorOrDisputeRemarksCode1;
        public String errorOrDisputeRemarksCode2;
    } */
    // Inner classes used for serialization by readValuesAs() for enquiryList.
   /* Public class enquiryList {
        public String dateReported;
        public String reportingMemberShortName;
        public string enquiryPurpose;
        public Integer enquiryAmount;
    }*/
  /*  public Decimal calculateScore(Decimal clAmount, Decimal alAmount, Decimal plAmount, Decimal hlAmount,Decimal lapAmount){
        //system.debug('inside method score');
        Decimal ratingScore=0;
        if((plAmount>=0&&plAmount<=30000)||(alAmount>=0&&alAmount<=100000)||(clAmount>=0&&clAmount<=10000)||hlAmount>=0&&hlAmount<=500000||lapAmount>=0&&lapAmount<=500000) ratingScore += 0;
        if(plAmount>=30001&&plAmount<=200000) ratingScore += 1;
        if(alAmount>=100001&&alAmount<=200000) ratingScore += 1;
        if(clAmount>=10001&&clAmount<=20000) ratingScore += 1;
        if(hlAmount>=500001&&hlAmount<=800000) ratingScore += 1;
        if(lapAmount>=500001&&lapAmount<=800000) ratingScore += 1;
        if(plAmount>=200001&&plAmount<=300000) ratingScore += 2;
        if(alAmount>=200001&&alAmount<=400000) ratingScore += 2;
        if(clAmount>=20001&&clAmount<=40000) ratingScore += 2;
        if(hlAmount>=800001&&hlAmount<=1200000) ratingScore +=2;
        if(lapAmount>=800001&&lapAmount<=1200000) ratingScore += 2;        
        if(plAmount>=300001&&plAmount<=500000) ratingScore +=3;
        if(alAmount>=400001&&alAmount<=600000) ratingScore +=3;
        if(clAmount>=40001&&clAmount<=75000) ratingScore +=3;
        if(hlAmount>=1200001&&hlAmount<=2000000) ratingScore +=3;
        if(lapAmount>=1200001&&lapAmount<=2000000) ratingScore += 3;
        if(plAmount>=500001&&plAmount<=750000) ratingScore +=4;
        if(alAmount>=600001&&alAmount<=800000) ratingScore +=4;
        if(clAmount>=75001&&clAmount<=100000) ratingScore +=4;
        if(hlAmount>=2000001&&hlAmount<=3000000) ratingScore +=4;
        if(lapAmount>=2000001&&lapAmount<=3000000) ratingScore += 4;
        if(plAmount>=750001) ratingScore +=5;
        if(alAmount>=800001) ratingScore +=5;
        if(clAmount>=100001) ratingScore +=5;
        if(hlAmount>=3000001) ratingScore +=5;
        if(lapAmount>=3000001) ratingScore += 5;
        //system.debug('rating score:'+ratingScore);
        return ratingScore;
    }
*/     
    public Decimal calculateScore(Decimal clAmount, Decimal alAmount, Decimal plAmount, Decimal hlAmount,Decimal lapAmount){
     decimal ratingscore= jsonParsingHelper.calculateScore( clAmount,  alAmount,  plAmount,  hlAmount, lapAmount);
        return ratingscore;
    }
    
     public String getCustomerProfile(list <MultiBureau_AccountList__c> MultiBureauAccountList)
    {
    string profile = jsonParsingHelper.getCustomerProfile( MultiBureauAccountList);
    return profile;
    
    }
//commented the below method as multibureau field logic
     //public String getCustomerProfile(Decimal liveloans,Decimal amount,Integer repayment,Decimal score)
  /*   public String getCustomerProfile(list <MultiBureau_AccountList__c> MultiBureauAccountList){
       // /*String profile;
       // if(liveloans >=1 && amount>=40000 && repayment >=12){
       //    profile='Bureau Thick';
        // }else if(score <=10){
        //   profile='Bureau NTC';
        // }else{
        //   profile='Bureau Thin';
      //  }
      //  return profile;
         
        String profile='';
        Integer MSize = MultiBureauAccountList.size(); 
        Decimal HL_MAX=0,CC_MAX=0,AL_MAX=0,BL_MAX=0,TWL_MAX=0,PL_MAX=0,OTL_MAX=0,RPT_MAX=0;
        Decimal CC_max1=0,CC_max2=0,CC_sanctionamount=0,CC_creditlimit=0,CC_currentbalance=0;
        for(Integer i=0;i<MSize;i++)
        {
            Integer cal=0;
            if(MultiBureauAccountList[i].Date_Closed__c != null){
                cal = (((system.today().year() - MultiBureauAccountList[i].Date_Closed__c.year())*12) + (Date.today().month() - MultiBureauAccountList[i].Date_Closed__c.month()));
            }
            Decimal Repayment_Months=0;
            Decimal length1=0,length2=0;
            if(MultiBureauAccountList[i].Payment_History_1__c!=null)
                length1=(MultiBureauAccountList[i].Payment_History_1__c).length();
            if(MultiBureauAccountList[i].Payment_History_2__c!=null)
                length2=(MultiBureauAccountList[i].Payment_History_2__c).length();
            Repayment_Months=(length1+length2)/3;
            RPT_MAX=math.max(RPT_MAX,Repayment_Months);
            //system.debug('Repayment_Months '+ Repayment_Months);
            if(((MultiBureauAccountList[i].Date_Closed__c != null && cal <=36)||MultiBureauAccountList[i].Date_Closed__c == null))
            {
                if((MultiBureauAccountList[i].Account_Type__c == '2' || MultiBureauAccountList[i].Account_Type__c == '02'|| MultiBureauAccountList[i].Account_Type__c == '3' ||MultiBureauAccountList[i].Account_Type__c == '03') && MultiBureauAccountList[i].High_Credit_or_Sanctioned_Amount__c>HL_MAX)  //Home Loans
                {
                    HL_MAX = MultiBureauAccountList[i].High_Credit_or_Sanctioned_Amount__c;
                }
                else if(MultiBureauAccountList[i].Account_Type__c == '10') //credit Card
                {
                    if(MultiBureauAccountList[i].High_Credit_or_Sanctioned_Amount__c != null)CC_sanctionamount = MultiBureauAccountList[i].High_Credit_or_Sanctioned_Amount__c;
                    if(MultiBureauAccountList[i].Credit_Limit__c != null)CC_creditlimit = MultiBureauAccountList[i].Credit_Limit__c;
                    if(MultiBureauAccountList[i].Current_balance__c != null)CC_currentbalance =MultiBureauAccountList[i].Current_balance__c;       
                    CC_max1 = math.max(CC_sanctionamount,CC_creditlimit);
                    CC_max2 = math.max(CC_max1,CC_currentbalance);                                                
                    CC_MAX=math.max(CC_MAX,CC_max2);   
                }
                else if((MultiBureauAccountList[i].Account_Type__c == '01' || MultiBureauAccountList[i].Account_Type__c == '1') && MultiBureauAccountList[i].High_Credit_or_Sanctioned_Amount__c>AL_MAX)  // Auto Loan
                {
                    AL_MAX=MultiBureauAccountList[i].High_Credit_or_Sanctioned_Amount__c;
                }
                else if((MultiBureauAccountList[i].Account_Type__c == '50' || MultiBureauAccountList[i].Account_Type__c == '51' || MultiBureauAccountList[i].Account_Type__c == '52' || MultiBureauAccountList[i].Account_Type__c == '55' || MultiBureauAccountList[i].Account_Type__c == '59' || MultiBureauAccountList[i].Account_Type__c == '61' || MultiBureauAccountList[i].Account_Type__c == '12') && MultiBureauAccountList[i].High_Credit_or_Sanctioned_Amount__c>BL_MAX)  //Business Loan
                {
                    BL_MAX=MultiBureauAccountList[i].High_Credit_or_Sanctioned_Amount__c;
                }
                else if(MultiBureauAccountList[i].Account_Type__c == '13' && MultiBureauAccountList[i].High_Credit_or_Sanctioned_Amount__c>TWL_MAX) //Two Wheeler loan
                {
                    TWL_MAX=MultiBureauAccountList[i].High_Credit_or_Sanctioned_Amount__c;
                }
                else if((MultiBureauAccountList[i].Account_Type__c == '05' || MultiBureauAccountList[i].Account_Type__c == '5') && MultiBureauAccountList[i].High_Credit_or_Sanctioned_Amount__c>PL_MAX)  // Personal Loan
                {
                    PL_MAX=MultiBureauAccountList[i].High_Credit_or_Sanctioned_Amount__c;
                }
                else if((MultiBureauAccountList[i].Account_Type__c == '6' || MultiBureauAccountList[i].Account_Type__c == '06' || MultiBureauAccountList[i].Account_Type__c == '8' || MultiBureauAccountList[i].Account_Type__c == '08' || MultiBureauAccountList[i].Account_Type__c == '17') && MultiBureauAccountList[i].High_Credit_or_Sanctioned_Amount__c>OTL_MAX)  //other tradelines
                {
                    OTL_MAX=MultiBureauAccountList[i].High_Credit_or_Sanctioned_Amount__c;
                }
            }
        }
        map<string,decimal> bureau_profile_map = new map<string,decimal>();
        bureau_profile_map.put('HomeLoan',HL_MAX);
        bureau_profile_map.put('CreditCard',CC_MAX );
        bureau_profile_map.put('AutoLoan',AL_MAX);
        bureau_profile_map.put('BusinessLoan',BL_MAX);
        bureau_profile_map.put('TwoWheelerLoan',TWL_MAX);
        bureau_profile_map.put('PersonalLoan',PL_MAX);
        bureau_profile_map.put('OtherLoan',OTL_MAX);
        //system.debug('bureau_profile_map ' +bureau_profile_map);
        if(RPT_MAX<10)
        {
            profile='Bureau Thin';
            return profile;
        }
        else
        {
            for(String key : bureau_profile_map.keySet())
            {
                Decimal value=bureau_profile_map.get(key);
                if(key=='HomeLoan' && value>=1000000)
                {
                    profile='Bureau Thick';
                    break;
                }
                else if(key=='CreditCard' && value>0)
                {
                    profile='Bureau Thick';
                    break;
                }
                else if(key=='AutoLoan' && value>=200000)
                {
                    profile='Bureau Thick';
                    break;
                }
                else if(key=='BusinessLoan' && value>=200000)
                {
                    profile='Bureau Thick';
                    break;
                }
                else if(key=='TwoWheelerLoan' && value>=50000)
                {
                    profile='Bureau Thick';
                    break;
                }
                else if(key=='PersonalLoan' && value>=25000)
                {
                    profile='Bureau Thick';
                    break;
                }
                else if(key=='OtherLoan' && value>=200000)
                {
                    profile='Bureau Thick';
                    break;
                }
            }
            if(profile=='' || profile==null)
                profile='Bureau Thin'; 
            return profile;
        }
     }*/
}