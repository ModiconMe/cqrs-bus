package com.modiconme.cqrsbus;

public interface CommandHandler<R, C extends Command<R>>{

    R handle(C command);

}
