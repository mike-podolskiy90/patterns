package com.mix.patterns.gof.behavioral.command;

/*
APPLICABILITY

Use the Command pattern when you want to

- parameterize objects by an action to perform.
You can express such parameterization in a procedural language with a callback function, that is, a function that's registered somewhere to be called at a later point.
Commands are an object-oriented replacement for callbacks.
- specify, queue, and execute requests at different times.
A Command object can have a lifetime independent of the original request.
If the receiver of a request can be represented in an address space-independent way, then you can transfer a command object for the request to a different process and fulfill the request there
- support undo.
The Command's execute operation can store state for reversing its effects in the command itself.
The Command interface must have an added Unexecute operation that reverses the effects of a previous call to execute.
Executed commands are stored in a history list.
Unlimited-level undo and redo is achieved by traversing this list backwards and forwards calling unexecute and execute, respectively
- support logging changes so that they can be reapplied in case of a system crash.
By augmenting the Command interface with load and store operations, you can keep a persistent log of changes.
Recovering from a crash involves reloading logged commands from disk and re-executing them with the execute operation
- structure a system around high-level operations build on primitive operations.
Such a structure is common in information systems that support transactions.
A transaction encapsulates a set of changes to data.
The Command pattern offers a way to model transactions.
Commands have a common interface, letting you invoke all transactions the same way.
The pattern also makes it easy to extend the system with new transactions


TYPICAL USE CASE

to keep a history of requests
implement callback functionality
implement the undo functionality

 */