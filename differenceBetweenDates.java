try {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    Date firstDate = sdf.parse("2000-01-01");
    Date secondDate = sdf.parse("2000-12-31");
    secondDate.setTime(secondDate.getTime()+24*60*60*1000-1); //To be more precise add 1day-1millisec (to have the entire last day)
    int diffInDays = (int)((secondDate.getTime() - firstDate.getTime())/ (1000 * 60 * 60 * 24));
    System.out.println(diffInDays);
}catch(ParseException e){
    System.err.println("Incorrect date format");
}
