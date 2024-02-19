package com.loan.bean;

/**
 * 数据实体类
 */
public class Data {

    private Integer id;
    private Integer age;
    private Integer income;
    private Integer loan_amount;
    private Integer credit_score;
    private Integer months_employed;
    private Integer num_credit_lines;
    private Double interest_rate;
    private Integer loan_term;
    private Double d_t_i_ratio;
    private Integer education;
    private Integer employment_type;
    private Integer marital_status;
    private Boolean has_mortgage;
    private Boolean has_dependents;
    private Boolean has_co_signer;
    private Integer prediction;
    private Integer actual;


    public Data() {
    }

    public Data(Integer id, Integer Age, Integer Income, Integer loan_amount, Integer CreditScore, Integer MonthsEmployed,
                Integer NumCreditLines, Double InterestRate, Integer LoanTerm, Double DTIRatio, Integer Education,
                Integer EmploymentType, Integer MaritalStatus, Boolean HasMortgage, Boolean HasDependents,
                Boolean HasCoSigner, Integer Prediction, Integer Actual) {
        this.id = id;
        this.age = Age;
        this.income = Income;
        this.loan_amount = loan_amount; // 修改为驼峰命名规范的LoanAmount
        this.credit_score = CreditScore; // 修改为驼峰命名规范的CreditScore
        this.months_employed = MonthsEmployed; // 修改为下划线分隔命名规范的MonthsEmployed
        this.num_credit_lines = NumCreditLines; // 修改为下划线分隔命名规范的NumCreditLines
        this.interest_rate = InterestRate; // 修改为下划线分隔命名规范的InterestRate
        this.loan_term = LoanTerm; // 修改为下划线分隔命名规范的LoanTerm
        this.d_t_i_ratio = DTIRatio; // 修改为下划线分隔命名规范的DTIRatio
        this.education = Education;
        this.employment_type = EmploymentType;
        this.marital_status = MaritalStatus;
        this.has_mortgage = HasMortgage; // 修改为下划线分隔命名规范的HasMortgage
        this.has_dependents = HasDependents; // 修改为下划线分隔命名规范的HasDependents
        this.has_co_signer = HasCoSigner; // 修改为下划线分隔命名规范的HasCoSigner
        this.prediction = Prediction;
        this.actual = Actual;

    }

    // Getter and setter methods for all fields

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer Age) {
        this.age = Age;
    }

    public Integer getIncome() {
        return income;
    }

    public void setIncome(Integer Income) {
        this.income = Income;
    }

    public Integer getLoan_amount() {
        return loan_amount;
    }

    public void setLoanAmount(Integer LoanAmount) {
        this.loan_amount = LoanAmount;
    }

    public Integer getCredit_score() {
        return credit_score;
    }

    public void setCreditScore(Integer CreditScore) {
        this.credit_score = CreditScore;
    }

    public Integer getMonths_employed() {
        return months_employed;
    }

    public void setMonthsEmployed(Integer MonthsEmployed) {
        this.months_employed = MonthsEmployed;
    }

    public Integer getNum_credit_lines() {
        return num_credit_lines;
    }

    public void setNumCreditLines(Integer NumCreditLines) {
        this.num_credit_lines = NumCreditLines;
    }

    public Double getInterest_rate() {
        return interest_rate;
    }

    public void setInterestRate(Double Interest_rate) {
        this.interest_rate = Interest_rate;
    }

    public Integer getLoan_term() {
        return loan_term;
    }

    public void setLoanTerm(Integer LoanTerm) {
        this.loan_term = LoanTerm;
    }

    public Double getD_t_i_ratio() {
        return d_t_i_ratio;
    }

    public void setD_t_i_ratio(Double DTIRatio) {
        this.d_t_i_ratio = DTIRatio;
    }

    public Integer getEducation() {
        return education;
    }

    public void setEducation(Integer Education) {
        this.education = Education;
    }

    public Integer getEmployment_type() {
        return employment_type;
    }

    public void setEmploymentType(Integer EmploymentType) {
        this.employment_type = EmploymentType;
    }

    public Integer getMarital_status() {
        return marital_status;
    }

    public void setMaritalStatus(Integer MaritalStatus) {
        this.marital_status = MaritalStatus;
    }

    public Boolean getHas_mortgage() {
        return has_mortgage;
    }

    public void setHasMortgage(Boolean HasMortgage) {
        this.has_mortgage = HasMortgage;
    }

    public Boolean getHas_dependents() {
        return has_dependents;
    }

    public void setHasDependents(Boolean HasDependents) {
        this.has_dependents = HasDependents;
    }

    public Boolean getHas_co_signer() {
        return has_co_signer;
    }

    public void setHasCoSigner(Boolean HasCoSigner) {
        this.has_co_signer = HasCoSigner;
    }

    public Integer getPrediction() {
        return prediction;
    }

    public void setPrediction(Integer Prediction) {
        this.prediction = Prediction;
    }

    public Integer getActual() {
        return actual;
    }

    public void setActual(Integer Actual) {
        this.actual = Actual;
    }
}
